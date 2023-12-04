package model;

import java.sql.Timestamp;

public class hoSoBenhNhanModel {
	private int idHoSoBenhNhan;
	private int idBenhNhan;
	private String tenBenhNhan;
	private int tuoi;
	private String diaChi;
	private String benhLy;
	private Timestamp ngayKham;
	
	public hoSoBenhNhanModel() {}
	public hoSoBenhNhanModel(int idHoSoBenhNhan, int idBenhNhan, String tenBenhNhan, int tuoi, String diaChi,
			String benhLy, Timestamp ngayKham) {
		this.idHoSoBenhNhan= idHoSoBenhNhan;
		this.idBenhNhan = idBenhNhan;
		this.tenBenhNhan = tenBenhNhan;
		this.tuoi = tuoi;
		this.diaChi = diaChi;
		this.benhLy = benhLy;
		this.ngayKham = ngayKham;
	}

	public int getIdHoSoBenhNhan() {
		return idHoSoBenhNhan;
	}

	public void setIdHoSoBenhNhan(int idHoSoBenhNhan) {
		this.idHoSoBenhNhan = idHoSoBenhNhan;
	}

	public int getIdBenhNhan() {
		return idBenhNhan;
	}

	public void setIdBenhNhan(int idBenhNhan) {
		this.idBenhNhan = idBenhNhan;
	}

	public String getTenBenhNhan() {
		return tenBenhNhan;
	}

	public void setTenBenhNhan(String tenBenhNhan) {
		this.tenBenhNhan = tenBenhNhan;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getBenhLy() {
		return benhLy;
	}

	public void setBenhLy(String benhLy) {
		this.benhLy = benhLy;
	}

	public Timestamp getNgayKham() {
		return ngayKham;
	}

	public void setNgayKham(Timestamp ngayKham) {
		this.ngayKham = ngayKham;
	}

	@Override
	public String toString() {
		return "hoSoBenhNhanModel [hoSoBenhNhan=" + idBenhNhan + ", idBenhNhan=" + idBenhNhan + ", tenBenhNhan="
				+ tenBenhNhan + ", tuoi=" + tuoi + ", diaChi=" + diaChi + ", benhLy=" + benhLy + ", ngayKham="
				+ ngayKham + "]";
	}
	
	
}
