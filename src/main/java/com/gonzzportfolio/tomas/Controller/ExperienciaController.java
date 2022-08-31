package com.gonzzportfolio.tomas.Controller;

import com.gonzzportfolio.tomas.Dto.ExpDto;
import com.gonzzportfolio.tomas.Entity.Experiencia;
import com.gonzzportfolio.tomas.Interface.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/experiencia")
@CrossOrigin(origins = "https://portfoliotomasgonzz.web.app")
public class ExperienciaController {

    @Autowired
    IExperienciaService iExpService;

    @GetMapping("/traer")
    public ResponseEntity<List<Experiencia>> getExp() {
        List<Experiencia> list = iExpService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    @PostMapping("/crear")
    public ResponseEntity<?> create(@RequestBody ExpDto expDto) {
        Experiencia experiencia = new Experiencia (expDto.getNombreExp(),expDto.getDescripcionExp(),expDto.getPeriodoExp(),expDto.getImgExp());
        iExpService.save(experiencia);
        return new ResponseEntity("Experiencia creada",HttpStatus.OK);
    }
    
@GetMapping("/traer/{id}")
    public ResponseEntity<Experiencia> getById(@PathVariable("id") Long id){
        if(!iExpService.existById(id))
            return new ResponseEntity("no existe", HttpStatus.NOT_FOUND);
        Experiencia experiencia = iExpService.getOne(id).get();
        return new ResponseEntity(experiencia, HttpStatus.OK);
    }
    
    @PutMapping("/editar/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody ExpDto expDto){
        if(!iExpService.existById(id)){
        return new ResponseEntity("El id no existe",HttpStatus.BAD_REQUEST);
        }
        Experiencia experiencia = iExpService.getOne(id).get();
        experiencia.setNombreExp(expDto.getNombreExp());
        experiencia.setDescripcionExp(expDto.getDescripcionExp());
        experiencia.setPeriodoExp(expDto.getPeriodoExp());
        experiencia.setImgExp(expDto.getImgExp());
        
        iExpService.save(experiencia);
        
        return new ResponseEntity("Experiencia modificada correctamente",HttpStatus.OK);
    }
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity <?> delete(@PathVariable("id") Long id){
        iExpService.delete(id);
        return new ResponseEntity("experiencia eliminada correctamente",HttpStatus.OK);
    }
}
