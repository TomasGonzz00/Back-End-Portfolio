
package com.gonzzportfolio.tomas.Security.Service;

import com.gonzzportfolio.tomas.Security.Entity.Usuario;
import com.gonzzportfolio.tomas.Security.Repository.iUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
   @Autowired
   iUsuarioRepository iusuariorepository;
   
   public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
       return iusuariorepository.findByNombreUsuario(nombreUsuario);
   }
   
   public boolean existsByNombreUsuario(String nombreUsuario){
       return iusuariorepository.existsByNombreUsuario(nombreUsuario);
   }
   
   public boolean existsByEmail(String email){
       return iusuariorepository.existsByEmail(email);
   }
   
   public void save(Usuario usuario){
       iusuariorepository.save(usuario);
   }
}
 