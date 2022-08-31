
package com.gonzzportfolio.tomas.Controller;

import com.gonzzportfolio.tomas.Dto.ProDto;
import com.gonzzportfolio.tomas.Entity.Proyecto;
import com.gonzzportfolio.tomas.Interface.IProyectoService;
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
@RequestMapping("/proyecto")
@CrossOrigin(origins = "https://portfoliotomasgonzz.web.app")
public class ProyectoController {
    @Autowired
    IProyectoService iProService;

    @GetMapping("/traer")
    public ResponseEntity<List<Proyecto>> getPro() {
        List<Proyecto> list =iProService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @PostMapping("/crear")
    public ResponseEntity<?> create(@RequestBody ProDto proDto) {
       Proyecto proyecto = new Proyecto (proDto.getNombrePro(),proDto.getDescripcionPro(),proDto.getFechaPro(),proDto.getImgPro(),proDto.getUrlPro());
        iProService.save(proyecto);
        return new ResponseEntity("Proyecto creado",HttpStatus.OK);
    }
    
@GetMapping("/traer/{id}")
    public ResponseEntity<Proyecto> getById(@PathVariable("id") Long id){
        if(!iProService.existById(id))
            return new ResponseEntity("no existe", HttpStatus.NOT_FOUND);
        Proyecto proyecto = iProService.getOne(id).get();
        return new ResponseEntity(proyecto, HttpStatus.OK);
    }
    
    @PutMapping("/editar/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody ProDto proDto){
        if(!iProService.existById(id)){
        return new ResponseEntity("El id no existe",HttpStatus.BAD_REQUEST);
        }
       Proyecto proyecto = iProService.getOne(id).get();
        proyecto.setNombrePro(proDto.getNombrePro());
        proyecto.setDescripcionPro(proDto.getDescripcionPro());
        proyecto.setFechaPro(proDto.getFechaPro());
        proyecto.setImgPro(proDto.getImgPro());
        proyecto.setUrlPro(proDto.getUrlPro());
        
       iProService.save(proyecto);
        
        return new ResponseEntity("Proyecto modificado correctamente",HttpStatus.OK);
    }
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity <?> delete(@PathVariable("id") Long id){
        iProService.delete(id);
        return new ResponseEntity("Proyecto eliminado correctamente",HttpStatus.OK);
    }
}
