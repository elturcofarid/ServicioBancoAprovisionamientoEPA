package co.icfes.aprovisionamiento.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.icfes.aprovisionamiento.model.dto.AplicacionDTO;
import co.icfes.aprovisionamiento.model.dto.ProcesoDTO;
import co.icfes.aprovisionamiento.service.AplicacionServicio;

@RestController
@RequestMapping("aplicacion")
public class AplicacionController {

	private AplicacionServicio aplicacionServicio;
	
	public  AplicacionController(AplicacionServicio aplicacionServicio) {
		this.aplicacionServicio = aplicacionServicio;
	}
	
	@GetMapping(path = "/listAplicacionesVerificadas")
	public List<AplicacionDTO> consultarAplicacionesVerificadas() {
		return aplicacionServicio.consultarAplicacionesVerificadas();
	}
	
	@GetMapping(path = "/listAplicacionesInstaladas")
	public List<AplicacionDTO> consultarAplicacionesInstaladas(){			
		return aplicacionServicio.consultarAplicacionesInstaladas();
	}
	
	@GetMapping(path = "/listAplicacionesActivas")
	public List<AplicacionDTO> consultarListaAplicacionesActivas() {
		return aplicacionServicio.consultarListaAplicacionesActivas();
	}
	
	
	
	
	
	
	
	
	
	
	
	/***/
	/**
	 * Permite validar si la aplicación no se encuentra en fechas de presentación, 
	 * en ese caso retorna TRUE
	 * @param procesoDTO
	 * @return
	 */
	private boolean preEliminarAplicacion(ProcesoDTO procesoDTO){
		Boolean rtaPreproceso = false;		
//		try {
			//rtaPreproceso = fachada.validarFechaInicioApp(procesoDTO.getIdAplicacion());
			
//			if (!rtaPreproceso) {
//				this.flagEliminarInstalacion = true;
//			}
//			
//		} catch (Exception e) {
//			logger.error("Error consultando la lista de Procesos- ListaProceso.java- preEliminarAplicacion: "
//					+ e.getMessage());
//		}		
		return rtaPreproceso;
	}
	
	
	
	
}
