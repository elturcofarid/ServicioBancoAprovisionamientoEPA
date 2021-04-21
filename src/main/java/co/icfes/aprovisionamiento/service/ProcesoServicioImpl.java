package co.icfes.aprovisionamiento.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import co.icfes.aprovisionamiento.mapper.MapperExamenAplicacion;
import co.icfes.aprovisionamiento.mapper.MapperTipoProceso;
import co.icfes.aprovisionamiento.model.dto.AplicacionDTO;
import co.icfes.aprovisionamiento.model.dto.ProcesoDTO;
import co.icfes.aprovisionamiento.model.dto.TipoProcesoDTO;
import co.icfes.aprovisionamiento.model.entity.ExamenAplicacion;
import co.icfes.aprovisionamiento.model.entity.Proceso;
import co.icfes.aprovisionamiento.model.entity.TipoProceso;
import co.icfes.aprovisionamiento.repository.ExamenAplicacionRepository;
import co.icfes.aprovisionamiento.repository.ProcesoRepository;
import co.icfes.aprovisionamiento.repository.TipoProcesoRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/*
import co.gov.icfes.aprovisionamientoe.enums.EnumEstadoProceso;
import co.gov.icfes.aprovisionamientoe.enums.EnumTipoProceso;
import co.gov.icfes.aprovisionamientoe.excepciones.SistemaExcepcion;
import co.gov.icfes.aprovisionamientoe.transformador.dto.AplicacionDTO;
import co.gov.icfes.aprovisionamientoe.transformador.dto.DetalleProcesoDTO;
import co.gov.icfes.aprovisionamientoe.transformador.dto.LogProcesoDTO;
import co.gov.icfes.aprovisionamientoe.transformador.dto.ProcesoDTO;
import co.gov.icfes.aprovisionamientoe.transformador.dto.TipoProcesoDTO;
import co.gov.icfes.aprovisionamientoe.transformador.modelo.LogProceso;
import co.gov.icfes.aprovisionamientoe.transformador.modelo.Proceso;
import co.gov.icfes.aprovisionamientoe.utils.DateUtils;
import co.gov.icfes.aprovisionamientoe.utils.EAOGenerico;
import co.gov.icfes.aprovisionamientoe.utils.ParametroQuery;
*/

@Service
public class ProcesoServicioImpl implements ProcesoServicio {

//llamar a un repositorio
	private ProcesoRepository repository;

	

	private TipoProcesoRepository tipoProceso;

	

	public MapperTipoProceso mapperTipoProceso = new MapperTipoProceso();

	private static Logger logger = LoggerFactory.getLogger(ProcesoServicioImpl.class);

	public ProcesoServicioImpl(ProcesoRepository repository,
			TipoProcesoRepository tipoProceso) {
		this.repository = repository;		
		this.tipoProceso = tipoProceso;
	}

	/**
	 * Metodo que se encarga de marcar un proceso como error.
	 * 
	 * @param identArmado proceso que se desea marcar.
	 * @param mensaje     para ser mostrado por consola.
	 */
	public void marcarProcesoError(ProcesoDTO procesoDTO, String mensaje, String identArmado) {
//		try {

		/*
		 * modificar consumo de entidad final Proceso proceso =
		 * consultarProceso(procesoDTO.getIdProceso());
		 * 
		 * proceso.setUsuarioModificacion(procesoDTO.getUsuarioCreacion());
		 * proceso.setEstado(EnumEstadoProceso.PROCESO_VALIDADO_CON_ERRORES.getCodigo())
		 * ; proceso.setFechaFin(new Date()); jpa.actualizarEntidad(proceso);
		 */

		// registrarErrorProceso(procesoDTO, mensaje, identArmado);

//		} catch (SistemaExcepcion e) {
		/*
		 * e.printStackTrace(); logger.
		 * error("Error Aplicacion Aprovisionamiento Prueba Electronica - ProcesoServicio- marcarProcesoError: "
		 * + e.getMessage());
		 */

//		} catch (Exception e) {
//			e.printStackTrace();
//			logger.error("Error al marcar error proceso: " + e.getMessage());
//		}
	}

	public Proceso consultarProceso(Long idProceso) {// throws SistemaExcepcion {
		return repository.findById(idProceso).get();
	}

	/*
	 * public void registrarErrorProceso(ProcesoDTO procesoDTO, String mensaje,
	 * String identArmado) { // throws SistemaExcepcion { LogProceso logProceso =
	 * new LogProceso(); logProceso.setIdProceso(procesoDTO.getIdProceso());
	 * logProceso.setIdItemArmado(identArmado);
	 * logProceso.setDescripcionError(mensaje); logProceso.setFechaGeneroError(new
	 * Date()); logProceso.setFechaCreacion(new Date());
	 * logProceso.setUsuarioCreacion(procesoDTO.getUsuarioCreacion());
	 * jpa.actualizarEntidad(logProceso); }
	 */

	/**
	 * Metodo que se encarga actualizar el proceso
	 * 
	 * @param procesoDTO con el idProceso proceso que se desea marcar.
	 * 
	 *                   public void actualizarProceso(ProcesoDTO procesoDTO) { try
	 *                   {
	 *                   jpa.actualizarEntidad(procesoDTO.convertirEntity(procesoDTO));
	 *                   } catch (Exception e) { logger.error("Error Aplicacion
	 *                   Aprovisionamiento Prueba Electronica - ProcesoServicio-
	 *                   actualizarProceso: " + e.getMessage()); } }
	 */

	/**
	 * Metodo que se encarga de consultar todos los procesos
	 * 
	 * @return List<ProcesoDTO> lista de procesos consultados
	 * 
	 *         public List<ProcesoDTO> consultarProcesos(Long idRol) throws
	 *         Exception { ArrayList<ProcesoDTO> listaProcesoDTO = null; try {
	 *         List<ParametroQuery<?>> params = new ArrayList<ParametroQuery<?>>();
	 *         params.add(ParametroQuery.crearParametro(1, idRol));
	 * 
	 *         List<Object[]> procesosList =
	 *         this.jpa.consultarPorNamedQuery(Proceso.CONSULTAR_PROCESOS, params);
	 *         if (procesosList != null) { listaProcesoDTO = new
	 *         ArrayList<ProcesoDTO>(); ProcesoDTO procesoDTO = null; for (Object[]
	 *         ob : procesosList) { procesoDTO = new ProcesoDTO();
	 *         procesoDTO.setIdProceso(Long.valueOf(((Number) ob[0]).longValue()));
	 *         procesoDTO.setNombreProceso((String) ob[1]);
	 *         procesoDTO.setEstado(Long.valueOf(((Number) ob[2]).longValue()));
	 *         procesoDTO.setFechaInicio((Date) ob[3]);
	 *         procesoDTO.setFechaFin((Date) ob[4]);
	 *         procesoDTO.setNumeroRegistrosProcesados(Integer.valueOf(((Number)
	 *         ob[5]).intValue()));
	 *         procesoDTO.setNumeroTotalRegistros(Integer.valueOf(((Number)
	 *         ob[6]).intValue()));
	 *         procesoDTO.setNumeroRegProcExito(Integer.valueOf(((Number)
	 *         ob[7]).intValue()));
	 *         procesoDTO.setNumeroRegProcError(Integer.valueOf(((Number)
	 *         ob[8]).intValue())); procesoDTO.setPorcentaje(Long.valueOf(((Number)
	 *         ob[9]).intValue())); if ((Number) ob[10] != null) {
	 *         procesoDTO.setIdAplicacion(Long.valueOf(((Number)
	 *         ob[10]).intValue())); } procesoDTO.setNombreAplicacion((String)
	 *         ob[11]); listaProcesoDTO.add(prepararObjetoProceso(procesoDTO)); } }
	 *         } catch (Exception e) { logger.error("Error Aplicacion
	 *         Aprovisionamiento Prueba Electronica - ProcesoServicio-
	 *         consultarProcesos: " + e.getMessage()); throw new Exception(e); }
	 * 
	 *         return listaProcesoDTO; }
	 */

	/**
	 * Metodo que se encarga de preparar el objeto para que se vea correctamente en
	 * la pagina
	 * 
	 * @param procesoDTO proceso que se desea transformar.
	 * @return procesoDTO objeto transformado con las conversiones necesarias
	 * 
	 *         private ProcesoDTO prepararObjetoProceso(ProcesoDTO procesoDTO) {
	 * 
	 *         if(procesoDTO.getEstado()!=null){
	 *         procesoDTO.setDescripEstado(EnumEstadoProceso.getEnumEstadoProceso(procesoDTO.getEstado()).getDescripcion());
	 *         }
	 * 
	 *         if (procesoDTO.getFechaInicio() != null) {
	 *         procesoDTO.setFechaInicioFormateada(
	 *         DateUtils.format(procesoDTO.getFechaInicio(),
	 *         DateUtils.FORMAT_ddMMyyyyHHmmss)); } if (procesoDTO.getFechaFin() !=
	 *         null) { procesoDTO.setFechaFinalFormateada(
	 *         DateUtils.format(procesoDTO.getFechaFin(),
	 *         DateUtils.FORMAT_ddMMyyyyHHmmss)); }
	 * 
	 *         procesoDTO.setNombreProceso(EnumTipoProceso.get(procesoDTO.getNombreProceso()).getDescripcion());
	 * 
	 *         if (procesoDTO.getNumeroTotalRegistros() != null &&
	 *         procesoDTO.getNumeroRegistrosProcesados() != null &&
	 *         !procesoDTO.getNumeroTotalRegistros().equals(0)) {
	 *         procesoDTO.setPorcentaje(Long
	 *         .valueOf((procesoDTO.getNumeroRegistrosProcesados() * 100 /
	 *         procesoDTO.getNumeroTotalRegistros()))); } return procesoDTO; }
	 */

	/**
	 * Metodo que se encarga de consultar el detalle del proceso
	 * 
	 * @return DetalleProcesoDTO lista de procesos consultados
	 * 
	 *         public DetalleProcesoDTO consultarDetalleProceso(Long idProceso)
	 *         throws Exception { DetalleProcesoDTO detalleProcesoDTO = null;
	 *         ArrayList<LogProcesoDTO> listaLogProcesoDTO = null; try {
	 * 
	 *         ProcesoDTO procesoDTO = this.consultarEstadoProceso(idProceso);
	 * 
	 *         if (procesoDTO != null) { List<ParametroQuery<?>> params = new
	 *         ArrayList<ParametroQuery<?>>();
	 *         params.add(ParametroQuery.crearParametro(1, idProceso));
	 * 
	 *         List<Object[]> logProcesoList =
	 *         this.jpa.consultarPorNamedQuery(LogProceso.CONSULTAR_LOGPROCESO,
	 *         params);
	 * 
	 *         if (logProcesoList != null) {
	 * 
	 *         listaLogProcesoDTO = new ArrayList<LogProcesoDTO>(); LogProcesoDTO
	 *         logProcesoDTO = null;
	 * 
	 *         for (Object[] ob : logProcesoList) { logProcesoDTO = new
	 *         LogProcesoDTO(); logProcesoDTO.setIdLogProceso(Long.valueOf(((Number)
	 *         ob[0]).longValue()));
	 *         logProcesoDTO.setIdProceso(Long.valueOf(((Number)
	 *         ob[1]).longValue())); if (ob[2] != null) {
	 *         logProcesoDTO.setIdItem(Long.valueOf(((Number) ob[2]).longValue()));
	 *         }
	 * 
	 *         logProcesoDTO.setIdArmado((String) ob[3]);
	 *         logProcesoDTO.setIdCarpeta((String) ob[4]);
	 *         logProcesoDTO.setDescripcionError((String) ob[5]);
	 *         logProcesoDTO.setFechaCreacion((Date) ob[6]);
	 *         logProcesoDTO.setfechaInicioFormateada(
	 *         DateUtils.format(logProcesoDTO.getFechaCreacion(),
	 *         DateUtils.FORMAT_ddMMyyyyHHmmss));
	 *         listaLogProcesoDTO.add(logProcesoDTO); } } procesoDTO =
	 *         prepararObjetoProceso(procesoDTO); if
	 *         (procesoDTO.getNombreProceso().equals(EnumTipoProceso.TRANFORMAR_QTI_HTML.getNombre()))
	 *         { procesoDTO.setNumeroRegProcError(
	 *         procesoDTO.getNumeroTotalRegistros() -
	 *         procesoDTO.getNumeroRegistrosProcesados()); } else { if
	 *         (listaLogProcesoDTO != null) {
	 *         procesoDTO.setNumeroRegProcError(listaLogProcesoDTO.size()); } }
	 *         detalleProcesoDTO = new DetalleProcesoDTO();
	 *         detalleProcesoDTO.setListaLogProcesoDTO(listaLogProcesoDTO); if
	 *         (procesoDTO.getNumeroTotalRegistros() != null &&
	 *         procesoDTO.getNumeroRegistrosProcesados() != null &&
	 *         !procesoDTO.getNumeroTotalRegistros().equals(0)) {
	 *         procesoDTO.setPorcentaje(Long.valueOf(
	 *         (procesoDTO.getNumeroRegistrosProcesados() * 100 /
	 *         procesoDTO.getNumeroTotalRegistros()))); }
	 *         detalleProcesoDTO.setProcesoDTO(procesoDTO);
	 * 
	 *         } } catch (Exception e) { logger.error("Error Aplicacion
	 *         Aprovisionamiento Prueba Electronica - ProcesoServicio-
	 *         consultarProcesos: " + e.getMessage()); throw new Exception(e); }
	 * 
	 *         return detalleProcesoDTO; }
	 */

	/*
	 * private void setearDescripcion(final ProcesoDTO procesoDTO) { if
	 * (Long.valueOf(procesoDTO.getEstado())
	 * .compareTo(Long.valueOf(EnumEstadoProceso.PROCESO_VALIDADO.getCodigo())) ==
	 * 0) { procesoDTO.setDescripEstado(EnumEstadoProceso.PROCESO_VALIDADO.
	 * getDescripcion()); } else if (Long.valueOf(procesoDTO.getEstado())
	 * .compareTo(Long.valueOf(EnumEstadoProceso.PROCESO_EN_VALIDACION.getCodigo
	 * ())) == 0) {
	 * procesoDTO.setDescripEstado(EnumEstadoProceso.PROCESO_EN_VALIDACION.
	 * getDescripcion()); } else if (Long.valueOf(procesoDTO.getEstado())
	 * .compareTo(Long.valueOf(EnumEstadoProceso.PROCESO_VALIDADO_CON_ERRORES.
	 * getCodigo())) == 0) { procesoDTO.setDescripEstado(EnumEstadoProceso.
	 * PROCESO_VALIDADO_CON_ERRORES.getDescripcion()); } else if
	 * (Long.valueOf(procesoDTO.getEstado())
	 * .compareTo(Long.valueOf(EnumEstadoProceso.PROCESO_SIN_REGISTROS_PROCESAR.
	 * getCodigo())) == 0) { procesoDTO.setDescripEstado(EnumEstadoProceso.
	 * PROCESO_SIN_REGISTROS_PROCESAR.getDescripcion()); } else if
	 * (Long.valueOf(procesoDTO.getEstado())
	 * .compareTo(Long.valueOf(EnumEstadoProceso.PROCESO_FINALIZADO.getCodigo()) )
	 * == 0) { procesoDTO.setDescripEstado(EnumEstadoProceso.PROCESO_FINALIZADO.
	 * getDescripcion()); } else if (Long.valueOf(procesoDTO.getEstado())
	 * .compareTo(Long.valueOf(EnumEstadoProceso.PROCESO_FINALIZADO_ERRORES.
	 * getCodigo())) == 0) {
	 * procesoDTO.setDescripEstado(EnumEstadoProceso.PROCESO_FINALIZADO_ERRORES.
	 * getDescripcion()); } }
	 * 
	 * 
	 * public void actualizarAvanceProceso(ProcesoDTO procesoDTO) { try {
	 * List<ParametroQuery<?>> params = new ArrayList<ParametroQuery<?>>();
	 * params.add(ParametroQuery.crearParametro(1,
	 * procesoDTO.getNumeroRegistrosProcesados()));
	 * params.add(ParametroQuery.crearParametro(2,
	 * procesoDTO.getNumeroTotalRegistros()));
	 * params.add(ParametroQuery.crearParametro(3, procesoDTO.getIdProceso()));
	 * this.jpa.actualizarPorNamedQuery(Proceso.ACTUALIZAR_PROCESO, params); } catch
	 * (SistemaExcepcion e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * }
	 */

	

	/**
	 * Metodo que se encarga de consultar un proceso
	 * 
	 * @return ProcesoDTO
	 * 
	 *         public ProcesoDTO consultarEstadoProceso(Long idProceso) throws
	 *         Exception { ProcesoDTO procesoDTO = null; try {
	 *         List<ParametroQuery<?>> params = new ArrayList<ParametroQuery<?>>();
	 *         params.add(ParametroQuery.crearParametro(1, idProceso));
	 * 
	 *         Object[] proceso =
	 *         this.jpa.consultarPorNamedQueryUniqueResult(Proceso.CONSULTAR_PROCESO,
	 *         params); if (proceso != null) { procesoDTO = new ProcesoDTO();
	 *         procesoDTO.setIdProceso(idProceso);
	 *         procesoDTO.setEstado(Long.valueOf(((Number) proceso[0]).intValue()));
	 *         procesoDTO.setNombreProceso(String.valueOf((String) proceso[1]));
	 *         procesoDTO.setNumeroRegistrosProcesados(Integer.valueOf(((Number)
	 *         proceso[2]).intValue()));
	 *         procesoDTO.setNumeroTotalRegistros(Integer.valueOf(((Number)
	 *         proceso[3]).intValue()));
	 *         procesoDTO.setNumeroRegProcExito(Integer.valueOf(((Number)
	 *         proceso[4]).intValue()));
	 *         procesoDTO.setNumeroRegProcError(Integer.valueOf(((Number)
	 *         proceso[5]).intValue()));
	 *         procesoDTO.setPorcentaje(Long.valueOf(((Number)
	 *         proceso[6]).intValue())); } } catch (Exception e) {
	 *         logger.error("Error Aplicacion Aprovisionamiento Prueba Electronica -
	 *         ProcesoServicio- consultarProcesos: " + e.getMessage()); throw new
	 *         Exception(e); }
	 * 
	 *         return procesoDTO; }
	 */

	/**
	 * M�todo encargado de devolver los Tipos de procesos Activos
	 * 
	 * @return
	 */

	public List<TipoProcesoDTO> consultarProcesosActivos(Long idRol) {
		ArrayList<TipoProcesoDTO> listaTipoProcesoDTO = new ArrayList<TipoProcesoDTO>();

		Optional<List<TipoProceso>> tipo = tipoProceso.findByIdRol(idRol);

		if (tipo.isPresent()) {
			for (TipoProceso tp : tipo.get()) {
				listaTipoProcesoDTO.add(mapperTipoProceso.toDto(tp));
			}
		}

		return listaTipoProcesoDTO;
	}

	

}
