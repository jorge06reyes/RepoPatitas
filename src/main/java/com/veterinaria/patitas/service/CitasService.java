package com.veterinaria.patitas.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.veterinaria.patitas.bean.CitasDTO;
import com.veterinaria.patitas.entity.CitasEntity;
import com.veterinaria.patitas.repository.CitasReposity;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CitasService {

	@Autowired
	CitasReposity citasReposity;

	public boolean registraCita(CitasDTO citaDto) {
		
		try {
			ModelMapper mp= new ModelMapper();
			CitasEntity  citaEntity = mp.map(citaDto, CitasEntity.class);
			citasReposity.save(citaEntity);
			return true;
		}catch (Exception e) {
			return false;
		}
	
	}
	
	
	public boolean eliminaCita(Integer idCita) {
		citasReposity.deleteById(idCita);
		return true;
	}
	
	public List<CitasDTO> consultaCitas(){
		List<CitasDTO> citasList = new ArrayList<CitasDTO>();
		citasReposity.findAll().forEach(cita -> {
			citasList.add(new ModelMapper().map(cita, CitasDTO.class));
		});
		return citasList;
	}

}
