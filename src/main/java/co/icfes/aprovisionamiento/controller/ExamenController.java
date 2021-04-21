package co.icfes.aprovisionamiento.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.ManagedBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.icfes.aprovisionamiento.model.dto.AplicacionDTO;
import co.icfes.aprovisionamiento.model.dto.EstructuraExamenDTO;
import co.icfes.aprovisionamiento.model.dto.FiltroProcesoDTO;
import co.icfes.aprovisionamiento.model.dto.FiltroPruebaExamenDTO;
import co.icfes.aprovisionamiento.model.dto.ItemPreinstaladoDTO;
import co.icfes.aprovisionamiento.model.dto.ListaConfiguracionAplicacionDTO;
import co.icfes.aprovisionamiento.model.dto.ProcesoDTO;
import co.icfes.aprovisionamiento.model.dto.ReporteGeneralDTO;
import co.icfes.aprovisionamiento.model.dto.TipoProcesoDTO;
import co.icfes.aprovisionamiento.model.enums.EnumEstadoProceso;
import co.icfes.aprovisionamiento.model.enums.EnumTipoProceso;

@RestController
@RequestMapping("/examStruct")
public class ExamenController {
	
	/** Logger de la clase */
	private static Logger logger = LoggerFactory.getLogger(ExamenController.class);
	
//	/** EJB para manejo de fachada */
//	@EJB
//	private IFachadaExamen fachada;

	/**
	 * Constructor del Bean
	 */
	public ExamenController() {
		
	}
	
//	/** EJB para manejo de ProcesoColaServicio */
//	@EJB
//	private ProcesoColaServicio procesoColaServicio;
	
//	/** EJB para manejo de ProcesoTransformacionServicio */
//	@EJB
//	private ProcesoTransformacionServicio procesoTransformacionServicio;

	@GetMapping(path = "/listAplicacionesActivas")
    public List<AplicacionDTO> consultarListaAplicacionesActivas() {
		
		List<AplicacionDTO> listaProcesos = new ArrayList<AplicacionDTO>();
		try{
			//listaProcesos = fachada.consultarListaAplicacionesActivas();
		} catch(Exception e){
			logger.error("Error Servicio Aprovisionamiento Prueba Electronica - listAplicacionesActivas: " 
					+ e.getMessage());
		}
		return listaProcesos;

	}

	@GetMapping(path = "/listAplicacionSinProbar")
    public List<AplicacionDTO> consultarListaAplicacionSinAprobar() {
		
		List<AplicacionDTO> listaProcesos = new ArrayList<AplicacionDTO>();
		try{
			//listaProcesos = fachada.consultarListaAplicacionSinAprobar();
		} catch(Exception e){
			logger.error("Error Servicio Aprovisionamiento Prueba Electronica - listAplicacionesActivas: " 
					+ e.getMessage());
		}
		return listaProcesos;

	}
	/**
	 * Servicio Rest de Aplicaciones activas
	 * @return List<AplicacionDTO>
	 */
	@GetMapping(path = "/listAplicacionesAprovadasInstaladas")
    public List<AplicacionDTO> consultarListaAplicacionesAprovadasInstaladas() {
		
		List<AplicacionDTO> listaProcesos = new ArrayList<AplicacionDTO>();
		try{
			//listaProcesos = fachada.consultarListaAplicacionesAprobadasInstaladas();
		} catch(Exception e){
			logger.error("Error Servicio Aprovisionamiento Prueba Electronica - listAplicacionesActivas: " 
					+ e.getMessage());
		}
		return listaProcesos;

	}
	
	@PostMapping(path = "/estructuraExamen", consumes = "application/json", produces = "application/json")
	public EstructuraExamenDTO estructuraExamen(final FiltroProcesoDTO filtroEstructura) {		
		EstructuraExamenDTO estructuraExamen = new EstructuraExamenDTO();		
		try{		
			//estructuraExamen = fachada.consultarEstructuraExamen(filtroEstructura);
					
		}catch(Exception e){
			e.printStackTrace();
			logger.error("Error Servicio Aprovisionamiento Prueba Electronica - ExamStructure: " + e.getMessage());
		}
		
		return estructuraExamen;
	}	
	
	@PostMapping(path = "/listItemsPreinstalados", consumes = "application/json", produces = "application/json")
    public List<ItemPreinstaladoDTO> consultarItemsPreinstalados(final FiltroPruebaExamenDTO filtroPrueba) {
		
		List<ItemPreinstaladoDTO> listaItems = new ArrayList<ItemPreinstaladoDTO>();
		try{
			//listaItems = fachada.consultarItemsPreinstalados(filtroPrueba);
		} catch(Exception e){
			logger.error("Error Servicio Aprovisionamiento Prueba Electronica - listAplicacionesActivas: " 
					+ e.getMessage());
		}
		return listaItems;

	}
	
	
	@PostMapping(path = "/listItemsPrevalidar", consumes = "application/json", produces = "application/json")
    public List<ItemPreinstaladoDTO> consultarItemsPrevalidar(final FiltroPruebaExamenDTO filtroPrueba) {
		
		List<ItemPreinstaladoDTO> listaItems = new ArrayList<ItemPreinstaladoDTO>();
		try{
			//listaItems = fachada.consultarItemsPrevalidar(filtroPrueba);
		} catch(Exception e){
			logger.error("Error Servicio Aprovisionamiento Prueba Electronica - listAplicacionesActivas: " 
					+ e.getMessage());
		}
		return listaItems;

	}
	
	
	/**
	 * Servicio Rest para actualziar el estado de un item preinstalado
	 * @param itemPreinstalado
	 * @return Boolean
	 */
	@PostMapping(path = "/actualizarItemPreinstalado", consumes = "application/json", produces = "application/json")
    public Boolean actualizarItemPreinstalado(final ItemPreinstaladoDTO itemPreinstalado) {
		
		Boolean relizoOperacion = false;
		try{
			//relizoOperacion = fachada.actualizarItemPreinstalado(itemPreinstalado);
		} catch(Exception e){
			logger.error("Error Servicio Aprovisionamiento Prueba Electronica - actualizarItemPreinstalado: " 
					+ e.getStackTrace());
		}
		return relizoOperacion;

	}
	
	
	/**
	 * Servicio Rest para actualziar el estado de un item en prevalidacion
	 * @param itemPreinstalado
	 * @return Boolean
	 */
	@PostMapping(path = "/actualizarItemPrevalidacion", consumes = "application/json", produces = "application/json")
    public Boolean actualizarItemPrevalidacion(final ItemPreinstaladoDTO itemPreinstalado) {
		
		Boolean relizoOperacion = false;
		try{
			//relizoOperacion = fachada.actualizarItemPrevalidacion(itemPreinstalado);
		} catch(Exception e){
			logger.error("Error Servicio Aprovisionamiento Prueba Electronica - actualizarItemPrevalidacion: " 
					+ e.getStackTrace());
		}
		return relizoOperacion;

	}
	
	/**
	 * Servicio Rest de Aplicaciones activas
	 * @return List<AplicacionDTO>
	 */
	@GetMapping(path = "/consultarInstalacion")
    public Boolean consultarInstalacion(Long idAplicacion) {
		
		Boolean relizoOperacion = false;
		try{
			//relizoOperacion = fachada.consultarInstalacion(idAplicacion);
		} catch(Exception e){
			logger.error("Error Servicio Aprovisionamiento Prueba Electronica - actualizarItemPreinstalado: " 
					+ e.getStackTrace());
		}
		return relizoOperacion;

	}
	
	/**
	 * Servicio Rest de Aplicaciones activas, se incluyen instaladas y no instaladas
	 * @return List<AplicacionDTO>
	 */
	@GetMapping(path = "/consultarListaTotalAplicaciones")
    public List<AplicacionDTO> consultarListaTotalAplicaciones() {
		
		List<AplicacionDTO> listaTotalAplicaciones = new ArrayList<AplicacionDTO>();
		try{
			//listaTotalAplicaciones = fachada.listadoTotalAplicaciones();
		} catch(Exception e){
			logger.error("Error Servicio Aprovisionamiento Prueba Electronica - listAplicacionesActivas: " 
					+ e.getMessage());
		}
		return listaTotalAplicaciones;

	}
	
	/**
	 * Permite guardar un listado de permisos a los que tiene acceso una aplicación
	 * @param configAppDTO
	 * @return Boolean
	 */
	@PostMapping(path = "/guardarConfiguracionApp", consumes = "application/json", produces = "application/json")
    public Boolean guardarConfiguracionAplicacion(final ListaConfiguracionAplicacionDTO configAppDTO) {
		
		Boolean relizoOperacion = false;
		try{
		//	relizoOperacion = fachada.guardarConfiguracionAplicacion(configAppDTO);
		} catch(Exception e){
			logger.error("Error Servicio Aprovisionamiento Prueba Electronica - guardarConfiguracionAplicacion: " 
					+ e.getStackTrace());
		}
		return relizoOperacion;
	}
	
	@PostMapping(path = "/changeApplicationState", consumes = "application/json", produces = "application/json")
	public Boolean cambiarEstadoAplicacion(Long idAplicacion){
		Boolean relizoOperacion = false;
		//relizoOperacion = fachada.cambiarEstadoAplicacion(idAplicacion);
		if(relizoOperacion) {
			final ProcesoDTO procesoDTO = new ProcesoDTO();	
			procesoDTO.setTipoProceso(new TipoProcesoDTO(new Long("1"), "nameProcess", "stateProcess", EnumTipoProceso.COPIA_MULTIMEDIA.getNombre()));
			procesoDTO.setNombreProceso(EnumTipoProceso.COPIA_MULTIMEDIA.getNombre());	
			procesoDTO.setFechaCreacion(new Date());
			procesoDTO.setFechaInicio(new Date());
			procesoDTO.setEstado(EnumEstadoProceso.PROCESO_EN_VALIDACION.getCodigo());
			procesoDTO.setIdAplicacion(idAplicacion);
			procesoDTO.setNombreProceso(procesoDTO.getTipoProceso().getEnumProcess());
			procesoDTO.setNumeroRegistrosProcesados(new Integer(0));
			procesoDTO.setNumeroRegProcError(new Integer(0));
			procesoDTO.setNumeroRegProcExito(new Integer(0));
			procesoDTO.setPorcentaje(new Long(0));
			
			try {
			
				//procesoColaServicio.encolarProceso(procesoDTO);
			} catch (Exception e) {
				e.printStackTrace();
				logger.error("Error Servicio changeApplicationState Prueba Electronica: mover multimedia " + e.getMessage());
			}
		}
		
		return relizoOperacion;
	}
	
	@PostMapping(path = "/getGeneralReport", consumes = "application/json", produces = "application/json")
	public List<ReporteGeneralDTO> consultarReporteGeneral(Long idAplicacion){
		List<ReporteGeneralDTO> listaReporteGral = new ArrayList<ReporteGeneralDTO>();
		try {
			//listaReporteGral = fachada.consultarReporteGeneral(idAplicacion);
		} catch (Exception e) {
			logger.error("Error Servicio Aprovisionamiento Prueba Electronica - consultarReporteGeneral: " 
					+ e.getStackTrace());
		}
		return listaReporteGral;
	}
	
	@PostMapping(path = "/getGeneralReportPrevalidacion", consumes = "application/json", produces = "application/json")
	public List<ReporteGeneralDTO> consultarReportePrevalidacion(Long idAplicacion){
		List<ReporteGeneralDTO> listaReporteGral = new ArrayList<ReporteGeneralDTO>();
		try {
			//listaReporteGral = fachada.consultarReportePrevalidacion(idAplicacion);
		} catch (Exception e) {
			logger.error("Error Servicio Aprovisionamiento Prueba Electronica - consultarReporteGeneral: " 
					+ e.getStackTrace());
		}
		return listaReporteGral;
	}
}
