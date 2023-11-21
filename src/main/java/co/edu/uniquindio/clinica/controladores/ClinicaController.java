package co.edu.uniquindio.clinica.controladores;

import co.edu.uniquindio.clinica.modelo.entidades.Ciudad;
import co.edu.uniquindio.clinica.modelo.entidades.EPS;
import co.edu.uniquindio.clinica.modelo.entidades.Especialidad;
import co.edu.uniquindio.clinica.modelo.entidades.Tipo_Sangre;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ClinicaController {

    @GetMapping("/ciudades")
    public List<Ciudad> listarCiudades(){

        return null;
    }

    @GetMapping("/EPS")
    public List<EPS> listarEPS(){

        return null;

    }

    @GetMapping("/especialidades")
    public List<Especialidad> listarEspecialidades(){

        return null;
    }

    @GetMapping("/tipo_sangre")
    public List<Tipo_Sangre> listarTipo_sangre(){

        return null;
    }


}
