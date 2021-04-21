package co.icfes.aprovisionamiento.controller;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.icfes.aprovisionamiento.model.dto.FilterItemDTO;
import co.icfes.aprovisionamiento.model.dto.ItemDTO;
import co.icfes.aprovisionamiento.model.dto.ItemMovilDTO;
import co.icfes.aprovisionamiento.service.ItemService;

@RestController
@RequestMapping("/itemServ")
public class ItemController {

	ItemService itemService;

	public ItemController(ItemService itemService) {
		this.itemService = itemService;
	}

	@PostMapping(path = "/queryItems", consumes = "application/json", produces = "application/json")
	public List<ItemDTO> queryItems(@RequestBody FilterItemDTO filterItemDTO) {
		return itemService.consultarBolsaItemsTransformados(filterItemDTO);
	}

	@PostMapping(path = "/queryItemContent")
    public ItemMovilDTO queryItemContent(@Param(value = "idItem") Long idItem) {
		return itemService.getItemContentMovil(idItem);
	}

		
	@PostMapping(path = "/changueItemState", consumes = "application/json", produces = "application/json")
    public Boolean changueItemState(@RequestBody ItemDTO itemDTO) {
		Boolean realizoOperacion = false;
		try{
			realizoOperacion = itemService.changueItemState(itemDTO);
		} catch(Exception e){
//			logger.error("Error cambiando el estado del item- MovilServiceController- changueItemState: "
//					+ e.getMessage());
		}
		return realizoOperacion;
	}	

}
