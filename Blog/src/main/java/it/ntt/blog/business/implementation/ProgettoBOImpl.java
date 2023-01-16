package it.ntt.blog.business.implementation;

import it.ntt.blog.business.interf.ProgettoBO;
import it.ntt.blog.model.Progetto;
import it.ntt.blog.repositories.ProgettoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgettoBOImpl implements ProgettoBO {
    @Autowired
    ProgettoRepository progettoRepository;

    public List<Progetto> getAll(){
        return progettoRepository.findAll();
    }

    public void insertProgetto(String name,String desription,String link){
        Progetto newProg = new Progetto();
        newProg.setName(name);
        newProg.setDescription(desription);
        newProg.setLink(link);
        progettoRepository.save(newProg);
        return;
    }

    public void deleteProgetto(Long id){
        progettoRepository.deleteById(id);
    }

    public void updateProgetto(Long id,String name,String description,String link){
        Progetto currP = progettoRepository.findById(id).orElseThrow();
        currP.setName(name);
        currP.setDescription(description);
        currP.setLink(link);
        progettoRepository.save(currP);
        return;
    }
}
