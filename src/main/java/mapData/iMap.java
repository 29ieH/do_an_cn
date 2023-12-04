package mapData;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public interface iMap<T> {
	public T map(ResultSet rs);
}
