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

    public List<Categoria> getCatWithSkill(){
        return categoriaRepository.findCategoriaBySkillsNotNull();
    }

    public void insertCategoria(String name){
        Categoria newCat = new Categoria();
        newCat.setName(name);
        categoriaRepository.save(newCat);
        return;
    }

    public void updateCategoria(Long id, String name){
        Categoria curr = categoriaRepository.findById(id).orElseThrow();
        curr.setName(name);
        categoriaRepository.save(curr);
        return;
    }

    public void deleteCategoria(Long id){
        categoriaRepository.deleteById(id);
        return;
    }

}
