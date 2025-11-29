package com.daniel.springcloud.msvc.cursos.controllers;



import com.daniel.springcloud.msvc.cursos.entity.Curso;
import com.daniel.springcloud.msvc.cursos.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CursoController {

    @Autowired
    private CursoService service;

    public ResponseEntity <List<Curso>> listarCursos() {
        return ResponseEntity.ok(service.listarCursos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> detalleCursos(@PathVariable Long id) {
        Optional<Curso> o = service.listarCursoPorId(id);
        if (o.isPresent()) {
            return ResponseEntity.ok(o.get());
        }
        return ResponseEntity.notFound().build();
    }
}
