package co.edu.uniquindio.clinica.repositorios;


import co.edu.uniquindio.clinica.modelo.entidades.EPS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EPSRepo extends JpaRepository<EPS, Long> {
}

