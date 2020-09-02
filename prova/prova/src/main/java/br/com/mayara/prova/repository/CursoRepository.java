package br.com.mayara.prova.repository;

import br.com.mayara.prova.modelo.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository <Curso, Long>{
    Curso findByNome(String nomeCurso);
}
