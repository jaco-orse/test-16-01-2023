package it.ntt.blog.repositories;

import it.ntt.blog.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    public List<Categoria> findCategoriaBySkillsNotNull();
}
