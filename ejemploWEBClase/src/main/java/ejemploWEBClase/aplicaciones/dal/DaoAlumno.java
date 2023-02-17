/**
 * 
 */
package ejemploWEBClase.aplicaciones.dal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Talamino
 *
 */

@Entity
@Table(name = "alumno", schema = "gestion")
public class DaoAlumno {

	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id", nullable = false)
		private Integer id;

		@Column(name = "nombre")
		private String nombre;

		@Column(name = "apellidos")
		private String apellidos;

		@Column(name = "edad")
		private int edad;

		@Column(name = "tlf")
		private String tlf;

		
		public DaoAlumno(Integer id, String nombre, String apellidos, int edad, String tlf) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.edad = edad;
			this.tlf = tlf;
		}

		//Getters and Setters
		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellidos() {
			return apellidos;
		}

		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public String getTlf() {
			return tlf;
		}

		public void setTlf(String tlf) {
			this.tlf = tlf;
		}
		
	}


