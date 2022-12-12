/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.irrigation.service;

import com.irrigation.data.dto.SensorDeviceDto;
import com.irrigation.entity.SensorDevice;
import com.irrigation.entity.repository.SensorRepository;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author BasharOthman
 */
@Service
public class SensorService {

    @Autowired
    private SensorRepository sensorRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<SensorDevice> listAll() {

        return sensorRepository.findAll();

    }

    public SensorDevice create(SensorDeviceDto sensorDeviceDto) {

        SensorDevice sensorDevice = modelMapper.map(sensorDeviceDto, SensorDevice.class);

        return sensorRepository.save(sensorDevice);

    }

    public SensorDevice update(Long id, SensorDeviceDto sensorDeviceDto) {

        sensorDeviceDto.setId(id);
        SensorDevice sensorDeviceDB = sensorRepository.findById(id).get();
        SensorDevice sensorDevice = modelMapper.map(sensorDeviceDto, SensorDevice.class);

        return sensorRepository.save(sensorDevice);

    }

}
