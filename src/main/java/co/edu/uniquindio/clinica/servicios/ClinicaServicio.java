package co.edu.uniquindio.clinica.servicios;

import co.edu.uniquindio.clinica.modelo.entidades.Ciudad;
import co.edu.uniquindio.clinica.modelo.entidades.EPS;
import co.edu.uniquindio.clinica.modelo.entidades.Especialidad;
import co.edu.uniquindio.clinica.modelo.entidades.Tipo_Sangre;
import co.edu.uniquindio.clinica.repositorios.CiudadRepo;
import co.edu.uniquindio.clinica.repositorios.EPSRepo;
import co.edu.uniquindio.clinica.repositorios.EspecialidadRepo;
import co.edu.uniquindio.clinica.repositorios.Tipo_SangreRepo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/clinica")
public interface ClinicaServicio {


    CiudadRepo ciudadRepo() throws Exception;


    EPSRepo epsRepo() throws Exception;


    EspecialidadRepo especialidadRepo() throws Exception;


    Tipo_SangreRepo tipo_sangreRepo() throws Exception;




}


