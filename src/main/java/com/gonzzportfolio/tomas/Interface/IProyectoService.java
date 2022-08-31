package com.gonzzportfolio.tomas.Interface;

import com.gonzzportfolio.tomas.Entity.Proyecto;
import java.util.List;
import java.util.Optional;

public interface IProyectoService {

    public List<Proyecto> list();

    public Optional<Proyecto> getOne(Long id);

    public void save(Proyecto pro);

    public void delete(Long id);

    public boolean existById(Long id);
}
