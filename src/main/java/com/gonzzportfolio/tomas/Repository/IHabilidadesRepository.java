
package com.gonzzportfolio.tomas.Repository;

import com.gonzzportfolio.tomas.Entity.Habilidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHabilidadesRepository extends JpaRepository<Habilidades,Long> {
    
}
