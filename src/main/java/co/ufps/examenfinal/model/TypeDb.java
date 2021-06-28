package co.ufps.examenfinal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "typedb")
@Table(name = "typebd")
public class TypeDb {

	@Id
	private String id;
	@Column (name = "descripcion")
	private String descripcion;
	@Column (name = "driver")
	private String driver;
	@Column (name = "aditional")
	private String aditional;
	
	
	public TypeDb(String descripcion, String driver, String aditional) {
		super();
		this.descripcion = descripcion;
		this.driver = driver;
		this.aditional = aditional;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getDriver() {
		return driver;
	}


	public void setDriver(String driver) {
		this.driver = driver;
	}


	public String getAditional() {
		return aditional;
	}


	public void setAditional(String aditional) {
		this.aditional = aditional;
	}
	
	
	
	
}
