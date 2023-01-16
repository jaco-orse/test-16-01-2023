package it.ntt.blog.business.implementation;

import it.ntt.blog.business.interf.SkillBO;
import it.ntt.blog.model.Categoria;
import it.ntt.blog.model.Skill;
import it.ntt.blog.repositories.CategoriaRepository;
import it.ntt.blog.repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillBOImpl implements SkillBO {
    @Autowired
    SkillRepository skillRepository;
    @Autowired
    CategoriaRepository categoriaRepository;

    public List<Skill> getAll() {
        return skillRepository.findAll();
    }

    public void insertSkill(String name, String description, Long id_categoria){
        Categoria choosenCat = categoriaRepository.findById(id_categoria).orElseThrow();
        Skill skill = new Skill();
        skill.setName(name);
        skill.setDescription(description);
        skill.setCategoria(choosenCat);
        skillRepository.save(skill);
        return;
    }

    public void deleteSkill(Long id){
        skillRepository.deleteById(id);
    }

    public void updateSkill(Long id, String name, String description, Long id_categoria){
        Categoria choosenCat = categoriaRepository.findById(id_categoria).orElseThrow();
        Skill choosenSkill = skillRepository.findById(id).orElseThrow();
        choosenSkill.setName(name);
        choosenSkill.setDescription(description);
        choosenSkill.setCategoria(choosenCat);
        return;
    }
}
