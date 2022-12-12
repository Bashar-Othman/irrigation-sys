/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.irrigation.service;

import com.irrigation.data.dto.IrrigationDto;
import com.irrigation.entity.Irrigation;
import com.irrigation.entity.repository.IrrigationRepository;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author BasharOthman
 */
@Service
public class IrrigationService {

    @Autowired
    private IrrigationRepository irrigationRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<Irrigation> listAll() {

        return irrigationRepository.findAll();

    }

    public Irrigation create(IrrigationDto irrigationDto) {

        Irrigation irrigation = modelMapper.map(irrigationDto, Irrigation.class);

        System.out.println(irrigation.getLands().size());

        return irrigationRepository.save(irrigation);

    }

    public Irrigation update(Long id, IrrigationDto irrigationDto) {

        irrigationDto.setId(id);
        Irrigation irrigationDB = irrigationRepository.findById(id).get();
        Irrigation irrigation = modelMapper.map(irrigationDto, Irrigation.class);

        return irrigationRepository.save(irrigation);

    }

    public Irrigation deactivte(Long id, Boolean status) {

        Irrigation irrigationDB = irrigationRepository.findById(id).get();

        irrigationDB.setIsActive(Boolean.FALSE);
        return irrigationRepository.save(irrigationDB);

    }

}
