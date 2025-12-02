package com.gestaoalunos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestaoalunos.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
