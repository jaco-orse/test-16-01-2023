package it.ntt.blog.controller;

import it.ntt.blog.business.interf.CategoriaBO;
import it.ntt.blog.business.interf.SkillBO;
import it.ntt.blog.model.Categoria;
import it.ntt.blog.model.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/skills")
public class SkillController {

    @Autowired
    SkillBO skillBO;
    @Autowired
    CategoriaBO categoriaBO;

    @GetMapping(path = {"/all"})
    public ModelAndView getSkills(){
        ModelAndView currentView =new ModelAndView("/skillSetting.jsp");
        List<Skill> skills = skillBO.getAll();
        List<Categoria> categorie = categoriaBO.getAll();
        currentView.addObject("skills",skills);
        currentView.addObject("categorie",categorie);
        return currentView;
    }

    @GetMapping(path = {"/delete"})
    public ModelAndView deleteSkills(@RequestParam(name="id") String id){
        ModelAndView currentView =new ModelAndView("/skillSetting.jsp");

        Long l_id = Long.parseLong(id);
        skillBO.deleteSkill(l_id);

        List<Skill> skills = skillBO.getAll();
        List<Categoria> categorie = categoriaBO.getAll();
        currentView.addObject("skills",skills);
        currentView.addObject("categorie",categorie);
        return currentView;
    }

    @PostMapping(path = {"/insert"})
    public ModelAndView insertSkill(
            @RequestParam(name="name") String name,
            @RequestParam(name="description") String description,
            @RequestParam(name="categoria") String id_categoria
            ){
        ModelAndView currentView =new ModelAndView("/skillSetting.jsp");

        Long l_id = Long.parseLong(id_categoria);
        skillBO.insertSkill(name,description,l_id);

        List<Skill> skills = skillBO.getAll();
        List<Categoria> categorie = categoriaBO.getAll();
        currentView.addObject("skills",skills);
        currentView.addObject("categorie",categorie);
        return currentView;
    }

    @PostMapping(path = {"/update"})
    public ModelAndView updateSkill(
            @RequestParam(name="id") String id,
            @RequestParam(name="name") String name,
            @RequestParam(name="description") String description,
            @RequestParam(name="categoria") String id_categoria){

        ModelAndView currentView =new ModelAndView("/skillSetting.jsp");

        Long l_id = Long.parseLong(id);
        Long l_id_cat = Long.parseLong(id_categoria);

        skillBO.updateSkill(l_id,name,description,l_id_cat);

        List<Skill> skills = skillBO.getAll();
        List<Categoria> categorie = categoriaBO.getAll();
        currentView.addObject("skills",skills);
        currentView.addObject("categorie",categorie);
        return currentView;

    }
}
