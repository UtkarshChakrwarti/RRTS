package com.typhoone.rrts.controller;

import com.typhoone.rrts.dtos.ComplainDTO;
import com.typhoone.rrts.service.ComplainService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Controller
@CrossOrigin
public class ComplainController {

    private final ComplainService complainService;

    public ComplainController(ComplainService complainService) {
        this.complainService = complainService;
    }

    //createComplain
    @RequestMapping(value = "/createComplain", method = RequestMethod.POST)
    public ResponseEntity<ComplainDTO> createComplain(@RequestBody ComplainDTO complain) {
        return ResponseEntity.ok(complainService.createComplain(complain));
    }

    //updateComplain
    @RequestMapping(value = "/updateComplain", method = RequestMethod.POST)
    public ResponseEntity<ComplainDTO> updateComplain(@RequestBody ComplainDTO complain) {
        return ResponseEntity.ok(complainService.updateComplain(complain));
    }

    //deleteComplainById
    @RequestMapping(value = "/deleteComplainById", method = RequestMethod.POST)
    public ResponseEntity<ComplainDTO> deleteComplainById(@RequestParam Long id) {
        return ResponseEntity.ok(complainService.deleteComplainById(id));
    }

    //getComplainById
    @RequestMapping(value = "/getComplainById", method = RequestMethod.POST)
    public ResponseEntity<ComplainDTO> getComplainById(@RequestParam Long id) {
        return ResponseEntity.ok(complainService.getComplainById(id));
    }

}
