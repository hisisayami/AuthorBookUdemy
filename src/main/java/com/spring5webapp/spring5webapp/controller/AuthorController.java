package com.spring5webapp.spring5webapp.controller;

import com.spring5webapp.spring5webapp.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController  {

    @Autowired
    private AuthorRepository authorRepository;

//    public AuthorController(AuthorRepository authorRepository) {
//        this.authorRepository = authorRepository;
//    }

    @RequestMapping("/authors")
    public String getAuthos(Model model){

        model.addAttribute("authors", authorRepository.findAll()); //collecting all list of authors from authorrepository and saving into "authors" to pass it to thymleaf html

        return "authors";

    }
}
