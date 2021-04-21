package co.icfes.aprovisionamiento.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.icfes.aprovisionamiento.model.entity.ItemContenido;


@Repository
public interface ItemContenidoRepository extends CrudRepository<ItemContenido, Long>{
	Optional<List<ItemContenido>>  findByIdItem(Long idItem);
}
