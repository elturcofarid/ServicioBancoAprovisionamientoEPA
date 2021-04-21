package co.icfes.aprovisionamiento.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.icfes.aprovisionamiento.model.entity.Proceso;

@Repository
public interface ProcesoRepository extends CrudRepository<Proceso, Long>{

}
