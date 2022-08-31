
package com.gonzzportfolio.tomas.Repository;

import com.gonzzportfolio.tomas.Entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienciaRepository extends JpaRepository<Experiencia,Long>{
}
