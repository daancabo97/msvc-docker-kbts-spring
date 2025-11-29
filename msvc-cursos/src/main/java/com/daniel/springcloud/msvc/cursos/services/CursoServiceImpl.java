package com.daniel.springcloud.msvc.cursos.services;

import com.daniel.springcloud.msvc.cursos.entity.Curso;
import com.daniel.springcloud.msvc.cursos.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CursoServiceImpl implements CursoService{

    @Autowired
    private CursoRepository repository;


    @Override
    @Transactional(readOnly = true)
    public List<Curso> listarCursos() {
        return (List<Curso>) repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Curso> listarCursoPorId(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Curso guardarCurso(Curso curso) {
        return repository.save(curso);
    }

    @Override
    @Transactional
    public void eliminarCurso(Long id) {
        repository.deleteById(id);
    }
}
