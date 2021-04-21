package co.icfes.aprovisionamiento.controller;

import javax.annotation.ManagedBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.icfes.aprovisionamiento.model.auth.dto.AppConfigurationDTO;
import co.icfes.aprovisionamiento.model.auth.dto.AuthorizationDTO;

/**
 * Bean que expone los servicios de autorizacion
 * @author djaime
 *
 */
@RestController
@RequestMapping("/auth")
public class AuthController {
	
	/** Logger de la clase */
	private static Logger logger = LoggerFactory.getLogger(AuthController.class);
	
	/**
	 * Constructor del bean
	 */
	public AuthController(){
		
	}

//	/** EJB para manejo de fachada */
//	@EJB
//	private IAuthFacade fachada;
	
	
	/**
	 * Servicio Rest de autorizacion, recibe como parametro-header
	 * el token generado en el proceso de autenticacion.
	 * @return AuthorizationDTO
	 */
	@GetMapping(path = "/authorize")
    public AuthorizationDTO authorize(@RequestParam("token") String token) {
		
		AuthorizationDTO listaProcesos = new AuthorizationDTO();
		try{			
			//listaProcesos = fachada.authorize(token);
		} catch(Exception e){
			logger.error("Error Servicio de autorizacion - Aprovisionamiento Prueba Electronica - authorize: " 
					+ e.getStackTrace());
		}
		return listaProcesos;
	}
	
	/**
	 * Servicio Rest de autorizacion, recibe como parametro-header
	 * el token generado en el proceso de autenticacion.
	 * @return AuthorizationDTO
	 */
	@GetMapping(path = "/authconfig")
    public AppConfigurationDTO getAppParams() {
		
		AppConfigurationDTO configuracion = new AppConfigurationDTO();
		try{			
			//configuracion = fachada.getAppConfiguration();
		} catch(Exception e){
			logger.error("Error Servicio de autorizacion - Aprovisionamiento Prueba Electronica - authorize: " 
					+ e.getStackTrace());
		}
		return configuracion;
	}
	
}
