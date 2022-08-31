
package com.gonzzportfolio.tomas.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter 
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   
    private String nombre;
    
    private String apellido;
    
    private String imgPerfil;

    private String fechaNacimiento;

    private String mail;
    
    private String sobreMi;

    private String ocupacion;

    private String ubicacion;
    
    private String imgBanner;
    
    private boolean theme;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String imgPerfil, String fechaNacimiento, String mail, String sobreMi, String ocupacion, String ubicacion, String imgBanner, boolean theme) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.imgPerfil = imgPerfil;
        this.fechaNacimiento = fechaNacimiento;
        this.mail = mail;
        this.sobreMi = sobreMi;
        this.ocupacion = ocupacion;
        this.ubicacion = ubicacion;
        this.imgBanner = imgBanner;
        this.theme = theme;
    }
    
   
}
