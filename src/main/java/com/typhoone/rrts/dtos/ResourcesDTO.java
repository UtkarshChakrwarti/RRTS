package com.typhoone.rrts.dtos;

import lombok.Data;

@Data
public class ResourcesDTO {
    private Long id;
    private Long priority;
    private Long cement;
    private Long water;
    private Long sandTrips;
    private Long conductors;
    private Long complaintID;
}
