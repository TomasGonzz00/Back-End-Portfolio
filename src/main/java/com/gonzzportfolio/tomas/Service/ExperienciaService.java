
package com.gonzzportfolio.tomas.Service;

import com.gonzzportfolio.tomas.Entity.Experiencia;
import com.gonzzportfolio.tomas.Interface.IExperienciaService;
import com.gonzzportfolio.tomas.Repository.IExperienciaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExperienciaService implements IExperienciaService {
    
    @Autowired IExperienciaRepository expRepo; 
    
    @Override
    public List<Experiencia> list(){
         List<Experiencia> experiencia = expRepo.findAll();
        return experiencia;
    }
    
    @Override
    public Optional<Experiencia> getOne(Long id){
        Optional<Experiencia> experiencia = expRepo.findById(id);
        return experiencia;
    }
    
    @Override
    public void save(Experiencia exp){
        expRepo.save(exp);
    }
    
    @Override
    public void delete(Long id){
        expRepo.deleteById(id);
    }
    
    @Override
    public boolean existById(Long id){
        boolean exp = expRepo.existsById(id);
        return exp;
    }
    
}

