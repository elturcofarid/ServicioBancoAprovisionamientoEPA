package co.icfes.aprovisionamiento.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import co.icfes.aprovisionamiento.mapper.MapperExamenAplicacion;
import co.icfes.aprovisionamiento.model.dto.AplicacionDTO;
import co.icfes.aprovisionamiento.model.entity.ExamenAplicacion;
import co.icfes.aprovisionamiento.repository.ExamenAplicacionRepository;

@Service
public class AplicacionServicioImpl implements AplicacionServicio{

	
	private ExamenAplicacionRepository examenRepository;
	
	public MapperExamenAplicacion mapper = new MapperExamenAplicacion();
	
	public AplicacionServicioImpl(ExamenAplicacionRepository examenRepository) {
		this.examenRepository = examenRepository; 
	}
	
	public List<AplicacionDTO> consultarAplicacionesInstaladas() { // throws Exception {
		ArrayList<AplicacionDTO> aplicacionesHabilitadas = new ArrayList<AplicacionDTO>();
		List<ExamenAplicacion> f = (List<ExamenAplicacion>) examenRepository.findAll();

		for (ExamenAplicacion exa : f) {
			aplicacionesHabilitadas.add(mapper.toDto(exa));
		}

		return aplicacionesHabilitadas;
	}
	
	
	/*
	 * Antes:: getAplicacionesHabilitadas
	 */
	public List<AplicacionDTO> consultarListaAplicacionesActivas() {// throws Exception {
		ArrayList<AplicacionDTO> aplicacionesHabilitadas = new ArrayList<AplicacionDTO>();
		List<ExamenAplicacion> f = (List<ExamenAplicacion>) examenRepository.findAplicacionActiva();

		for (ExamenAplicacion exa : f) {
			aplicacionesHabilitadas.add(mapper.toDto(exa));
		}

		return aplicacionesHabilitadas;
	}

	public List<AplicacionDTO> consultarAplicacionesVerificadas() {
		ArrayList<AplicacionDTO> aplicacionesHabilitadas = new ArrayList<AplicacionDTO>();
		List<ExamenAplicacion> f = (List<ExamenAplicacion>) examenRepository.findVerificados();

		for (ExamenAplicacion exa : f) {
			aplicacionesHabilitadas.add(mapper.toDto(exa));
		}

		return aplicacionesHabilitadas;
	}
}
