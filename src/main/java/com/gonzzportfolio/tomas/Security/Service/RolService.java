
package com.gonzzportfolio.tomas.Security.Service;

import com.gonzzportfolio.tomas.Security.Entity.Rol;
import com.gonzzportfolio.tomas.Security.Enums.RolNombre;
import com.gonzzportfolio.tomas.Security.Repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    iRolRepository irolrepository;
    
    public Optional<Rol> getByRolNombre (RolNombre rolNombre){
            return irolrepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        irolrepository.save(rol);
    }
}

