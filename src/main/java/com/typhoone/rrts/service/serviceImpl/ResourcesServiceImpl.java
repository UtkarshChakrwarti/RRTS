package com.typhoone.rrts.service.serviceImpl;

import com.typhoone.rrts.dtos.ResourcesDTO;
import com.typhoone.rrts.entity.actions.Resources;
import com.typhoone.rrts.repository.actionsRepository.ResourcesRepository;
import com.typhoone.rrts.service.ResourcesService;
import com.typhoone.rrts.utility.EntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ResourcesServiceImpl implements ResourcesService {

    private final ResourcesRepository resourcesRepository;

    private final EntityMapper entityMapper;

    @Autowired
    public ResourcesServiceImpl(ResourcesRepository resourcesRepository, EntityMapper entityMapper) {
        this.resourcesRepository = resourcesRepository;
        this.entityMapper = entityMapper;
    }

    @Override
    public ResourcesDTO createResources(ResourcesDTO resources) {
        Resources resource = new Resources();
        return getResourcesDTO(resources, resource);
    }

    private ResourcesDTO getResourcesDTO(ResourcesDTO resources, Resources resource) {
        resource.setPRIORITY_ORDER(resources.getPRIORITY_ORDER());
        resource.setCEMENT(resources.getCEMENT());
        resource.setWATER(resources.getWATER());
        resource.setSAND_TRIPS(resources.getSAND_TRIPS());
        resource.setLABOURERS(resources.getLABOURERS());
        resource.setComplaintID(resources.getComplaintID());
        resourcesRepository.save(resource);
        return entityMapper.toDto(resource, ResourcesDTO.class);
    }

    @Override
    public ResourcesDTO updateResources(ResourcesDTO resources) {
        Resources resource = resourcesRepository.findById(resources.getId()).orElseThrow();
        return getResourcesDTO(resources, resource);

    }

    @Override
    public ResourcesDTO getResourcesById(Long id) {
        Resources resource = resourcesRepository.findById(id).orElseThrow();
        return entityMapper.toDto(resource, ResourcesDTO.class);
    }

    @Override
    public ResourcesDTO deleteResourcesById(Long id) {
        Resources resource = resourcesRepository.findById(id).orElseThrow();
        resourcesRepository.delete(resource);
        return entityMapper.toDto(resource, ResourcesDTO.class);
    }

    @Override
    public List<ResourcesDTO> getAllResources() {
        List<Resources> resources = resourcesRepository.findAll();
        //save all resources in list
        List<ResourcesDTO> resourcesDTOS= new ArrayList<>();
        //using for each loop and entity mapper to save all resources in list
        for (Resources resource : resources) {
            resourcesDTOS.add(entityMapper.toDto(resource, ResourcesDTO.class));
        }
        return resourcesDTOS;

    }
}
