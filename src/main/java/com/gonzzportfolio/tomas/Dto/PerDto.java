
package com.gonzzportfolio.tomas.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PerDto {
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

    public PerDto() {
    }

    public PerDto(String nombre, String apellido, String imgPerfil, String fechaNacimiento, String mail, String sobreMi, String ocupacion, String ubicacion, String imgBanner, boolean theme) {
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
