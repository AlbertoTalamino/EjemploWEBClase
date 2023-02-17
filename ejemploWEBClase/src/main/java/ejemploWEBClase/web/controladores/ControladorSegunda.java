/**
 * 
 */
package ejemploWEBClase.web.controladores;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Controller;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ejemploWEBClase.aplicaciones.dal.DaoAlumno;
import ejemploWEBClase.aplicaciones.dtos.DtoAlumno;
import ejemploWEBClase.aplicaciones.impl.ConsultaServicio;

/**
 * @author Talamino
 * 
 */


@Controller
public class ControladorSegunda {

	//@Autowired
	//ConsultaServicio consultaServicio;
	
	protected final Log logger = LogFactory.getLog(getClass());
   
	
	@RequestMapping(value="/segunda")
	public ModelAndView gestionSolicitud() {
		
		return new ModelAndView("segunda");
	} 
	
	@PostMapping(value="/form")
	public ResponseEntity<Void> onPost(@RequestParam("id") Integer id, 
	                   @RequestParam("nombre") String nombre, 
	                   @RequestParam("apellidos") String apellidos, 
	                   @RequestParam("edad") int edad, 
	                   @RequestParam("tlf") String tlf) {
	    
		
	    // Crea un objeto Registro con los datos recogidos
	    DaoAlumno alumno = new DaoAlumno(id, nombre, apellidos, edad, tlf);
	    
	    //Paso del DTO a DAO
	    
	    
	    //Log para ver que se ha guardado
	    logger.info("Registro recibido: " + alumno);
	    
	    // Guarda el objeto en la base de datos
	    //ssconsultaServicio.insertarAlumno(alumno);
	    
	    return new ResponseEntity<>(HttpStatus.OK);
	}

}

      