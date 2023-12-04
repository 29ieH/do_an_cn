package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import daoI.IbenhNhanDAO;
import helper.connectDB;
import mapData.benhNhanMaping;
import model.benhNhanModel;
import model.hoSoBenhNhanModel;

public class benhNhanDAO extends AbstracDAO<benhNhanModel> implements IbenhNhanDAO {

	public List<benhNhanModel> listAll() {
		String sql ="select * from benhNhan";
		return query(sql, new benhNhanMaping());
	}
	
	public List<benhNhanModel> info(hoSoBenhNhanModel hs) {
		String sql = "select bn.idBenhNhan, bn.tenBenhNhan, bn.tuoi, gioiTinh, bn.diaChi, soDienThoai, daTungDenKham "
				+ "from benhNhan as bn join hoSoBenhNhan as hsbn on hsbn.idBenhNhan = bn.idBenhNhan \r\n" + 
				"where idHoSoBenhNhan = ?";
		return query(sql, new benhNhanMaping(), hs.getIdHoSoBenhNhan());
	}
	
	public static void main(String[] args) {
		hoSoBenhNhanModel hsbn = new hoSoBenhNhanModel();
		hsbn.setIdHoSoBenhNhan(1);
		List<benhNhanModel> result = new benhNhanDAO().listAll();
	for (benhNhanModel benhNhanModel : result) {
		System.out.println(benhNhanModel.toString());
	}
	}

}
