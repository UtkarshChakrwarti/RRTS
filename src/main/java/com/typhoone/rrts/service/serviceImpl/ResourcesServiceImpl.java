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
        resource.setPriority(resources.getPriority());
        resource.setCement(resources.getCement());
        resource.setWater(resources.getWater());
        resource.setSandTrips(resources.getSandTrips());
        resource.setConductors(resources.getConductors());
        resource.setComplaintID(resources.getComplaintID());
        resourcesRepository.save(resource);
        return entityMapper.toDto(resource, ResourcesDTO.class);
    }

    @Override
    public ResourcesDTO updateResources(ResourcesDTO resources) {
        try {
            Resources resource = resourcesRepository.findById(resources.getId()).orElseThrow();
            return getResourcesDTO(resources, resource);
        } catch (Exception e) {
            throw new RuntimeException("Resource not found");
        }
    }

    @Override
    public ResourcesDTO getResourcesById(Long id) {
        try {
            Resources resources = resourcesRepository.findById(id).orElseThrow();
            return entityMapper.toDto(resources, ResourcesDTO.class);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public ResourcesDTO deleteResourcesById(Long id) {
        try {
            Resources resources = resourcesRepository.findById(id).orElseThrow();
            resourcesRepository.delete(resources);
        } catch (Exception e) {
            return null;
        }
        return null;
    }

    @Override
    public List<ResourcesDTO> getAllResources() {
        try {
            List<Resources> resources = resourcesRepository.findAll();
            List<ResourcesDTO> resourcesDTOS = new ArrayList<>();
            for (Resources resource : resources) {
                resourcesDTOS.add(entityMapper.toDto(resource, ResourcesDTO.class));
            }
            return resourcesDTOS;
        } catch (Exception e) {
            return null;
        }
    }
}
