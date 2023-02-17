/**
 * 
 */
package ejemploWEBClase.aplicaciones.impl;

import ejemploWEBClase.aplicaciones.dal.DaoAlumno;
import ejemploWEBClase.aplicaciones.dtos.DtoAlumno;

/**
 * @author Talamino
 *
 */
public interface ConsultaServicio {

	/**
	 * repostajeGasolinera: Inserta en base de datos un nuevo alumno
	 * @param alumnoDAO
	 */
	public void insertarAlumno(DaoAlumno daoAlumno);
	
}
