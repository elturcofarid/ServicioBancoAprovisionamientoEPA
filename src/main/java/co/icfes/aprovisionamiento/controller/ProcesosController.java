package co.icfes.aprovisionamiento.controller;

import java.io.InputStream;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.annotation.ManagedBean;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import com.sun.org.apache.xml.internal.security.utils.JavaUtils;

import co.icfes.aprovisionamiento.model.dto.AplicacionDTO;
import co.icfes.aprovisionamiento.model.dto.DetalleProcesoDTO;
import co.icfes.aprovisionamiento.model.dto.FiltroProcesoDTO;
import co.icfes.aprovisionamiento.model.dto.ItemContenidoDTO;
import co.icfes.aprovisionamiento.model.dto.ProcesoDTO;
import co.icfes.aprovisionamiento.model.dto.RespuestaDTO;
import co.icfes.aprovisionamiento.model.dto.TipoProcesoDTO;
import co.icfes.aprovisionamiento.model.enums.EnumEstadoProceso;
import co.icfes.aprovisionamiento.model.enums.EnumTipoContenido;
import co.icfes.aprovisionamiento.model.enums.EnumTipoItem;
import co.icfes.aprovisionamiento.model.enums.EnumTipoProceso;
import co.icfes.aprovisionamiento.service.ProcesoServicio;

@RestController
@RequestMapping("/procesosServ")
public class ProcesosController {

	/** EJB para manejo de fachada */ 
//	@EJB
//	private IFachadaProceso fachada;

	/** EJB para manejo de ProcesoColaServicio */
//	@EJB
//	private ProcesoColaServicio procesoColaServicio;

	/** EJB para manejo de ProcesoTransformacionServicio */
//	@EJB
//	private ProcesoTransformacionServicio procesoTransformacionServicio;
	
	@Autowired
	private ProcesoServicio procesoServicio;

	/** Logger de la clase */
	private static Logger logger = LoggerFactory.getLogger(ProcesosController.class);

	/** Ruta del properties con mensajes */
	private static final String MESSAGES_PROPERTIES = "../../../../../messages.properties";

	/** Permite llevar el conteo de los registros a procesar*/
	private Integer numeroRegistrosProcesar = 0;

	/**Flag para indicar si es posible realizar la pre instalación */
	private Boolean validacionPreinstalacion = false;
	
	/**Flag para indicar si es posible realizar el proceso de eliminar instalación */
	private Boolean flagEliminarInstalacion;
	
	/**Flag que indica si es posible realizar el proceso de instalación */
	private Boolean flagValidarInstalacion;

	/**
	 * Constructor del bean
	 */
	public ProcesosController() {

	}

	/**
	 * Servicio rest para crear un nuevo proceso Retorna los datos de el proceso
	 * creado
	 * 
	 * @param filtroInicio
	 * @return procesoDTO
	 */
	@PostMapping(path = "/iniciarProceso", consumes = "application/json", produces = "application/json")
	public RespuestaDTO iniciarProceso(final FiltroProcesoDTO filtroInicio) {
		final ProcesoDTO procesoDTO = new ProcesoDTO();
		procesoDTO.setUsuarioCreacion(filtroInicio.getUsuario());
		procesoDTO.setFechaCreacion(new Date());
		procesoDTO.setFechaInicio(new Date());
		procesoDTO.setEstado(EnumEstadoProceso.PROCESO_EN_VALIDACION.getCodigo());
		procesoDTO.setTipoProceso(filtroInicio.getTipoProceso());
		procesoDTO.setNombreProceso(procesoDTO.getTipoProceso().getEnumProcess());
		procesoDTO.setNumeroRegistrosProcesados(new Integer(0));
		procesoDTO.setNumeroRegProcError(new Integer(0));
		procesoDTO.setNumeroRegProcExito(new Integer(0));
		procesoDTO.setPorcentaje(new Long(0));
		procesoDTO.setIdAplicacion(filtroInicio.getIdAplicacion());
		procesoDTO.setIncluirEnunciado(filtroInicio.getIncluirEnunciado());
		procesoDTO.setInicioConsecutivo(filtroInicio.getInicioConsecutivo());	
		procesoDTO.setIncuilrEtiquetas(filtroInicio.getIncluirEtiquetas());

		final RespuestaDTO respuestaDTO = new RespuestaDTO();
		InputStream input = null;
		Boolean rtaPreproceso = false;
		validacionPreinstalacion = false;
		flagEliminarInstalacion = false;
		flagValidarInstalacion=false;

		try {
			Properties properties = new Properties();
			input = ProcesosController.class.getResourceAsStream(MESSAGES_PROPERTIES);
			properties.load(input);

			//Boolean existenProcEj = fachada.consultaSiHayProcesosEnEjecucion(procesoDTO);
//
//			if (existenProcEj) {
//				respuestaDTO.setMensajeProceso(properties.getProperty("msg_proceso_en_ejecucion"));
//			} else {
//				if (EnumTipoProceso.TRANFORMAR_QTI_HTML.name().equals(filtroInicio.getTipoProceso().getEnumProcess())) {
//					rtaPreproceso = this.preprocesarTransformacion(procesoDTO);
//				} else if (EnumTipoProceso.REALIZAR_PREINSTALACION.name().equals(filtroInicio.getTipoProceso().getEnumProcess())) {
//					rtaPreproceso = this.preprocesarPreinstalacion(procesoDTO, filtroInicio.getConfElimPreinstalPrev());
//				} else if (EnumTipoProceso.ACTUALIZAR_PREINSTALACION.name()
//						.equals(filtroInicio.getTipoProceso().getEnumProcess())) {
//					rtaPreproceso = this.preActualizacionPreinstalacion(procesoDTO);
//				} else if (EnumTipoProceso.DEPURAR_ITEMS.name().equals(filtroInicio.getTipoProceso().getEnumProcess())) {
//					rtaPreproceso = this.preDepuracionItems(procesoDTO);
//				} else if (EnumTipoProceso.REALIZAR_INSTALACION.name()
//						.equals(filtroInicio.getTipoProceso().getEnumProcess())){
//					rtaPreproceso = this.preRevisionInstalacion(procesoDTO);
//				} else if (EnumTipoProceso.ELIMINAR_INSTALACION.name().equals(filtroInicio.getTipoProceso().getEnumProcess())) {
//					rtaPreproceso = this.preEliminarAplicacion(procesoDTO);
//				}else {
//					rtaPreproceso = true;
//				}

				if (rtaPreproceso) {
					procesoDTO.setNumeroTotalRegistros(numeroRegistrosProcesar);
					procesoDTO.setNumeroRegistrosProcesados(0);
//					Proceso proceso = procesoTransformacionServicio.crearProceso(procesoDTO);
//					procesoDTO.setIdProceso(proceso.getIdProceso());
//					procesoColaServicio.encolarProceso(procesoDTO);

					String mensaje = MessageFormat.format(properties.getProperty("msg_inicio_proceso"),
							procesoDTO.getTipoProceso().getNameProcess(),
							procesoDTO.getIdProceso().toString().replace(".", ""));

					respuestaDTO.setMensajeProceso(mensaje);
					respuestaDTO.setProcesoDTO(procesoDTO);
				} else {

					if (validacionPreinstalacion) {
						respuestaDTO.setValidacionPreinstalacion(true);
						respuestaDTO.setMensajeProceso(null);
					} else if(flagEliminarInstalacion){
						respuestaDTO.setMensajeProceso(properties.getProperty("mensaje_fecha_preiodo_proceso"));
					} else if(flagValidarInstalacion){
						respuestaDTO.setMensajeProceso(properties.getProperty("mensaje_aplicacion_sin_configuracion"));
					} else {
						respuestaDTO.setMensajeProceso(properties.getProperty("mensaje_no_existen_item_para_procesar"));
					}
				}
//			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Error Servicio Aprovisionamiento Prueba Electronica: " + e.getMessage());
		}

		return respuestaDTO;
	}

	private boolean preprocesarTransformacion(ProcesoDTO procesoDTO) {
		Boolean rtaPreproceso = false;
		final ItemContenidoDTO itemContenido = new ItemContenidoDTO();
		itemContenido.setTipoContenido(EnumTipoContenido.QTI.getNombre());
		itemContenido.setTipoRespuesta(EnumTipoItem.SINGLE.getNombre());
		itemContenido.setEstado(0L);
		try {
			//numeroRegistrosProcesar = fachada.consultarNumeroItemAProcesarQTI(itemContenido);

			if (numeroRegistrosProcesar != null && numeroRegistrosProcesar > 0) {
				rtaPreproceso = true;
			}
		} catch (Exception e) {
			logger.error("Error ProcesosServices método preprocesarTransformacion: " + e.getStackTrace());
		}
		return rtaPreproceso;
	}
	
	/**
	 * Permite validar si es posible realizar la instalación de una aplicación
	 * @param procesoDTO
	 * @return boolean
	 */
	private boolean preRevisionInstalacion(ProcesoDTO procesoDTO){
		Boolean rtaPreproceso = false;		
		try {			
//			if(!fachada.revisarConfiguracionXApp(procesoDTO.getIdAplicacion())){
//				flagValidarInstalacion = true;
//			}else{
//				numeroRegistrosProcesar = fachada.prepararProcesoInstalacion(procesoDTO.getIdAplicacion());
//				rtaPreproceso = true;
//			}			
		} catch (Exception e) {
			logger.error("Error ProcesosServices método prepararProcesoInstalacion: " + e.getStackTrace());
		}		
		return rtaPreproceso;
	}

	/**
	 * m�todo que valida si existe una preinstalación previa , si la bandera
	 * confElimPreinstalPrev es igual al true , indica que el usuario desea
	 * borrar dicha preinstalación antes de continuar con el proceso de
	 * preinstalación
	 * 
	 * @param procesoDTO,
	 *            confElimPreinstalPrev
	 * @return boolean resultado de la operacion
	 */
	private boolean preprocesarPreinstalacion(ProcesoDTO procesoDTO, Boolean confElimPreinstalPrev) {
		Boolean rtaPreproceso = false;
		Boolean ejecutarProceso = false;
		numeroRegistrosProcesar = 0;
		this.validacionPreinstalacion = false;

//		try {
//			Map<String, Long> combosPreinstalados = fachada
//					.consultarCombosPreInstalacionAplicacion(procesoDTO.getIdAplicacion());
//
//			if (combosPreinstalados != null && !combosPreinstalados.isEmpty()) {
//				this.validacionPreinstalacion = true;
//
//				if (confElimPreinstalPrev) {
//					ejecutarProceso = procesoTransformacionServicio
//							.eliminarCombosPreInstalacion(procesoDTO.getIdAplicacion());
//				}
//			} else {
//				ejecutarProceso = true;
//			}
//			if (ejecutarProceso) {
//				numeroRegistrosProcesar = fachada.consultarNumeroCombosAProcesar(procesoDTO.getIdAplicacion());
//				if (numeroRegistrosProcesar != null && numeroRegistrosProcesar > 0) {
//					rtaPreproceso = true;
//				}
//			}
//		} catch (Exception e) {
//			logger.error("Error ProcesosServices método preprocesarPreinstalacion: " + e.getMessage());
//		}
		return rtaPreproceso;
	}

	/**
	 * m�todo que valida el numero de item rechazados en la preinstalación de
	 * una aplicación antes de iniciar el proceso
	 * 
	 * @return boolean resultado de la operacion
	 */
	private boolean preActualizacionPreinstalacion(ProcesoDTO procesoDTO) {
		Boolean rtaPreproceso = false;
		numeroRegistrosProcesar = 0;
		try {

		//	numeroRegistrosProcesar = fachada.consultarNumRegRechazadosPreInstalacion(procesoDTO.getIdAplicacion());

			if (numeroRegistrosProcesar != null && numeroRegistrosProcesar > 0) {
				rtaPreproceso = true;
			}

		} catch (Exception e) {
			logger.error("Error ProcesosServices m�todo preActualizacionPreinstalacion: " + e.getMessage());
		}
		return rtaPreproceso;
	}

	/**
	 * Servicio rest que retorna los errores de un Proceso
	 * 
	 * @param filtroInicio
	 * @return listaLogProcesos
	 */
	@PostMapping(path = "/log", consumes = "application/json", produces = "application/json")
	public DetalleProcesoDTO logProceso(final FiltroProcesoDTO filtroInicio) {
		DetalleProcesoDTO listaLogProcesos = new DetalleProcesoDTO();
		try {
			//listaLogProcesos = fachada.consultarDetalleProceso(Long.valueOf(filtroInicio.getIdProceso()));
		} catch (Exception e) {
			logger.error("Error consultando la lista de logProcesos- CargaQTIServicio.java- consultarDetalleProceso: "
					+ e.getMessage());
		}
		return listaLogProcesos;
	}
	
	
	@GetMapping(path = "/version")
	public String version() {
		return "1.0";
	}

	/**
	 * M�todo que se encarga de retornar el estado de los procesos Activos
	 * 
	 * @return
	 */
	@PostMapping(path = "/listProcesosActivos", consumes = "application/json", produces = "application/json")
	public List<ProcesoDTO> consultarListaProcesosActivos(Long idRol) {

		List<ProcesoDTO> listaProcesos = new ArrayList<ProcesoDTO>();
		try {
		//	if (!JavaUtils.isEmpty(idRol.toString())) {
			//	listaProcesos = fachada.consultarEstadoProcesosActivos(idRol);
		//	} else {
				logger.error("Error consultando la lista de Procesos- ListaProceso.java- consultarProcesosActivos.");
		//	}
		} catch (Exception e) {
			logger.error("Error consultando la lista de Procesos- ListaProceso.java- consultarProcesosActivos: "
					+ e.getMessage());
		}
		return listaProcesos;

	}

	
	
	

	
	@PostMapping(path = "/listTipoProcesosActivos", consumes = "application/json", produces = "application/json")
	public List<TipoProcesoDTO> consultarTipoProcesosActivos(@RequestParam Long idRol) {
		return procesoServicio.consultarProcesosActivos(idRol);
	}

	/**
	 * m�todo que valida el numero de item que no pudieron procesarse
	 * correctamente antes de iniciar el proceso
	 * 
	 * @return boolean resultado de la operacion
	 */
	private boolean preDepuracionItems(ProcesoDTO procesoDTO) {
		Boolean rtaPreproceso = false;
		final ItemContenidoDTO itemContenido = new ItemContenidoDTO();
		itemContenido.setTipoContenido(EnumTipoContenido.QTI.getNombre());
		itemContenido.setEstado(0L);
		try {
			//numeroRegistrosProcesar = fachada.consultarNumeroItemAProcesarQTI(itemContenido);

			if (numeroRegistrosProcesar != null && numeroRegistrosProcesar > 0) {
				rtaPreproceso = true;
			}
		} catch (Exception e) {
			logger.error("Error ProcesosServices m�todo preprocesarTransformacion: " + e.getStackTrace());
		}
		return rtaPreproceso;
	}
	
	
	
	
	
	
	/**
	 * @return the numeroRegistrosProcesar
	 */
	public Integer getNumeroRegistrosProcesar() {
		return numeroRegistrosProcesar;
	}

	/**
	 * @param numeroRegistrosProcesar
	 *            the numeroRegistrosProcesar to set
	 */
	public void setNumeroRegistrosProcesar(Integer numeroRegistrosProcesar) {
		this.numeroRegistrosProcesar = numeroRegistrosProcesar;
	}

	/**
	 * @return the validacionPreinstalacion
	 */
	public Boolean getValidacionPreinstalacion() {
		return validacionPreinstalacion;
	}

	/**
	 * @param validacionPreinstalacion
	 *            the validacionPreinstalacion to set
	 */
	public void setValidacionPreinstalacion(Boolean validacionPreinstalacion) {
		this.validacionPreinstalacion = validacionPreinstalacion;
	}

	public Boolean getFlagEliminarInstalacion() {
		return flagEliminarInstalacion;
	}

	public void setFlagEliminarInstalacion(Boolean flagEliminarInstalacion) {
		this.flagEliminarInstalacion = flagEliminarInstalacion;
	}

	/**
	 * @return the flagValidarInstalacion
	 */
	public Boolean getFlagValidarInstalacion() {
		return flagValidarInstalacion;
	}

	/**
	 * @param flagValidarInstalacion the flagValidarInstalacion to set
	 */
	public void setFlagValidarInstalacion(Boolean flagValidarInstalacion) {
		this.flagValidarInstalacion = flagValidarInstalacion;
	}

}
