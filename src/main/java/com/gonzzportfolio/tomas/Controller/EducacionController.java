package com.gonzzportfolio.tomas.Controller;

import com.gonzzportfolio.tomas.Dto.EduDto;
import com.gonzzportfolio.tomas.Entity.Educacion;
import com.gonzzportfolio.tomas.Interface.IEducacionService;
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
@RequestMapping("/educacion")
@CrossOrigin(origins = "https://portfoliotomasgonzz.web.app")
public class EducacionController {

    @Autowired
    IEducacionService iEduService;

    @GetMapping("/traer")
    public ResponseEntity<List<Educacion>> getExp() {
        List<Educacion> list = iEduService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<?> create(@RequestBody EduDto expDto) {
        Educacion  educacion = new Educacion(expDto.getNombreEdu(), expDto.getDescripcionEdu(), expDto.getPeriodoEdu(), expDto.getImgEdu());
        iEduService.save( educacion);
        return new ResponseEntity(" Educacion creada", HttpStatus.OK);
    }

    @GetMapping("/traer/{id}")
    public ResponseEntity<Educacion> getById(@PathVariable("id") Long id) {
        if (!iEduService.existById(id)) {
            return new ResponseEntity("no existe", HttpStatus.NOT_FOUND);
        }
        Educacion  educacion= iEduService.getOne(id).get();
        return new ResponseEntity(educacion, HttpStatus.OK);
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody EduDto expDto) {
        if (!iEduService.existById(id)) {
            return new ResponseEntity("El id no existe", HttpStatus.BAD_REQUEST);
        }
        Educacion educacion = iEduService.getOne(id).get();
        educacion.setNombreEdu(expDto.getNombreEdu());
        educacion.setDescripcionEdu(expDto.getDescripcionEdu());
        educacion.setPeriodoEdu(expDto.getPeriodoEdu());
        educacion.setImgEdu(expDto.getImgEdu());

        iEduService.save(educacion);

        return new ResponseEntity("Experiencia modificada correctamente", HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        iEduService.delete(id);
        return new ResponseEntity("experiencia eliminada correctamente", HttpStatus.OK);
    }
}
