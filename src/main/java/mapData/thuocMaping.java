package mapData;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.thuocModel;

public class thuocMaping implements iMap<thuocModel> {
	public thuocModel map(ResultSet rs) {
		try {
			int idThuoc = rs.getInt("idThuoc");
			int idLoaiThuoc = rs.getInt("idLoaiThuoc");
			String tenThuoc = rs.getNString("tenThuoc");
			int soLuong = rs.getInt("soLuong");
			int lieuDungTu18 = rs.getInt("lieuDungTu18");
			int lieuDungNhoHon18 = rs.getInt("lieuDungNhoHon18");
			String donVi = rs.getNString("donVi");
			Date ngayHetHan = rs.getDate("ngayHetHan");
			thuocModel newThuoc = new thuocModel(idThuoc, idLoaiThuoc, tenThuoc, soLuong, lieuDungTu18, lieuDungNhoHon18, donVi, ngayHetHan);
			return newThuoc;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
