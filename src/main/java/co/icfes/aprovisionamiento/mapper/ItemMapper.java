package co.icfes.aprovisionamiento.mapper;

import org.mapstruct.Mapper;

import co.icfes.aprovisionamiento.model.dto.ItemDTO;
import co.icfes.aprovisionamiento.model.entity.Item;

@Mapper
public interface ItemMapper {

	ItemDTO toDto(Item item);
}
