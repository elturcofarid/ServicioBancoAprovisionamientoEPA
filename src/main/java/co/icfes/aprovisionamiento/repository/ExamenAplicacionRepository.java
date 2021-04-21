package co.icfes.aprovisionamiento.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.icfes.aprovisionamiento.model.entity.ExamenAplicacion;

@Repository
public interface ExamenAplicacionRepository extends CrudRepository<ExamenAplicacion, Long>{
	
	@Query("select u from ExamenAplicacion u where u.exapApliEstado=1 and u.exapAproEstado=3")
	public Iterable<ExamenAplicacion> findAll();

	@Query("select u from ExamenAplicacion u where u.exapApliEstado=1 and u.exapAproEstado=2")
	public Iterable<ExamenAplicacion> findVerificados();
	
	@Query("select u from ExamenAplicacion u where u.exapApliEstado=1 and u.exapAproEstado in (0,1)")
	public Iterable<ExamenAplicacion> findAplicacionActiva();
}
