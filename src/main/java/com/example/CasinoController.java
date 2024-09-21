package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CasinoController {

    @GetMapping("/home")
    public String homePage() {
        return "home";  // Возвращает представление home.jsp
    }
}
