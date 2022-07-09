package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CheckContoller {

    //localhost:8080/demo/start - Адрес, контроллер сможет принять запрос гет
    @GetMapping(value = "/start")
    public String doSmth(Model model) {
        System.out.println("Proverka");
        return "index";
    }
}
