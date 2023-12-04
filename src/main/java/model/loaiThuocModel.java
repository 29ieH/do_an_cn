package model;

public class loaiThuocModel {
private int idLoaiThuoc;
private String tenLoaiThuoc;

	public loaiThuocModel() {}

	public loaiThuocModel(int idLoaiThuoc, String tenLoaiThuoc) {
		super();
		this.idLoaiThuoc = idLoaiThuoc;
		this.tenLoaiThuoc = tenLoaiThuoc;
	}

	public int getIdLoaiThuoc() {
		return idLoaiThuoc;
	}

	public void setIdLoaiThuoc(int idLoaiThuoc) {
		this.idLoaiThuoc = idLoaiThuoc;
	}

	public String getTenLoaiThuoc() {
		return tenLoaiThuoc;
	}

	public void setTenLoaiThuoc(String tenLoaiThuoc) {
		this.tenLoaiThuoc = tenLoaiThuoc;
	}	

}
