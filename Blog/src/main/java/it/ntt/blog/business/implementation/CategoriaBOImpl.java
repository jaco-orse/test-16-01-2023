package it.ntt.blog.business.implementation;

import it.ntt.blog.business.interf.CategoriaBO;
import it.ntt.blog.model.Categoria;
import it.ntt.blog.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaBOImpl implements CategoriaBO {

    @Autowired
    CategoriaRepository categoriaRepository;

    public List<Categoria> getAll(){
        return categoriaRepository.findAll();
    }

}
