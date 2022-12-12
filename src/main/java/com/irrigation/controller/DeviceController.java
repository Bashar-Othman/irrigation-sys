/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.irrigation.controller;

import com.irrigation.data.dto.IrrigationDto;
import com.irrigation.data.dto.SensorDeviceDto;
import com.irrigation.entity.Irrigation;
import com.irrigation.entity.SensorDevice;
import com.irrigation.service.IrrigationService;
import com.irrigation.service.SensorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author BasharOthman
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/sensor")
public class DeviceController {

    @Autowired
    private SensorService sensorServiceS;

    @GetMapping("list")
    public List<SensorDevice> listAll() {

        return sensorServiceS.listAll();

    }

    @PostMapping("sensor")
    public ResponseEntity<SensorDevice> create(@RequestBody SensorDeviceDto sensorDeviceDto) {

        SensorDevice sensorDevice = sensorServiceS.create(sensorDeviceDto);
        return new ResponseEntity<>(sensorDevice, HttpStatus.OK);
    }

}
