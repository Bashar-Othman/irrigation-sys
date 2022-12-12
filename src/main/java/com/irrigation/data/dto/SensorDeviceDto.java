/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.irrigation.data.dto;

import com.irrigation.entity.PlotLand;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author BasharOthman
 */
@Getter
@Setter
public class SensorDeviceDto {

    private Long id;

    private String longitude;

    private String latitude;

    private PlotLandDto plotLand;

    private Boolean isActive;
}
