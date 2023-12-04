package Iservice;

import java.util.List;

import model.hoSoBenhNhanModel;

public interface IhoSoBenhNhan {
	List<hoSoBenhNhanModel> listAll();
	List<hoSoBenhNhanModel> findOfName(String name);
}
