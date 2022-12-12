/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.irrigation.controller;

import com.irrigation.data.dto.PlotLandDto;
import com.irrigation.entity.PlotLand;
import com.irrigation.service.PlotLandService;
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
@RequestMapping("/api/plot")
public class PlotLandController {

    @Autowired
    private PlotLandService plotLandService;

    @GetMapping("list")
    public List<PlotLand> listAll() {

        return plotLandService.listAll();

    }

    @PostMapping("plot")
    public ResponseEntity<PlotLand> create(@RequestBody PlotLandDto plotLandDto) {

        PlotLand plotLand = plotLandService.create(plotLandDto);
        return new ResponseEntity<>(plotLand, HttpStatus.OK);
    }

    @PutMapping("plot/{id}")
    public ResponseEntity<PlotLand> update(@PathVariable("id") Long id, @RequestBody PlotLandDto plotLandDto) {

        PlotLand plotLand = plotLandService.update(id, plotLandDto);
        return new ResponseEntity<>(plotLand, HttpStatus.OK);
    }

    @PutMapping("activation/{id}/{boo}")
    public ResponseEntity<PlotLand> activation(@PathVariable("id") Long id, @PathVariable("boo") Boolean status) {

        PlotLand plotLand = plotLandService.deactivte(id, status);
        return new ResponseEntity<>(plotLand, HttpStatus.OK);
    }

}
