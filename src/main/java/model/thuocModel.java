package model;

import java.sql.Date;
import java.sql.Timestamp;

public class thuocModel {
	private int idThuoc;
	private int idLoaiThuoc;
	private String tenThuoc;
	private int soLuong;
	private int soLuongMua;
	private String danDoTuBacSy;
	private int lieuDungTu18;
	private float lieuDungNhoHon18;
	private String donVi;
	private Date ngayHetHan;
	private Date ngayKeDon;
	
	
	public thuocModel() {};
	public thuocModel(int idThuoc, String tenThuoc, int soLuongMua,Date ngayHetHan) {
		this.idThuoc = idThuoc;
		this.tenThuoc = tenThuoc;
		this.soLuongMua = soLuongMua;
		this.ngayHetHan = ngayHetHan;
	}

	public thuocModel(int idThuoc, int idLoaiThuoc, String tenThuoc, int soLuong, int lieuDungTu18,
			float lieuDungNhoHon18, String donVi, Date ngayHetHan) {
		this.idThuoc = idThuoc;
		this.idLoaiThuoc = idLoaiThuoc;
		this.tenThuoc = tenThuoc;
		this.soLuong = soLuong;
		this.lieuDungTu18 = lieuDungTu18;
		this.lieuDungNhoHon18 = lieuDungNhoHon18;
		this.donVi = donVi;
		this.ngayHetHan = ngayHetHan;
	}
	
	public thuocModel(int idThuoc, int idLoaiThuoc, String tenThuoc,int soLuong,int soLuongMua, String danDoTuBacSy, int lieuDungTu18,
			float lieuDungNhoHon18, String donVi, Date ngayKeDon) {
		this.idThuoc = idThuoc;
		this.idLoaiThuoc = idLoaiThuoc;
		this.tenThuoc = tenThuoc;
		this.soLuongMua = soLuongMua;
		this.soLuong = soLuong;
		this.danDoTuBacSy = danDoTuBacSy;
		this.lieuDungTu18 = lieuDungTu18;
		this.lieuDungNhoHon18 = lieuDungNhoHon18;
		this.donVi = donVi;
		this.ngayKeDon = ngayKeDon;
	}
	public int getIdThuoc() {
		return idThuoc;
	}

	public void setIdThuoc(int idThuoc) {
		this.idThuoc = idThuoc;
	}
	public int getIdLoaiThuoc() {
		return idLoaiThuoc;
	}

	public void setIdLoaiThuoc(int idLoaiThuoc) {
		this.idLoaiThuoc = idLoaiThuoc;
	}

	public String getTenThuoc() {
		return tenThuoc;
	}

	public void setTenThuoc(String tenThuoc) {
		this.tenThuoc = tenThuoc;
	}
	
	public Date getNgayKeDon() {
		return ngayKeDon;
	}
	public void setNgayKeDon(Date ngayKeDon) {
		this.ngayKeDon = ngayKeDon;
	}
	
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public int getSoLuongMua() {
		return soLuongMua;
	}
	public void setSoLuongMua(int soLuongMua) {
		this.soLuongMua = soLuongMua;
	}
	public int getsoLuongMua() {
		return soLuongMua;
	}

	public void setsoLuongMua(int soLuongMua) {
		this.soLuongMua = soLuongMua;
	}


	public String getDanDoTuBacSy() {
		return danDoTuBacSy;
	}

	public void setDanDoTuBacSy(String danDoTuBacSy) {
		this.danDoTuBacSy = danDoTuBacSy;
	}
	public int getLieuDungTu18() {
		return lieuDungTu18;
	}

	public void setLieuDungTu18(int lieuDungTu18) {
		this.lieuDungTu18 = lieuDungTu18;
	}

	public float getLieuDungNhoHon18() {
		return lieuDungNhoHon18;
	}

	public void setLieuDungNhoHon18(float lieuDungNhoHon18) {
		this.lieuDungNhoHon18 = lieuDungNhoHon18;
	}

	public String getDonVi() {
		return donVi;
	}

	public void setDonVi(String donVi) {
		this.donVi = donVi;
	}

	public Date getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(Date ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}

	@Override
	public String toString() {
		return "thuocModel [idThuoc=" + idThuoc + ", idLoaiThuoc=" + idLoaiThuoc + ", tenThuoc=" + tenThuoc
				+ ", soLuongMua=" + soLuongMua + ", lieuDungTu18=" + lieuDungTu18 + ", lieuDungNhoHon18=" + lieuDungNhoHon18
				+ ", donVi=" + donVi + ", ngayHetHan=" + ngayHetHan + "]";
	}
	
	
}
