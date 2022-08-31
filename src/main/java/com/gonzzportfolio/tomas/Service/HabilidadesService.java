
package com.gonzzportfolio.tomas.Service;

import com.gonzzportfolio.tomas.Entity.Habilidades;
import com.gonzzportfolio.tomas.Interface.IHabilidadesService;
import com.gonzzportfolio.tomas.Repository.IHabilidadesRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HabilidadesService implements IHabilidadesService{
    
    @Autowired  IHabilidadesRepository habRepo;

    @Override
    public List<Habilidades> list() {
        List<Habilidades> habilidades = habRepo.findAll();
        return habilidades;
    }

    @Override
    public Optional<Habilidades> getOne(Long id) {
        Optional<Habilidades> habilidad = habRepo.findById(id);
        return habilidad;
    }

    @Override
    public void save(Habilidades hab) {
        habRepo.save(hab);
    }

    @Override
    public void delete(Long id) {
        habRepo.deleteById(id);
    }

    @Override
    public boolean existById(Long id) {
        boolean hab = habRepo.existsById(id);
        return hab;
    }
    
}
