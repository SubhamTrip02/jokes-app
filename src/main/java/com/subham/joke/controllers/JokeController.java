package com.subham.joke.controllers;

import com.subham.joke.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    @Autowired
    private JokeService jokeService;

    @RequestMapping("/")
    public String jokeController(Model model){
        model.addAttribute("joke",jokeService.getJokes());
        return "ChucJoke";
    }

}
