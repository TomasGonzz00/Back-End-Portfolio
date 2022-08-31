
package com.gonzzportfolio.tomas.Interface;

import com.gonzzportfolio.tomas.Entity.Educacion;
import java.util.List;
import java.util.Optional;

public interface IEducacionService {
    
    public List<Educacion> list();

    public Optional<Educacion> getOne(Long id);

    public void save(Educacion edu);

    public void delete(Long id);

    public boolean existById(Long id);
}
