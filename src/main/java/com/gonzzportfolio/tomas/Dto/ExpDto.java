
package com.gonzzportfolio.tomas.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ExpDto {
     private String nombreExp;
    
    private String descripcionExp;
    
    private String periodoExp;
    
    private String imgExp;

    public ExpDto() {
    }

    public ExpDto(String nombreExp, String descripcionExp, String periodoExp, String imgExp) {
        this.nombreExp = nombreExp;
        this.descripcionExp = descripcionExp;
        this.periodoExp = periodoExp;
        this.imgExp = imgExp;
    }
     
}
