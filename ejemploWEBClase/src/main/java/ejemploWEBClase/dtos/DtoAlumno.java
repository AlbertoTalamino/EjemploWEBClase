/**
 * 
 */
package ejemploWEBClase.dtos;

/**
 * @author Talamino
 *
 */
public class DtoAlumno {

	//Propiedades
	int id;
	String nombre;
	String apellidos;
	int edad;
	String tlf;

	
	/**
	 * Constructor normal
	 *
	 * @param id
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 * @param tlf
	 */
	public DtoAlumno(int id, String nombre, String apellidos, int edad, String tlf) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.tlf = tlf;
	}
	
	/**
	 * Constructor vacio
	 */
	public DtoAlumno() {
		super();
	}


	//GETTERS AND SETTERS
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	
	
	//ToString (Metodo que hace legible a la clase)
	@Override
	public String toString() {
		return "DtoAlumno [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", tlf="
				+ tlf + "]";
	}

}
