package it.ntt.blog.business.interf;

import it.ntt.blog.model.Progetto;

import java.util.List;

public interface ProgettoBO {
    public List<Progetto> getAll();
    public void insertProgetto(String name,String desription,String link);
    public void deleteProgetto(Long id);
    public void updateProgetto(Long id,String name,String description,String link);
}
