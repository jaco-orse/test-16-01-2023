package it.ntt.blog.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(Exception.class)
    public ModelAndView exception(Exception e){
        ModelAndView model = new ModelAndView("error.jsp");
        model.addObject("error",e.getClass().getName());
        return model;
    }
}
