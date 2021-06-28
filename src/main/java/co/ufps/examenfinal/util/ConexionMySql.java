package co.ufps.examenfinal.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;


public class ConexionMySql {
	private Connection con = null;
	private static ConexionMySql conexionDb;
	private PreparedStatement preparedStatement;
	
	private static final String url= "jdbc:mysql://localhost:3306/";
	private static final String dbName= "examenfinal";
	private static final String driver= "com.mysql.jdbc.Driver";
	private static final String userName= "root";
	private static final String password= "hola123";
	
	public  ConexionMySql(){

	       try{
	    	   Class.forName(driver);

	           con = DriverManager.getConnection(url+dbName,userName,password);

	       }catch(Exception ex){

	           JOptionPane.showMessageDialog(null, ex);

	       }
	}
	
	
	public void cerrarConexion() {
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
			}
	}
	
	//patron singleton
	public static ConexionMySql getConexion() {
		if(conexionDb==null)
			conexionDb = new ConexionMySql();
		return conexionDb;
	}
	
	public ResultSet query() throws SQLException{
		 ResultSet res = preparedStatement.executeQuery();
		 return res;
	}
	
	public int execute() throws SQLException{
		 int result = preparedStatement.executeUpdate();
		 return result;
	}
	
	public Connection getCon() {
		return this.con;
	}
	
	public PreparedStatement setPreparedStatement(String sql) throws SQLException{
		this.preparedStatement = con.prepareStatement(sql);
		return this.preparedStatement;
	}

}
