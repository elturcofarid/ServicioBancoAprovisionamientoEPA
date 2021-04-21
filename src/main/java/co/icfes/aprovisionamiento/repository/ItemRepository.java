package co.icfes.aprovisionamiento.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.icfes.aprovisionamiento.model.entity.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long>{

}
