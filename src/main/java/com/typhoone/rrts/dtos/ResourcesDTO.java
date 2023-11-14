package com.typhoone.rrts.dtos;

import lombok.Data;

@Data
public class ResourcesDTO {
    private long id;
    private int PRIORITY_ORDER;
    private int CEMENT;
    private int WATER;
    private int SAND_TRIPS;
    private int LABOURERS;
    private int ComplaintID;

}
