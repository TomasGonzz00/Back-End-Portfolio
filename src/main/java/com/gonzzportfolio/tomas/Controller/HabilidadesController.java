
package com.gonzzportfolio.tomas.Controller;

import com.gonzzportfolio.tomas.Dto.HabDto;
import com.gonzzportfolio.tomas.Entity.Habilidades;
import com.gonzzportfolio.tomas.Interface.IHabilidadesService;
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
@RequestMapping("/habilidades")
@CrossOrigin(origins = "https://portfoliotomasgonzz.web.app")
public class HabilidadesController {
    
    @Autowired IHabilidadesService iHabService;
    
    @GetMapping("/traer")
    public ResponseEntity<List<Habilidades>> getHabs(){
        List<Habilidades> habilidades = iHabService.list();
        return new ResponseEntity(habilidades,HttpStatus.OK) ;
    }
    
    @GetMapping("/traer/{id}")
    public ResponseEntity<Habilidades>  getById(@PathVariable("id") Long id){
        if(!iHabService.existById(id))
            return new ResponseEntity("no existe", HttpStatus.NOT_FOUND);
        Habilidades habilidades = iHabService.getOne(id).get();
        return new ResponseEntity(habilidades, HttpStatus.OK);
    }
    
    @PostMapping("/crear")
    public ResponseEntity<Habilidades> create(@RequestBody HabDto hab){
        Habilidades habilidad = new Habilidades(hab.getNombreHab(),hab.getPorcentaje(),hab.getColor());
        iHabService.save(habilidad);
        return new ResponseEntity("Habilidad Creada",HttpStatus.OK);
    }
    
    @PutMapping("/editar/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody HabDto hab){
        if(!iHabService.existById(id)){
        return new ResponseEntity("El id no existe",HttpStatus.BAD_REQUEST);
        }
        Habilidades habilidad = iHabService.getOne(id).get();
        habilidad.setNombreHab(hab.getNombreHab());
        habilidad.setPorcentaje(hab.getPorcentaje());
        habilidad.setColor(hab.getColor());
        
        iHabService.save(habilidad);
        
        return new ResponseEntity("Experiencia modificada correctamente",HttpStatus.OK);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity <?> delete(@PathVariable("id") Long id){
        iHabService.delete(id);
        return new ResponseEntity("experiencia eliminada correctamente",HttpStatus.OK);
    }
    
}
