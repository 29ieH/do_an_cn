package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import daoI.IDAO;
import helper.connectDB;
import mapData.iMap;

public class AbstracDAO<T> implements IDAO<T>{
	public AbstracDAO() {};
	public Connection getCon() {
		Connection con = null;
		try {
			con = connectDB.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	public List<T> query(String sql, iMap<T> t, Object... parameter) {
		List<T> result = new ArrayList<T>();
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			con = getCon();
			pst = con.prepareStatement(sql);
			setParameter(pst,parameter);
			rs = pst.executeQuery();
			while(rs.next()) {
				result.add(t.map(rs));
			}
			return result;
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
		return null;
	}
	private void setParameter(PreparedStatement pst, Object[] parameter) {
		int index = 0;
		for (int i = 0; i < parameter.length; i++) {
			index = i+1;
			Object paras = parameter[i];
			try {
				if(paras instanceof String) {
					pst.setNString(index, (String)paras);
				}
				if(paras instanceof Integer) {
					pst.setInt(index, (Integer)paras);
				}
				if(paras instanceof Float) {
					pst.setFloat(index, (Float)paras);
				}
				if(paras instanceof java.sql.Date) {
					pst.setDate(index, (java.sql.Date)paras);
				}
				if(paras instanceof Timestamp) {
					pst.setTimestamp(index, (Timestamp)paras);
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
	
}
