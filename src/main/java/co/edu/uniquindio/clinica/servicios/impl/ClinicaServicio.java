package co.edu.uniquindio.clinica.servicios.impl;

import co.edu.uniquindio.clinica.modelo.entidades.Ciudad;
import co.edu.uniquindio.clinica.modelo.entidades.EPS;
import co.edu.uniquindio.clinica.modelo.entidades.Especialidad;
import co.edu.uniquindio.clinica.modelo.entidades.Tipo_Sangre;
import co.edu.uniquindio.clinica.repositorios.CiudadRepo;
import co.edu.uniquindio.clinica.repositorios.EPSRepo;
import co.edu.uniquindio.clinica.repositorios.EspecialidadRepo;
import co.edu.uniquindio.clinica.repositorios.Tipo_SangreRepo;
import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


public class ClinicaServicio {


    private CiudadRepo ciudadRepo;
    private EPSRepo epsRepo;
    private EspecialidadRepo especialidadRepo;
    private Tipo_SangreRepo tipo_sangreRepo;



    @GetMapping("/ciudades")
    private ResponseEntity<List<Ciudad>> listarCiudades(){

        List<Ciudad> ciudades = ciudadRepo.findAll();
        return new ResponseEntity<>(ciudades, HttpStatus.OK);

    }

    @GetMapping("/eps")
    private ResponseEntity<List<EPS>> listarEPS(){

        List<EPS> EPS = epsRepo.findAll();
        return new ResponseEntity<>(EPS, HttpStatus.OK);

    }

    @GetMapping("/especialidades")
    private ResponseEntity<List<Especialidad>> listarEspecialidades(){

        List<Especialidad> Especialidades = especialidadRepo.findAll();
        return new ResponseEntity<>(Especialidades, HttpStatus.OK);

    }

    @GetMapping("/tipos_sangre")
    private ResponseEntity<List<Tipo_Sangre>> listarTiposSangre(){

        List<Tipo_Sangre> Tipos_Sangre = tipo_sangreRepo.findAll();
        return new ResponseEntity<>(Tipos_Sangre, HttpStatus.OK);

    }

}
