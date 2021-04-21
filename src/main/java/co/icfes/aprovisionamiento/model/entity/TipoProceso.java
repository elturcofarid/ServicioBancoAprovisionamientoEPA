package co.icfes.aprovisionamiento.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "APROV_TIPOPROCESO")
@Data
public class TipoProceso {
	
	@Id
	@Column(name = "TIPO_ID")
	public Long idTipo;
	
	@Column(name = "TIPO_NOMBRE")
	public String tipoNombre;

	@Column(name = "TIPO_ENUM")
	public String tipoEnum;
	
	@Column(name = "TIPO_ESTADO")
	public Long tipoEstado;

	
}
