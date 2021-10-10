package dao;

import model.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicioDAO extends JpaRepository<Servicio, Integer> {
}
