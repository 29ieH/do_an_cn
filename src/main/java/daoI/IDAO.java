package daoI;

import java.util.List;

import mapData.iMap;

public interface IDAO<T> {
	public List<T> query(String sql,iMap<T> t,Object...parameter);
}
