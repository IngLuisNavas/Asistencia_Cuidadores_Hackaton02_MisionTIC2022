package dao;

import model.Cuidador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuidadorDAO extends JpaRepository<Cuidador, Integer> {
}
