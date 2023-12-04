package daoI;

import java.util.List;

import model.benhNhanModel;
import model.hoSoBenhNhanModel;

public interface IbenhNhanDAO {
	public List<benhNhanModel> listAll();
	public List<benhNhanModel> info (hoSoBenhNhanModel hs);
}
