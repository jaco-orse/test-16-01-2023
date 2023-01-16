package it.ntt.blog.business.interf;

import it.ntt.blog.model.Categoria;

import java.util.List;

public interface CategoriaBO {
    public List<Categoria> getAll();
    public List<Categoria> getCatWithSkill();
    public void insertCategoria(String name);
    public void updateCategoria(Long id, String name);
    public void deleteCategoria(Long id);
}
