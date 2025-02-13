package com.veterinaria.patitas.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class CitasDTO {
	
	Integer id;
	String nombreCliente;
	String nombreMascota;
	String razonCita;
	Date fecha;
}
