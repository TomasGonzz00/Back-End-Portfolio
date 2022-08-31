
package com.gonzzportfolio.tomas.Repository;

import com.gonzzportfolio.tomas.Entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProyectoRepository extends JpaRepository<Proyecto,Long>{
    
}
