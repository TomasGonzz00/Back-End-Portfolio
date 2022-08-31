    
package com.gonzzportfolio.tomas.Controller;

import com.gonzzportfolio.tomas.Dto.PerDto;
import com.gonzzportfolio.tomas.Entity.Persona;
import com.gonzzportfolio.tomas.Interface.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://portfoliotomasgonzz.web.app")
public class PersonaController {
    @Autowired IPersonaService ipersonaservice; //creamos una variable que va a utilizar los metodos declarados en la interface
     
 @PostMapping("/crear")
    public ResponseEntity<?> create(@RequestBody PerDto perDto) {
        Persona persona = new Persona(perDto.getNombre(), perDto.getApellido(), perDto.getImgPerfil(), perDto.getFechaNacimiento(),perDto.getMail(),perDto.getSobreMi(),perDto.getOcupacion(),perDto.getUbicacion(),perDto.getImgBanner(),perDto.isTheme());
        ipersonaservice.savePersona(persona);
        return new ResponseEntity("persona creada", HttpStatus.OK);
    }
    
    
    @GetMapping("personas/traer/perfil")
    public ResponseEntity<Persona> findPersona(){
        Persona persona =  ipersonaservice.findPersona((long)1).get();
        return new ResponseEntity(persona,HttpStatus.OK);
    }
  
    @PutMapping("personas/editar/{id}")
    public  ResponseEntity<?> editPersona(@PathVariable("id") Long id, @RequestBody PerDto pers){
       
        Persona persona = ipersonaservice.findPersona(id).get();
        persona.setNombre(pers.getNombre());
        persona.setApellido(pers.getApellido());
        persona.setImgPerfil(pers.getImgPerfil());
        persona.setFechaNacimiento(pers.getFechaNacimiento());
        persona.setMail(pers.getMail());
        persona.setSobreMi(pers.getSobreMi());
        persona.setOcupacion(pers.getOcupacion());
        persona.setUbicacion(pers.getUbicacion());
        persona.setImgBanner(pers.getImgBanner());
        
        ipersonaservice.savePersona(persona);
        return new ResponseEntity("Persona modificada correctamente",HttpStatus.OK);
    }
    
    @PutMapping("personas/theme")
    public ResponseEntity<?> changeTheme(@RequestBody boolean theme){
        Persona persona = ipersonaservice.findPersona((long)1).get();
        persona.setTheme(theme);
         ipersonaservice.savePersona(persona);
         return new ResponseEntity("Tema cambiado",HttpStatus.OK);
    }
    
    
    
    
}
