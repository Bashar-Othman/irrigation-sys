/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.irrigation.data.dto;

import com.irrigation.entity.PlotLand;
import java.util.Collection;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author BasharOthman
 */
@Getter
@Setter
public class IrrigationDto {

    private Long id;

    private String landId;

    private String irrigationTimeSlot;

    private String description;

    Collection<PlotLand> lands;
}
