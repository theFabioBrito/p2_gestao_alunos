package com.gestaoalunos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.gestaoalunos.repository.AlunoRepository;
import com.gestaoalunos.repository.CursoRepository;

@Controller
public class HomeController {

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @GetMapping("/")
    public String home(Model model) {

        long totalAlunos = alunoRepository.count();
        long totalCursos = cursoRepository.count();

        model.addAttribute("totalAlunos", totalAlunos);
        model.addAttribute("totalCursos", totalCursos);

        return "home";
    }
}
