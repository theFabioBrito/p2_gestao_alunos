package com.gestaoalunos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gestaoalunos.model.Aluno;
import com.gestaoalunos.repository.AlunoRepository;
import com.gestaoalunos.repository.CursoRepository;

import jakarta.validation.Valid;

@Controller
public class AlunoController {

    private final AlunoRepository alunoRepository;
    private final CursoRepository cursoRepository;

    public AlunoController(AlunoRepository alunoRepository, CursoRepository cursoRepository) {
        this.alunoRepository = alunoRepository;
        this.cursoRepository = cursoRepository;
    }

    @GetMapping("/alunos")
    public String listarAlunos(Model model) {
        model.addAttribute("listaAlunos", alunoRepository.findAll());
        return "alunos/lista";
    }

    @GetMapping("/alunos/novo")
    public String novoAluno(Model model) {
        model.addAttribute("aluno", new Aluno());
        model.addAttribute("listaCursos", cursoRepository.findAll());
        model.addAttribute("titulo", "Cadastrar Aluno");
        model.addAttribute("link", "/alunos/novo");
        model.addAttribute("valor", "Salvar");

        return "alunos/form";
    }

    @PostMapping("/alunos/novo")
    public String salvarAluno(@Valid Aluno aluno, BindingResult result, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            redirect.addFlashAttribute("erro", "Erro ao cadastrar curso. Verifique os dados.");
            return "redirect:/cursos/novo";
        }

        alunoRepository.save(aluno);
        redirect.addFlashAttribute("sucesso", "Aluno cadastrado com sucesso!");
        return "redirect:/alunos";
    }
}
