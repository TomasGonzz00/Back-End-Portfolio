
package com.gonzzportfolio.tomas.Repository;

import com.gonzzportfolio.tomas.Entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducacionRepository  extends JpaRepository<Educacion,Long>{  
}
