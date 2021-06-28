package co.ufps.examenfinal.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import co.ufps.examenfinal.model.ConnectionToken;
import co.ufps.examenfinal.model.Rol;

public interface rolDao {
	public void insert(Rol c) throws SQLException;
	public ConnectionToken select(Integer id) throws SQLException;
	public ArrayList <Rol> selectAll() throws SQLException;
	public void delet(Integer id) throws SQLException;
	public void update(Rol c) throws SQLException;
}
