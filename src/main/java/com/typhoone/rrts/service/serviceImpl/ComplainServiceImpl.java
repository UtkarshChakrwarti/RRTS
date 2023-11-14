package com.typhoone.rrts.service.serviceImpl;

import com.typhoone.rrts.dtos.ComplainDTO;
import com.typhoone.rrts.entity.actions.Complain;
import com.typhoone.rrts.repository.actionsRepository.ComplainRepository;
import com.typhoone.rrts.service.ComplainService;
import com.typhoone.rrts.utility.EntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ComplainServiceImpl implements ComplainService {

    private final ComplainRepository complainRepository;

    private final EntityMapper entityMapper;

    @Autowired
    public ComplainServiceImpl(ComplainRepository complainRepository, EntityMapper entityMapper) {
        this.complainRepository = complainRepository;
        this.entityMapper = entityMapper;
    }

    @Override
    public ComplainDTO createComplain(ComplainDTO complain) {
        Complain complains = new Complain();
        return getComplainDTO(complain, complains);

    }

    private ComplainDTO getComplainDTO(ComplainDTO complain, Complain complains) {
        complains.setArea(complain.getArea());
        complains.setLocation(complain.getLocation());
        complains.setTelephone(complain.getTelephone());
        complains.setDescription(complain.getDescription());
        complains.setComments(complain.getComments());
        complainRepository.save(complains);
        return entityMapper.toDto(complains, ComplainDTO.class);
    }

    @Override
    public ComplainDTO updateComplain(ComplainDTO complain) {
        try {
            Complain complains = complainRepository.findById(complain.getId()).orElseThrow();
            return getComplainDTO(complain, complains);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public ComplainDTO deleteComplain(ComplainDTO complain) {
        try {
            Complain complains = complainRepository.findById(complain.getId()).orElseThrow();
            complainRepository.delete(complains);
            return entityMapper.toDto(complains, ComplainDTO.class);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public ComplainDTO getComplainById(Long id) {
        try {
            Complain complains = complainRepository.findById(id).orElseThrow();
            return entityMapper.toDto(complains, ComplainDTO.class);
        } catch (Exception e) {
            return null;
        }

    }

    @Override
    public ComplainDTO deleteComplainById(Long id) {
        try {
            Complain complains = complainRepository.findById(id).orElseThrow();
            complainRepository.delete(complains);
            return entityMapper.toDto(complains, ComplainDTO.class);
        } catch (Exception e) {
            return null;
        }

    }

    @Override
    public List<ComplainDTO> getAllComplains() {
        try {
            List<Complain> complains = complainRepository.findAll();
            List<ComplainDTO> complainDTOS = new ArrayList<>();
            for (Complain complain : complains) {
                complainDTOS.add(entityMapper.toDto(complain, ComplainDTO.class));
            }
            return complainDTOS;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<ComplainDTO> getComplainByArea(String area) {
        try {
            List<Complain> complains = complainRepository.findByArea(area);
            List<ComplainDTO> complainDTOS = new ArrayList<>();
            for (Complain complain : complains) {
                complainDTOS.add(entityMapper.toDto(complain, ComplainDTO.class));
            }
            return complainDTOS;
        } catch (Exception e) {
            return null;
        }
        
    }
}
