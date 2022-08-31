package com.gonzzportfolio.tomas.Interface;

import com.gonzzportfolio.tomas.Entity.Habilidades;
import java.util.List;
import java.util.Optional;

public interface IHabilidadesService {

    public List<Habilidades> list();

    public Optional<Habilidades> getOne(Long id);

    public void save(Habilidades hab);

    public void delete(Long id);

    public boolean existById(Long id);
}
