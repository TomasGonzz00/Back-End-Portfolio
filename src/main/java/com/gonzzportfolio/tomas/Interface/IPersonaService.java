
package com.gonzzportfolio.tomas.Interface;

import com.gonzzportfolio.tomas.Entity.Persona;
import java.util.Optional;

public interface IPersonaService {
    
    
    //guardar un objeto del tipo persona
    public void savePersona(Persona persona);
    
    
    public Optional<Persona> findPersona(Long id);
    
}
