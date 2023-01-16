package it.ntt.blog.controller;

import it.ntt.blog.business.interf.CategoriaBO;
import it.ntt.blog.business.interf.ProgettoBO;
import it.ntt.blog.business.interf.SkillBO;
import it.ntt.blog.model.Categoria;
import it.ntt.blog.model.Progetto;
import it.ntt.blog.model.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class homeController {
    @Autowired
    CategoriaBO categoriaBO;
    @Autowired
    SkillBO skillBO;
    @Autowired
    ProgettoBO progettoBO;

    @GetMapping(path = {"/", "/home"})
    public ModelAndView home() {
        ModelAndView currentView = new ModelAndView("/home.jsp");
        List<Categoria> categorie = categoriaBO.getAll();
        currentView.addObject("categorie",categorie);
        return currentView;
    }

    @GetMapping(path = {"/skills"})
    public ModelAndView getSkills(){
        ModelAndView currentView =new ModelAndView("/skills.jsp");
        List<Skill> skills = skillBO.getAll();
        currentView.addObject("skills",skills);
        return currentView;
    }

    @GetMapping(path = {"/progetti"})
    public ModelAndView getProgetti(){
        ModelAndView currentView =new ModelAndView("/progetti.jsp");
        List<Progetto> progetti = progettoBO.getAll();
        currentView.addObject("progetti",progetti);
        return currentView;
    }

}