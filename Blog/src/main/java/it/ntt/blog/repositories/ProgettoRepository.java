package it.ntt.blog.repositories;

import it.ntt.blog.model.Progetto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgettoRepository extends JpaRepository<Progetto, Long> {
}
