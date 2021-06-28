package co.ufps.examenfinal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "rol")
@Table(name = "rol")
public class Rol {
	
	@Id
	@GeneratedValue
	private String id;
	@Column (name = "descripcion")
	private String descripcion;
}
