package com.gestaoalunos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gestaoalunos.model.Curso;
import com.gestaoalunos.repository.CursoRepository;

import jakarta.validation.Valid;

@Controller
public class CursoController {

    private final CursoRepository cursoRepository;

    public CursoController(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    @GetMapping("/cursos")
    public String listarCursos(Model model) {
        model.addAttribute("listaCursos", cursoRepository.findAll());
        return "cursos/lista";
    }

    @GetMapping("/cursos/novo")
    public String cursoFormulario(Model model) {
        model.addAttribute("curso", new Curso());
        model.addAttribute("titulo", "Cadastrar Curso");
        model.addAttribute("link", "/cursos/novo");
        model.addAttribute("valor", "Salvar");

        return "cursos/form";
    }

    @PostMapping("/cursos/novo")
    public String cursoCadastro(@Valid Curso curso,
            BindingResult result,
            RedirectAttributes redirect,
            Model model) {

        if (cursoRepository.existsByNomeIgnoreCase(curso.getNome())) {
            result.rejectValue("nome", "error.curso", "Já existe um curso com esse nome.");
        }

        if (result.hasErrors()) {
            redirect.addFlashAttribute("erro", "Erro ao cadastrar curso. Verifique os dados.");
            return "redirect:/cursos/novo";
        }

        cursoRepository.save(curso);
        redirect.addFlashAttribute("sucesso", "Curso cadastrado com sucesso!");
        return "redirect:/cursos";
    }

}
