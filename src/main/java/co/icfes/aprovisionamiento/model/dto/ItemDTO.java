package co.icfes.aprovisionamiento.model.dto;

import java.nio.file.Path;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//import co.gov.icfes.aprovisionamientoe.transformador.modelo.Item;


/**
 * @author ygamboa Clase encargada enviar al bean la informaci�n del paso de
 *         cada actividad
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemDTO {//implements Serializable {

	public Long idItem;
	public Long estado;
	public String identificadorArmado ;
	public String valor;
	public String nombreCarpeta;
	public String tipoRespuesta;
	public Date fechaCreacion;
	public String usuarioCreacion;
	public Date fechaModificacion;
	public String usuarioModificacion;
	public Path rutaOrigen;
	public Path rutaDestino;
	public Boolean procesado;
	public String estadoCargueItem; 
    public String observacionesValidacion;
    public String fechaCargueFormateada;
    public Long ordenPrueba;
    public String estadoPreinstalacion;
    public String recursosItem;
    public String estadoCargueItemMovil;
    public String  observacionesValidacionMovil;
    	
}
