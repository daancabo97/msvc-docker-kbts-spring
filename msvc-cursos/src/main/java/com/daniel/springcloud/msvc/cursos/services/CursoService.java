package com.daniel.springcloud.msvc.cursos.services;


import com.daniel.springcloud.msvc.cursos.entity.Curso;

import java.util.List;
import java.util.Optional;

public interface CursoService {
    List<Curso> listarCursos();
    Optional<Curso> listarCursoPorId(Long id);
    Curso guardarCurso(Curso curso);
    void eliminarCurso(Long id);
}
