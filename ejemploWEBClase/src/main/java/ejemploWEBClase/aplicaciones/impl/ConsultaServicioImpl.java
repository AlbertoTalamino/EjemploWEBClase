/**
 * 
 */
package ejemploWEBClase.aplicaciones.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ejemploWEBClase.aplicaciones.dal.DaoAlumno;
import ejemploWEBClase.aplicaciones.dal.DaoAlumnoRepositorio;

/**
 * @author Talamino
 *
 */

@Service
public class ConsultaServicioImpl implements ConsultaServicio{

	@Autowired
	DaoAlumnoRepositorio dar;
	
	@Override
	@Transactional
	public void insertarAlumno(DaoAlumno daoAlumno) {
		try {
			dar.insert(daoAlumno);
			System.out.println("Registro insertado correctamente");
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
	}

}
