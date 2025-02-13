package com.veterinaria.patitas.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.veterinaria.patitas.bean.CitasDTO;
import com.veterinaria.patitas.service.CitasService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/RestC/")
@Slf4j
public class CitasRestControler {
	
	@Autowired
	CitasService citasService;
	
	@PostMapping("RegistraCita")
	public ResponseEntity<String> registraCita(@RequestBody CitasDTO citaDto){
		
		citasService.registraCita(citaDto);
		log.info("Cita " + citaDto.toString() + " fue agregada");
		return new ResponseEntity<>("Cita Agregada",HttpStatus.CREATED);
	}
	
	@DeleteMapping("EliminaCita")
	public ResponseEntity<String> eliminaCita(@RequestBody Integer idCita){
		
		citasService.eliminaCita(idCita);
		
		log.info("Cita " + idCita + " fue eliminada");
		return new ResponseEntity<>("Cita Eliminada",HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("ConsultarCitas")
	public ResponseEntity<List> consultaCita(){
		
		List<CitasDTO> citaList = citasService.consultaCitas();
		log.info("Se encontraron " + citaList.size() + " citas");
		return new ResponseEntity<>(citaList,HttpStatus.ACCEPTED);
	}
}


