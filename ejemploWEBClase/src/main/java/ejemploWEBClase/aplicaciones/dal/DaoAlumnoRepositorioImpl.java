/**
 * 
 */
package ejemploWEBClase.aplicaciones.dal;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

/**
 * @author Talamino
 *
 */

@Repository
public class DaoAlumnoRepositorioImpl implements DaoAlumnoRepositorio{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void insert(DaoAlumno daoAlumno) throws Exception {
		em.persist(daoAlumno);
		em.clear();
		em.close();
	}

}
