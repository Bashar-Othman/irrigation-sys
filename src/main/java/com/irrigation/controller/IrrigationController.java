/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.irrigation.controller;

import com.irrigation.data.dto.IrrigationDto;
import com.irrigation.entity.Irrigation;
import com.irrigation.service.IrrigationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author BasharOthman
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/irri")
public class IrrigationController {

    @Autowired
    private IrrigationService irrigationService;

    @GetMapping("list")
    public List<Irrigation> listAll() {

        return irrigationService.listAll();

    }

    @PostMapping("irri")
    public ResponseEntity<Irrigation> create(@RequestBody IrrigationDto irrigationDto) {

        Irrigation irrigation = irrigationService.create(irrigationDto);
        return new ResponseEntity<>(irrigation, HttpStatus.OK);
    }

    @PutMapping("irri/{id}")
    public ResponseEntity<Irrigation> update(@PathVariable("id") Long id, @RequestBody IrrigationDto irrigationDto) {

        Irrigation irrigation = irrigationService.update(id, irrigationDto);
        return new ResponseEntity<>(irrigation, HttpStatus.OK);
    }

    @PutMapping("activation/{id}/{boo}")
    public ResponseEntity<Irrigation> activation(@PathVariable("id") Long id, @PathVariable("boo") Boolean status) {

        Irrigation irrigation = irrigationService.deactivte(id, status);
        return new ResponseEntity<>(irrigation, HttpStatus.OK);
    }

}
