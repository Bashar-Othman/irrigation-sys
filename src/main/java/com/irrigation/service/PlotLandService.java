/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.irrigation.service;

import com.irrigation.data.dto.PlotLandDto;
import com.irrigation.entity.PlotLand;
import com.irrigation.entity.repository.PlotLandRepository;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author BasharOthman
 */
@Service
public class PlotLandService {

    @Autowired
    private PlotLandRepository plotLandRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<PlotLand> listAll() {

        return plotLandRepository.findAll();

    }

    public PlotLand create(PlotLandDto plotLandDto) {

        PlotLand plotLand = modelMapper.map(plotLandDto, PlotLand.class);

        return plotLandRepository.save(plotLand);

    }

    public PlotLand update(Long id, PlotLandDto plotLandDto) {

        plotLandDto.setId(id);
        PlotLand plotLandDB = plotLandRepository.findById(id).get();
        PlotLand plotLand = modelMapper.map(plotLandDto, PlotLand.class);

        return plotLandRepository.save(plotLand);

    }

    public PlotLand deactivte(Long id, Boolean status) {

        PlotLand plotLandDB = plotLandRepository.findById(id).get();

        plotLandDB.setIsActive(Boolean.FALSE);
        return plotLandRepository.save(plotLandDB);

    }

}
