
package com.gonzzportfolio.tomas.Service;

import com.gonzzportfolio.tomas.Entity.Educacion;
import com.gonzzportfolio.tomas.Interface.IEducacionService;
import com.gonzzportfolio.tomas.Repository.IEducacionRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EducacionService implements IEducacionService{
   @Autowired IEducacionRepository eduRepo;

    @Override
    public List<Educacion> list() {
        List<Educacion> educacion = eduRepo.findAll();
        return educacion;
    }

    @Override
    public Optional<Educacion> getOne(Long id) {
         Optional<Educacion> educacion = eduRepo.findById(id);
        return educacion;
    }

    @Override
    public void save(Educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public void delete(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public boolean existById(Long id) {
        boolean edu = eduRepo.existsById(id);
        return edu;
    }
   
   
}
