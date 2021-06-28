package co.ufps.examenfinal.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import co.ufps.examenfinal.model.ConnectionToken;
import co.ufps.examenfinal.util.ConexionMySql;

public class ConnectiontokenDaoImpl implements connectiontokenDao {

	private ConexionMySql conexion;

	private static final String INSERT_CONNETIONTOKEN_SQL = "INSERT INTO connetiontoken  VALUES (?, ?, ? ,? , ?, ?, ?, ?, ?);";
	private static final String DELETE_CONNETIONTOKEN_SQL = "DELETE FROM connetiontoken WHERE id = ?;";
	private static final String UPDATE_CONNETIONTOKEN_SQL = "UPDATE connetiontoken SET host = ?, userdb = ?, pass = ?,  db = ? token = ? port = ? user = ? state = ? type = ? WHERE id = ?;";
	private static final String SELECT_CONNETIONTOKEN_BY_ID = "SELECT * FROM connetiontoken WHERE id = ?;";
	private static final String SELECT_ALL_CONNETIONTOKEN = "SELECT * FROM connetiontoken;";

	public ConnectiontokenDaoImpl() {
		this.conexion = ConexionMySql.getConexion();
	}

	@Override
	public void insert(ConnectionToken c) throws SQLException {
		try {
			PreparedStatement preStatement = (PreparedStatement) conexion.setPreparedStatement(INSERT_CYCLIST_SQL);
			preStatement.setString(1, c.getHost());
			preStatement.setString(2, ConnectionToken.getEmail());
			preStatement.setString(3, ConnectionToken.getPais());
			preStatement.setString(4, ConnectionToken.getTeam());
//			preStatement.setDate(5, (Date) Ciclista.getCumpleaños());
			conexion.execute();

		} catch (SQLException e) {
		}

	}

	@Override
	public ConnectionToken select(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ConnectionToken> selectAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delet(Integer id) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(ConnectionToken c) throws SQLException {
		// TODO Auto-generated method stub

	}

}
