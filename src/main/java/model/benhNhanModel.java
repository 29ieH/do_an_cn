package model;

public class benhNhanModel {
	private int idBenhNhan;
	private String tenBenhNhan;
	private int tuoi;
	private String gioiTinh;
	private String diaChi;
	private String soDienThoai;
	private int daTungDenKham;
	
	public benhNhanModel() {}

	public benhNhanModel(int idBenhNhan, String tenBenhNhan, int tuoi, String gioiTinh
			, String diaChi,String soDienThoai, int daTungDenKham) {
		this.idBenhNhan = idBenhNhan;
		this.tenBenhNhan = tenBenhNhan;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
		this.daTungDenKham = daTungDenKham;
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

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public int getDaTungDenKham() {
		return daTungDenKham;
	}

	public void setDaTungDenKham(int daTungDenKham) {
		this.daTungDenKham = daTungDenKham;
	}

	@Override
	public String toString() {
		return "benhNhanModel [idBenhNhan=" + idBenhNhan + ", tenBenhNhan=" + tenBenhNhan + ", tuoi=" + tuoi
				+ ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + ", soDienThoai=" + soDienThoai + ", daTungDenKham="
				+ daTungDenKham + "]";
	}
	
	

}
