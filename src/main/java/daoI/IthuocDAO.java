package daoI;

import java.util.List;

import model.hoSoBenhNhanModel;
import model.thuocModel;

public interface IthuocDAO {
	public List<thuocModel> listAll();
	public List<thuocModel> findByIdHoSoBenhNhan(hoSoBenhNhanModel hsbn);
}
