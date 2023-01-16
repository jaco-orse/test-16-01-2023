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
}
