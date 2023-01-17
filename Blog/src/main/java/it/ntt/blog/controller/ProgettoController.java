package it.ntt.blog.controller;


import it.ntt.blog.business.interf.ProgettoBO;
import it.ntt.blog.model.Categoria;
import it.ntt.blog.model.Progetto;
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
@RequestMapping("/admin/progetti")
public class ProgettoController {

    @Autowired
    ProgettoBO progettoBO;

    @GetMapping(path = {"/all"})
    public ModelAndView getProgetti(){
        ModelAndView currentView =new ModelAndView("/progettoSetting.jsp");

        List<Progetto> progetti = progettoBO.getAll();

        currentView.addObject("progetti",progetti);
        return currentView;
    }

    @GetMapping(path = {"/delete"})
    public ModelAndView deleteProgetto(@RequestParam(name="id") String id){
        ModelAndView currentView =new ModelAndView("/progettoSetting.jsp");

        Long l_id = Long.parseLong(id);
        progettoBO.deleteProgetto(l_id);

        List<Progetto> progetti = progettoBO.getAll();
        currentView.addObject("progetti",progetti);
        return currentView;
    }

    @PostMapping(path = {"/insert"})
    public ModelAndView insertSkill(
            @RequestParam(name="name") String name,
            @RequestParam(name="description") String description,
            @RequestParam(name="link") String link
    ){
        ModelAndView currentView =new ModelAndView("/progettoSetting.jsp");

        progettoBO.insertProgetto(name,description,link);

        List<Progetto> progetti = progettoBO.getAll();
        currentView.addObject("progetti",progetti);
        return currentView;
    }

    @PostMapping(path = {"/update"})
    public ModelAndView updateSkill(
            @RequestParam(name="id") String id,
            @RequestParam(name="name") String name,
            @RequestParam(name="description") String description,
            @RequestParam(name="link") String link
    ){
        ModelAndView currentView =new ModelAndView("/progettoSetting.jsp");

        Long l_id = Long.parseLong(id);
        progettoBO.updateProgetto(l_id,name,description,link);

        List<Progetto> progetti = progettoBO.getAll();
        currentView.addObject("progetti",progetti);
        return currentView;
    }


}
