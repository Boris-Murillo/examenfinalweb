package co.ufps.examenfinal.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import co.ufps.examenfinal.model.ConnectionToken;
import co.ufps.examenfinal.model.TypeDb;

public interface typedbDao {
	public void insert(TypeDb c) throws SQLException;
	public ConnectionToken select(String id) throws SQLException;
	public ArrayList <TypeDb> selectAll() throws SQLException;
	public void delet(String id) throws SQLException;
	public void update(TypeDb c) throws SQLException;
}
