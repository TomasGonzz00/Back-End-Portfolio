
package com.gonzzportfolio.tomas.Service;

import com.gonzzportfolio.tomas.Entity.Persona;
import com.gonzzportfolio.tomas.Interface.IPersonaService;
import com.gonzzportfolio.tomas.Repository.IPersonaRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //esta es la capa que se conecta los metodos de la base de datos con los metodos de la logica
public class ImpPersonaService implements IPersonaService {
    @Autowired IPersonaRepository ipersonarepository;

    @Override
    public void savePersona(Persona persona) {
        ipersonarepository.save(persona);
    }

    @Override
    public Optional<Persona> findPersona(Long id) {
        Optional<Persona> persona = ipersonarepository.findById(id);
        return persona;
    }


    
    
}
