package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import daoI.IhoSoBenhNhanDAO;
import helper.connectDB;
import model.benhNhanModel;
import model.hoSoBenhNhanModel;

public class hoSoBenhNhanDAO implements IhoSoBenhNhanDAO {

	public List<hoSoBenhNhanModel> listAll() {
		List<hoSoBenhNhanModel> result = new ArrayList<hoSoBenhNhanModel>();
		List<benhNhanModel> resultBN = new benhNhanDAO().listAll();
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			con = connectDB.getConnection();
			String sql = "select * from hoSoBenhNhan where idBenhNhan = ?";
			if(resultBN!=null) {
				for (benhNhanModel benhNhanModel : resultBN) {
					pst = con.prepareStatement(sql);
					pst.setInt(1, benhNhanModel.getIdBenhNhan());
					rs = pst.executeQuery();
					while(rs.next()) {
						int idHoSoBenhNhan = rs.getInt("idHoSoBenhNhan");
						String benhLy = rs.getNString("benhLy");
						Timestamp ngayKham = rs.getTimestamp("ngayKham");
						hoSoBenhNhanModel hsnn = new hoSoBenhNhanModel(idHoSoBenhNhan,
						benhNhanModel.getIdBenhNhan(), benhNhanModel.getTenBenhNhan(), 
						benhNhanModel.getTuoi(), benhNhanModel.getDiaChi(), benhLy, ngayKham);
						result.add(hsnn);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null) {
					con.close();
				}
				if(pst!=null) {
					pst.close();
				}
				if(rs!=null) {
					rs.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}
	public List<hoSoBenhNhanModel> listOfName(String name) {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<hoSoBenhNhanModel> result = new ArrayList<hoSoBenhNhanModel>();
		try {
			con = connectDB.getConnection();
			String sql = "select * from hoSoBenhNhan where tenBenhNhan like ?";
			pst = con.prepareStatement(sql);
			pst.setString(1,"%"+name+"%");
			rs = pst.executeQuery();
			while(rs.next()) {
				int idHoSoBenhNhan = rs.getInt("idHoSoBenhNhan");
				int idBenhNhan = rs.getInt("idBenhNhan");
				String tenBenhNhan = rs.getNString("tenBenhNhan");
				int tuoi = rs.getInt("tuoi");
				String diaChi = rs.getNString("diaChi");
				String benhLy = rs.getNString("benhLy");
				Timestamp ngayKham = rs.getTimestamp("ngayKham");
				hoSoBenhNhanModel hsbn = new hoSoBenhNhanModel(idHoSoBenhNhan, idBenhNhan,
					tenBenhNhan, tuoi, diaChi, benhLy, ngayKham);
				result.add(hsbn);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(con!=null) {
					con.close();
				}
				if(pst!=null) {
					pst.close();
				}
				if(rs!=null) {
					rs.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}	
	public static void main(String[] args) {
//		List<hoSoBenhNhanModel> lisths = new hoSoBenhNhanDAO().listAll();
//		for (hoSoBenhNhanModel hoSoBenhNhanModel : lisths) {
//			System.out.println(hoSoBenhNhanModel.toString());
//		}
		String t = "Phạm Thị Nhung";
		List<hoSoBenhNhanModel> hsbn = new hoSoBenhNhanDAO().listOfName(t);
		if(hsbn!=null) {
			for (hoSoBenhNhanModel hs : hsbn) {
				System.out.println(hs.toString());
			}
		}else {
			System.out.println("Không có");
		}
	}
}
