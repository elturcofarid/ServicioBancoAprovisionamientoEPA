package co.icfes.aprovisionamiento.service;

import java.util.List;

import co.icfes.aprovisionamiento.model.dto.FilterItemDTO;
import co.icfes.aprovisionamiento.model.dto.FiltroPruebaExamenDTO;
import co.icfes.aprovisionamiento.model.dto.ItemDTO;
import co.icfes.aprovisionamiento.model.dto.ItemMovilDTO;
import co.icfes.aprovisionamiento.model.dto.ItemMovilPreinstaladoDTO;

public interface ItemService {

	public List<ItemDTO> consultarBolsaItemsTransformados(FilterItemDTO filterItemDTO);
	
	public ItemMovilDTO getItemContentMovil(Long idItem) ;
	
	public Boolean changueItemState(ItemDTO itemDTO) throws Exception;
	
}
