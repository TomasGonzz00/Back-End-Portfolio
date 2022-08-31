
package com.gonzzportfolio.tomas.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class EduDto {
    
    private String nombreEdu;
    
    private String descripcionEdu;
    
    private String periodoEdu;
   
    private String imgEdu;

    public EduDto() {
    }

    public EduDto(String nombreEdu, String descripcionEdu, String periodoEdu, String imgEdu) {
        this.nombreEdu = nombreEdu;
        this.descripcionEdu = descripcionEdu;
        this.periodoEdu = periodoEdu;
        this.imgEdu = imgEdu;
    }
    
    
}
