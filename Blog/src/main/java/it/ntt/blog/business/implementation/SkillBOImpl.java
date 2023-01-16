package it.ntt.blog.business.implementation;

import it.ntt.blog.business.interf.SkillBO;
import it.ntt.blog.model.Skill;
import it.ntt.blog.repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillBOImpl implements SkillBO {
    @Autowired
    SkillRepository skillRepository;

    public List<Skill> getAll() {
        return skillRepository.findAll();
    }
}
