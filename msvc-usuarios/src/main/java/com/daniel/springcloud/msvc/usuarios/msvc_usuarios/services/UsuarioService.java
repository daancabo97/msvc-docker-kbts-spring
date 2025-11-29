package com.daniel.springcloud.msvc.usuarios.msvc_usuarios.services;

import com.daniel.springcloud.msvc.usuarios.msvc_usuarios.models.entity.Usuario;
import java.util.List;
import java.util.Optional;


public interface UsuarioService {
    List<Usuario> listarUsuarios();
    Optional<Usuario> Listar_porId(Long id);
    Usuario guardarUsuario(Usuario usuario);
    void eliminarUsuario(Long id);

}
