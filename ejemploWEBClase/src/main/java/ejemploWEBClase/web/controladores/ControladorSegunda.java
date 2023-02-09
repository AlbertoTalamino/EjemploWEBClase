/**
 * 
 */
package ejemploWEBClase.web.controladores;


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

import ejemploWEBClase.dtos.DtoAlumno;


/**
 * @author Talamino
 * 
 */

@Controller
public class ControladorSegunda {

	protected final Log logger = LogFactory.getLog(getClass());
   
	/*@RequestMapping(value="/segunda")
	public ModelAndView gestionSolicitud() {
		
		List<DtoAlumno> listAlum = new ArrayList<DtoAlumno>();
		
		listAlum.add(new DtoAlumno(1, "Juan Carlos", "Romero", 18, "612768009"));
		listAlum.add(new DtoAlumno(2, "Pedro", "García", 20, "617868899"));
		
	    logger.info("Navegamos a la vista segunda");
	    Map<String, Object> miModelo = new HashMap<String, Object>();  
	    miModelo.put("mensajeObjeto1", new DtoAlumno(1, "Juan Carlos", "Romero", 18, "612768009"));
	    return new ModelAndView("segunda", "miModelo", miModelo);
	} */
	
	@RequestMapping(value="/segunda")
	public ModelAndView gestionSolicitud() {
		
		return new ModelAndView("segunda");
	} 
	
	@PostMapping(value="/form")
	public ResponseEntity<Void> onPost(@RequestParam("id") int id, 
	                   @RequestParam("nombre") String nombre, 
	                   @RequestParam("apellidos") String apellidos, 
	                   @RequestParam("edad") int edad, 
	                   @RequestParam("tlf") String tlf) {
	    
		
	    // Crea un objeto Registro con los datos recogidos
	    DtoAlumno alumno = new DtoAlumno(id, nombre, apellidos, edad, tlf);
	    
	    
	    //Log para ver que se ha guardado
	    logger.info("Registro recibido: " + alumno);
	    
	    return new ResponseEntity<>(HttpStatus.OK);
	}

}


