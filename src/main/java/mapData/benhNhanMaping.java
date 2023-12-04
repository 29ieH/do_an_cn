package mapData;

import java.sql.ResultSet;

import model.benhNhanModel;

public class benhNhanMaping implements iMap<benhNhanModel> {

	public benhNhanModel map(ResultSet rs) {
		try {
			int idBenhNhan = rs.getInt("idBenhNhan");
			String tenBenhNhan = rs.getNString("tenBenhNhan");
			int tuoi = rs.getInt("tuoi");
			String gioiTinh = rs.getNString("gioiTinh");
			String diaChi = rs.getNString("diaChi");
			String soDienThoai = rs.getString("soDienThoai");
			int daTungDenKham = rs.getInt("daTungDenKham");
			benhNhanModel newBN = new benhNhanModel(idBenhNhan, tenBenhNhan, tuoi, gioiTinh, diaChi, soDienThoai, daTungDenKham);
			return newBN;
		} catch (Exception e) {
			return null;
		}
	}
	
}
