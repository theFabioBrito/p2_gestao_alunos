package com.gestaoalunos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.gestaoalunos.model.Curso;
import com.gestaoalunos.repository.CursoRepository;

import jakarta.validation.Valid;

@Controller
public class CursoController {

    @Autowired
    private final CursoRepository cursoRepository;

    public CursoController (CursoRepository cursoRepository){
        this.cursoRepository = cursoRepository;
    }

    @GetMapping("/cursos")
    public String listarCursos(Model model){
        model.addAttribute("listaCursos", cursoRepository.findAll());
        return "cursos/lista";
    }

    @GetMapping("/cursos/novo")
    public String cursoFormulario(Model model){
        model.addAttribute("curso", new Curso());
        model.addAttribute("titulo", "Cadastrar Curso");
        model.addAttribute("link", "/cadastro");

        return "cursos/form";
    }
    
    @PostMapping("/cursos/novo")
    public String cursoCadastro(Model model, @Valid Curso curso){
        model.addAttribute("curso", new Curso());
        model.addAttribute("titulo", "Cadastrar Curso");
        model.addAttribute("link", "/cadastro");

         cursoRepository.save(curso);
        return "redirect:/cursos";
    }

}
