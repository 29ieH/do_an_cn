package daoI;

import java.util.List;

import model.hoSoBenhNhanModel;

public interface IhoSoBenhNhanDAO {
	public List<hoSoBenhNhanModel> listAll();
	public List<hoSoBenhNhanModel> listOfName(String name);
}
