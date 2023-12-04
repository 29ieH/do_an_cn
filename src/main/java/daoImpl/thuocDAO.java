package daoImpl;

import java.io.BufferedReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import daoI.IthuocDAO;
import helper.connectDB;
import mapData.thuocBenhNhanMaping;
import mapData.thuocMaping;
import model.hoSoBenhNhanModel;
import model.thuocModel;

public class thuocDAO extends AbstracDAO<thuocModel> implements IthuocDAO  {

	public List<thuocModel> listAll() {
		String sql = "select * from thuoc";
		return query(sql, new thuocMaping());
	}
	public List<thuocModel> findByIdHoSoBenhNhan(hoSoBenhNhanModel hsbn) {
		String sql = "select t.idThuoc,idLoaiThuoc,t.tenThuoc,soLuong,soLuongMua,danDoBacSy,lieuDungTu18,lieuDungNhoHon18,donVi,ngayKeDon "
				+ "from chiTietDonThuoc as ctdt join donThuoc as dt on dt.idDonThuoc = ctdt.idDonThuoc join thuoc as t on t.idThuoc = ctdt.idThuoc \r\n" + 
				"join hoSoBenhNhan as hsbn on hsbn.idHoSoBenhNhan = dt.idHoSoBenhNhan where hsbn.idHoSoBenhNhan = ?";
		return query(sql, new thuocBenhNhanMaping(), hsbn.getIdHoSoBenhNhan());
	}
	public static void main(String[] args) {
		hoSoBenhNhanModel hsbn = new hoSoBenhNhanModel();
		hsbn.setIdHoSoBenhNhan(1);
		List<thuocModel> listAll = new thuocDAO().findByIdHoSoBenhNhan(hsbn);
		int n = 0;
		for (thuocModel thuocModel : listAll) {
			n = thuocModel.getSoLuong();
		}
		System.out.println(n);
	}

}
