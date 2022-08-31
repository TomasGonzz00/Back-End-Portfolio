
package com.gonzzportfolio.tomas.Repository;

import com.gonzzportfolio.tomas.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long>{
//este paso lo que hace es agregarle los metodos del jpaRepository a la inteface de persona 
    
}
