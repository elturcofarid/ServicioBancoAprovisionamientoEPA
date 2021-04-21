package co.icfes.aprovisionamiento.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

import lombok.Data;

@Entity
@Table(name = "PREL_EXAMAPLICACION")
@Data
public class ExamenAplicacion {

	@Id
	@Column(name = "EXAP_APLIID")
	public Long exapApliId;
	
	@Column(name = "EXAP_APLINOMBRE")
	public String exapApliNombre;
	
	@Column(name = "EXAP_APLIFECHAINICIO")
	public Date exapApliFechaInicio;
	
	@Column(name = "EXAP_APLIFECHAFIN")
	public Date exapApliFechaFin;
	
	@Column(name = "EXAP_DESCRIPCION")
	public String exapDescripcion;
	
	@Column(name = "EXAP_APLIESTADO")	
	public String exapApliEstado;
	
	@Column(name = "EXAM_APROVESTADO")
	public String exapAproEstado;
//	WHERE EXAP_APLIESTADO    =1
//	AND EX.EXAM_APROVESTADO=3
}
