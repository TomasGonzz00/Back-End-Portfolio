
package com.gonzzportfolio.tomas.Security.Repository;

import com.gonzzportfolio.tomas.Security.Entity.Rol;
import com.gonzzportfolio.tomas.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre); 
}
