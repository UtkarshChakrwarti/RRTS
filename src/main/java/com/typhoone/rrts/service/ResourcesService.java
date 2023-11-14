package com.typhoone.rrts.service;

import com.typhoone.rrts.dtos.ResourcesDTO;

import java.util.List;

public interface ResourcesService {

    //create resources
    ResourcesDTO createResources(ResourcesDTO resources);

    //update resources
    ResourcesDTO updateResources(ResourcesDTO resources);

    //get resources by id
    ResourcesDTO getResourcesById(Long id);

    //delete resources by id
    ResourcesDTO deleteResourcesById(Long id);

    //show all resources
    List<ResourcesDTO> getAllResources();
}
