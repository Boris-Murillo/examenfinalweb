package co.ufps.examenfinal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "connectiontoken")
@Table(name = "connectiontoken")
public class ConnectionToken {
	

	@Id
	@GeneratedValue
	private Integer id;
	@Column (name = "host")
	private String host;
	@Column (name = "userdb")
	private String userdb;
	@Column (name = "pass")
	private String pass;
	@Column (name = "db")
	private String db;
	@Column (name = "token")
	private String token;
	@Column (name = "port")
	private int port;
	
	@ManyToOne
	@JoinColumn(name = "user")
	private Usuario usuario;
	
	@Column (name = "state")
	private int estado;

	@ManyToOne
	@JoinColumn(name = "type")
	private TypeDb type;

	
	
	public ConnectionToken(Integer id, String host, String userdb, String pass, String db, String token, int port,
			Usuario usuario, int estado, TypeDb type) {
		super();
		this.id = id;
		this.host = host;
		this.userdb = userdb;
		this.pass = pass;
		this.db = db;
		this.token = token;
		this.port = port;
		this.usuario = usuario;
		this.estado = estado;
		this.type = type;
	}

	public ConnectionToken(String host, String userdb, String pass, String db, String token, int port, Usuario usuario,
			int estado, TypeDb type) {
		super();
		this.host = host;
		this.userdb = userdb;
		this.pass = pass;
		this.db = db;
		this.token = token;
		this.port = port;
		this.usuario = usuario;
		this.estado = estado;
		this.type = type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getUserdb() {
		return userdb;
	}

	public void setUserdb(String userdb) {
		this.userdb = userdb;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getDb() {
		return db;
	}

	public void setDb(String db) {
		this.db = db;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public TypeDb getType() {
		return type;
	}

	public void setType(TypeDb type) {
		this.type = type;
	}
	
	
	
}
