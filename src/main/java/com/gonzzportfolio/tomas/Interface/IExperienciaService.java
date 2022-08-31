package com.gonzzportfolio.tomas.Interface;

import com.gonzzportfolio.tomas.Entity.Experiencia;
import java.util.List;
import java.util.Optional;

public interface IExperienciaService {

    public List<Experiencia> list();

    public Optional<Experiencia> getOne(Long id);

    public void save(Experiencia exp);

    public void delete(Long id);

    public boolean existById(Long id);
}
