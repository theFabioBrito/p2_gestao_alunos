package com.gestaoalunos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gestaoalunos.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

    

}
