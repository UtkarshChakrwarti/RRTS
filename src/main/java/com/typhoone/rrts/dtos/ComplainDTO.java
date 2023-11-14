package com.typhoone.rrts.dtos;

import lombok.Data;

@Data
public class ComplainDTO {
    private Long id;
    private String Area;
    private String Location;
    private String Telephone;
    private String Description;
    private String Comments;

}
