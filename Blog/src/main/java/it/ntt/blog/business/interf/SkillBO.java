package it.ntt.blog.business.interf;

import it.ntt.blog.model.Skill;

import java.util.List;

public interface SkillBO {
    public List<Skill> getAll();
    public void insertSkill(String name, String description, Long id_categoria);
    public void deleteSkill(Long id);
    public void updateSkill(Long id, String name, String description, Long id_categoria);
}
