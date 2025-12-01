package com.gestaoalunos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.gestaoalunos.repository.CursoRepository;

@Controller
public class CursoController {

    private final CursoRepository cursoRepository;

    public CursoController (CursoRepository cursoRepository){
        this.cursoRepository = CursoRepository;
    }

    @GetMapping("/cursos")
    public String listarCursos(Model model){
        model.addAtribute("listaCursos", cursoRepository.findAll());
        return "cursos/lista";
    }

    @GetMapping("/cursos/novo")
    public String mostrarFormularioCadastro(){
        return "cursos/form";
    }

}
