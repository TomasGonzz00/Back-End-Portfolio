
package com.gonzzportfolio.tomas.Security.Service;

import com.gonzzportfolio.tomas.Security.Entity.Usuario;
import com.gonzzportfolio.tomas.Security.Entity.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
 public class UserDetailsImpl implements UserDetailsService{
    @Autowired
    UsuarioService usuarioservice;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        Usuario usuario = usuarioservice.getByNombreUsuario(nombreUsuario).get();
        return UsuarioPrincipal.build(usuario);
    }
}