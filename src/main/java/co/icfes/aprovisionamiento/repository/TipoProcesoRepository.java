package co.icfes.aprovisionamiento.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.icfes.aprovisionamiento.model.entity.TipoProceso;

@Repository
public interface TipoProcesoRepository extends CrudRepository<TipoProceso, Long> {

	@Query("select u from TipoProceso u,  RolTipoProceso t where u.tipoEstado=1 and u.idTipo = t.idTipo and t.idRol = ?1 order by u.idTipo asc")
	public Optional<List<TipoProceso>> findByIdRol(Long id);

}
