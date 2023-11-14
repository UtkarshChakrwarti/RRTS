package com.typhoone.rrts.service;

import com.typhoone.rrts.dtos.ComplainDTO;

import java.util.List;

public interface ComplainService {

        ComplainDTO createComplain(ComplainDTO complain);

        ComplainDTO updateComplain(ComplainDTO complain);

        ComplainDTO deleteComplain(ComplainDTO complain);

        ComplainDTO getComplainById(Long id);

        ComplainDTO deleteComplainById(Long id);

        List<ComplainDTO> getAllComplains();

        List<ComplainDTO> getComplainByArea(String area);
}
