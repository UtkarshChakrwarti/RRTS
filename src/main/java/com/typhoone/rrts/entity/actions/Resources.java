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

    private int PRIORITY_ORDER;
    private int CEMENT;
    private int WATER;
    private int SAND_TRIPS;
    private int LABOURERS;
    private int ComplaintID;
}
