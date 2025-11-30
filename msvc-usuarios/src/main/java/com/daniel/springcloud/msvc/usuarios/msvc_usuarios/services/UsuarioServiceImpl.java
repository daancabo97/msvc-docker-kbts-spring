package com.daniel.springcloud.msvc.usuarios.msvc_usuarios.services;

import com.daniel.springcloud.msvc.usuarios.msvc_usuarios.models.entity.Usuario;
import com.daniel.springcloud.msvc.usuarios.msvc_usuarios.repositories.UsuarioRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> listarUsuarios() {
        return (List<Usuario>) repository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<Usuario> Listar_porId(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Usuario guardarUsuario(Usuario usuario) {
        return repository.save(usuario);
    }

    @Override
    @Transactional
    public void eliminarUsuario(Long idUsuario) {
        repository.deleteById(idUsuario);
    }
}
