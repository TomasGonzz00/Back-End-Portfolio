
package com.gonzzportfolio.tomas.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class HabDto {
    
    private String nombreHab;
    
    private int  porcentaje;
    
    private String color;

    public HabDto() {
    }

    public HabDto(String nombreHab, int porcentaje, String color) {
        this.nombreHab = nombreHab;
        this.porcentaje = porcentaje;
        this.color = color;
    }

   
    
    
}
