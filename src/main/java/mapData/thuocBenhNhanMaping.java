package mapData;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import model.benhNhanModel;
import model.thuocModel;

public class thuocBenhNhanMaping implements iMap<thuocModel> {

	public thuocModel map(ResultSet rs) {
		try {
			int idThuoc = rs.getInt("idThuoc");
			int idLoaiThuoc = rs.getInt("idLoaiThuoc");
			String tenThuoc = rs.getNString("tenThuoc");
			int soLuong = rs.getInt("soLuong");
			int soLuongMua = rs.getInt("soLuongMua");
			String danDo = rs.getNString("danDoBacSy");
			int lieuDungTu18 = rs.getInt("lieuDungTu18");
			int lieuDungNhoHon18 = rs.getInt("lieuDungNhoHon18");
			String donVi = rs.getNString("donVi");
			Date ngayKeDon = rs.getDate("ngayKeDon");
			thuocModel newThuoc = new thuocModel(idThuoc, idLoaiThuoc, tenThuoc,soLuong,soLuongMua, danDo, lieuDungTu18, lieuDungNhoHon18, donVi,ngayKeDon);
			return newThuoc;
		} catch (SQLException e) {
			return null;
		}
	}

}
