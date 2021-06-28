package co.ufps.examenfinal.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import co.ufps.examenfinal.model.ConnectionToken;
import co.ufps.examenfinal.model.Usuario;

public interface usuarioDao {
	public void insert(Usuario c) throws SQLException;
	public 	Usuario select(Integer id) throws SQLException;
	public ArrayList <Usuario> selectAll() throws SQLException;
	public void delet(Integer id) throws SQLException;
	public void update(Usuario c) throws SQLException;
}
