package co.ufps.examenfinal.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
			PreparedStatement preStatement = (PreparedStatement) conexion.setPreparedStatement(INSERT_CONNETIONTOKEN_SQL);
			preStatement.setString(1, c.getHost());
			preStatement.setString(2, c.getUserdb());
			preStatement.setString(3, c.getPass() );
			preStatement.setString(4, c.getDb());
			preStatement.setString(5, c.getToken());
			preStatement.setString(6, c.getPort()+"");
			preStatement.setString(7, c.getUsuario().getId().toString());
			preStatement.setString(8, c.getEstado()+"");
			preStatement.setString(9, c.getType().getId().toString());

			conexion.execute();

		} catch (SQLException e) {
		}

	}

	@Override
	public ConnectionToken select(Integer id) throws SQLException {
		ConnectionToken c = null;
		try {
			PreparedStatement preStatement = (PreparedStatement)conexion.setPreparedStatement(SELECT_CONNETIONTOKEN_BY_ID);
			preStatement.setInt(1, id); 
			ResultSet rs = conexion.query();
			while(rs.next()){
				String host = rs.getString("host");
				String userdb = rs.getString("userdb");
				String pass = rs.getString("pass");
				String db = rs.getString("db");
				String token = rs.getString("token");
				Integer port = rs.getInt("port");
				String user = rs.getString("user");
				Integer state = rs.getInt("state");
				String type = rs.getString("type");
				c = new ConnectionToken(id, host, userdb, pass, db, type, port, null, state, null);
			}
		}catch (SQLException e) {}
		return c;
	}

	@Override
	public ArrayList<ConnectionToken> selectAll() throws SQLException {
		ArrayList <ConnectionToken> cs = new ArrayList<>();
		try {
			PreparedStatement preStatement = (PreparedStatement)conexion.setPreparedStatement(SELECT_ALL_CONNETIONTOKEN);
			ResultSet rs = conexion.query();
		
			while(rs.next()){
				Integer id = rs.getInt("id");
				String host = rs.getString("host");
				String userdb = rs.getString("userdb");
				String pass = rs.getString("pass");
				String db = rs.getString("db");
				String token = rs.getString("token");
				Integer port = rs.getInt("port");
				String user = rs.getString("user");
				Integer state = rs.getInt("state");
				String type = rs.getString("type");
	
				cs.add(new ConnectionToken(id, host, userdb, pass, db, type, port, null, state, null));
				
			}
		}catch (SQLException e) {}
		return cs;
	}

	@Override
	public void delet(Integer id) throws SQLException {
		try {
			PreparedStatement preStatement = (PreparedStatement)conexion.setPreparedStatement(DELETE_CONNETIONTOKEN_SQL);
			preStatement.setInt(1, id); 
			conexion.execute();
		}catch (SQLException e) {}
	}

	@Override
	public void update(ConnectionToken c) throws SQLException {
		PreparedStatement preStatement = (PreparedStatement) conexion.setPreparedStatement(UPDATE_CONNETIONTOKEN_SQL);
		preStatement.setString(1, c.getHost());
		preStatement.setString(2, c.getUserdb());
		preStatement.setString(3, c.getPass() );
		preStatement.setString(4, c.getDb());
		preStatement.setString(5, c.getToken());
		preStatement.setString(6, c.getPort()+"");
		preStatement.setString(7, c.getUsuario().getId().toString());
		preStatement.setString(8, c.getEstado()+"");
		preStatement.setString(9, c.getType().getId().toString());
		preStatement.setString(10, c.getId().toString());

		conexion.execute();
	}

}
