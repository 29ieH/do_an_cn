package ServiceImp;

import java.util.List;

import Iservice.IhoSoBenhNhan;
import daoImpl.hoSoBenhNhanDAO;
import model.hoSoBenhNhanModel;

public class hoSoBenhNhanS implements IhoSoBenhNhan {

	public List<hoSoBenhNhanModel> listAll() {
		return new hoSoBenhNhanDAO().listAll();
	}

	public List<hoSoBenhNhanModel> findOfName(String name) {
		return new hoSoBenhNhanDAO().listOfName(name);
	}

}
