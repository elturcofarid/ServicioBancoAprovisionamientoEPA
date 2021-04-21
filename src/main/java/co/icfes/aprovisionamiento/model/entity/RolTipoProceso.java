package co.icfes.aprovisionamiento.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "APROV_ROLTIPOPROCESO")

public class RolTipoProceso {
		
		@Id
		@Column(name = "TIPO_ID")
		private Long idTipo;
		
		@Column(name = "ROL_ID")
		private Long idRol;
}
