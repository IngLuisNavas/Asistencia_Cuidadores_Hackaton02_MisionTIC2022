package dao;

import model.Asistente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AsistenteDAO extends JpaRepository<Asistente, Integer> {
}
