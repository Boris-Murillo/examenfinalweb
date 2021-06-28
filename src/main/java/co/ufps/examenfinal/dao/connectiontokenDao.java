package co.ufps.examenfinal.dao;
import java.sql.SQLException;
import java.util.ArrayList;

import co.ufps.examenfinal.model.ConnectionToken;

public interface connectiontokenDao {
	public void insert(ConnectionToken c) throws SQLException;
	public ConnectionToken select(Integer id) throws SQLException;
	public ArrayList <ConnectionToken> selectAll() throws SQLException;
	public void delet(Integer id) throws SQLException;
	public void update(ConnectionToken c) throws SQLException;
}
