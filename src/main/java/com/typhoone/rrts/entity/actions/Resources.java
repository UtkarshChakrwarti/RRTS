package com.typhoone.rrts.entity.actions;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Resources {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long priority;
    private Long cement;
    private Long water;
    private Long sandTrips;
    private Long conductors;
    private Long complaintID;
}
