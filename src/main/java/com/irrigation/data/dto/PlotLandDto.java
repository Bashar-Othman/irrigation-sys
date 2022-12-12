/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.irrigation.data.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author BasharOthman
 */
@Getter
@Setter
public class PlotLandDto {

    private Long id;

    private String plotName;

    private String plotWidth;

    private String plotHeight;

    private String waterAmount;

    private String startTime;

    private String durationInMinutes;

    private String longitude;

    private String latitude;

}
