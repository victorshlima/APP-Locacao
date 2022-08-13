package com.victation.AppLocacao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.http.HttpServletRequest;

@Controller
public class LocatarioController {

    @GetMapping("/index")
    public String getLocatario (HttpServletRequest request){
        request.setAttribute("nome", "Victor");
        return "index"; // "index" = pagina jsp dentro do template //spring.thymeleaf.prefix=classpath:/templates/
    }

}
