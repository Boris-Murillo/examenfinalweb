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
	
	
}
