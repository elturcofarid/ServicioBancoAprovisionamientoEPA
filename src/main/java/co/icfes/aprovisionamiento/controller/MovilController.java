package co.icfes.aprovisionamiento.controller;

import java.util.ArrayList;
import java.util.List;

import co.icfes.aprovisionamiento.model.dto.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Se encarga de exponer los servicios realcionados con los items
 * 
 * @author fureche
 *
 */
@RestController
@RequestMapping("/movilServ")
public class MovilController {
	
	//private IFachadaProceso fachada;
	
//	/** EJB para manejo de fachada examen*/
//	@EJB
//	private IFachadaExamen fachadaExam;

		/** Logger de la clase */
	//private static Logger logger = LoggerFactory.getLogger(ItemServiceController.class);
	
	/**
	 * Constructor del bean
	 */
	public MovilController() {

	}
	
	/**
	 * Servicio Rest de Aplicaciones activas
	 * @return List<AplicacionDTO>
	 */
	@GetMapping(path = "/listAplicacionesPreinstaladas")
    public List<AplicacionDTO> consultarListaAplicacionesActivas() {
		
        List<AplicacionDTO> listaProcesos = new ArrayList<AplicacionDTO>();
		try{
//			listaProcesos = fachadaExam.consultarListaAplicacionesActivas();
		} catch(Exception e){
//			logger.error("Error Servicio Aprovisionamiento Prueba Electronica - listAplicacionesActivas: " 
//					+ e.getMessage());
		}
		return listaProcesos;
	}
	
	/**
	 * Servicio Rest para armar el menu del Armado
	 * @param idAplicacion
	 * @return EstructuraExamenDTO
	 */
	@PostMapping(path = "/estructuraExamen", consumes = "application/json", produces = "application/json")
	public EstructuraExamenDTO estructuraExamen(final Long idAplicacion) {
		EstructuraExamenDTO estructuraExamen = new EstructuraExamenDTO();
//		FiltroProcesoDTO filtroEstructura = new FiltroProcesoDTO();
//		filtroEstructura.setIdAplicacion(idAplicacion);
		try{		
//			estructuraExamen = fachadaExam.consultarEstructuraExamen(filtroEstructura);
					
		}catch(Exception e){
//			e.printStackTrace();
//			logger.error("Error Servicio Aprovisionamiento Prueba Electronica - ExamStructure: " + e.getMessage());
		}
		
		return estructuraExamen;
	}
	
	/**
	 * Servicio Rest para consultar los items por Prueba
	 * @param filtroPrueba
	 * @return ist<ItemPreinstaladoDTO>
	 */
	@PostMapping(path = "/itemsPreinstalados", consumes = "application/json", produces = "application/json")
    public List<ItemMovilPreinstaladoDTO> consultarItemsPreinstalados(final FiltroPruebaExamenDTO filtroPrueba) {
		
		List<ItemMovilPreinstaladoDTO> listaItems = new ArrayList<ItemMovilPreinstaladoDTO>();
		try{
//			listaItems = fachadaExam.getItemsPreinstaladosMovil(filtroPrueba);
		} catch(Exception e){
//			logger.error("Error Servicio Aprovisionamiento Prueba Electronica - consultarItemsPreinstalados: " 
//					+ e.getMessage());
		}
		return listaItems;
	}
	
	/**
	 * Servicio Rest para actualziar el estado de un item preinstalado
	 * @param itemPreinstalado
	 * @return Boolean
	 */
	@PostMapping(path = "/actualizarItemPreinstalado", consumes = "application/json", produces = "application/json")
    public Boolean actualizarItemPreinstalado(final ItemMovilPreinstaladoDTO itemPreinstalado) {
		
		Boolean relizoOperacion = false;
		try{
//			relizoOperacion = fachadaExam.actualizarItemPreinstaladoMovil(itemPreinstalado);
		} catch(Exception e){
//			logger.error("Error Servicio Aprovisionamiento Prueba Electronica - actualizarItemPreinstalado: " 
//					+ e.getStackTrace());
		}
		return relizoOperacion;
	}

}
