package com.typhoone.rrts.controller;

import com.typhoone.rrts.dtos.ResourcesDTO;
import com.typhoone.rrts.service.ResourcesService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@CrossOrigin
public class ResourcesController {

    private final ResourcesService resourcesService;

    public ResourcesController(ResourcesService resourcesService) {

        this.resourcesService = resourcesService;
    }

    //createResources
    @RequestMapping(value = "/createResources", method = RequestMethod.POST)
    public ResponseEntity<ResourcesDTO> createResources(@RequestBody ResourcesDTO resources) {
        System.out.println("resources = " + resources);
        return ResponseEntity.ok(resourcesService.createResources(resources));
    }

    //updateResources
    @RequestMapping(value = "/updateResources", method = RequestMethod.POST)
    public ResponseEntity<ResourcesDTO> updateResources(@RequestBody ResourcesDTO resources) {
        return ResponseEntity.ok(resourcesService.updateResources(resources));
    }

    //deleteResourcesById
    @RequestMapping(value = "/deleteResourcesById", method = RequestMethod.POST)
    public ResponseEntity<ResourcesDTO> deleteResourcesById(@RequestParam Long id) {
        return ResponseEntity.ok(resourcesService.deleteResourcesById(id));
    }

    //getResourcesById
    @RequestMapping(value = "/getResourcesById", method = RequestMethod.POST)
    public ResponseEntity<ResourcesDTO> getResourcesById(@RequestParam Long id) {
        return ResponseEntity.ok(resourcesService.getResourcesById(id));
    }

    @RequestMapping(value = "/getAllResources", method = RequestMethod.GET)
    public ResponseEntity<List<ResourcesDTO>> getAllResources() {
        return ResponseEntity.ok(resourcesService.getAllResources());
    }


}
