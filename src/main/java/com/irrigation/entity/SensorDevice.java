/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.irrigation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author BasharOthman
 */
@Entity
@Table(name = "SENSOR_DEVICE")
@Getter
@Setter
public class SensorDevice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "PLOT_LONGITUDE")
    private String longitude;

    @Column(name = "PLOT_LATITUDE")
    private String latitude;

    @OneToOne
    private PlotLand plotLand;

    @Column(name = "status")
    private Boolean isActive;

}
