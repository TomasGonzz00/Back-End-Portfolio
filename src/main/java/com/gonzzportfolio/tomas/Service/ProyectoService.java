
package com.gonzzportfolio.tomas.Service;

import com.gonzzportfolio.tomas.Entity.Proyecto;
import com.gonzzportfolio.tomas.Interface.IProyectoService;
import com.gonzzportfolio.tomas.Repository.IProyectoRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProyectoService implements IProyectoService{
        @Autowired IProyectoRepository proRepo; 
    
    @Override
    public List<Proyecto> list(){
         List<Proyecto> proyecto = proRepo.findAll();
        return proyecto;
    }
    
    @Override
    public Optional<Proyecto> getOne(Long id){
        Optional<Proyecto> proyecto = proRepo.findById(id);
        return proyecto;
    }
    
    @Override
    public void save(Proyecto pro){
        proRepo.save(pro);
    }
    
    @Override
    public void delete(Long id){
        proRepo.deleteById(id);
    }
    
    @Override
    public boolean existById(Long id){
        boolean pro = proRepo.existsById(id);
        return pro;
    }
}
