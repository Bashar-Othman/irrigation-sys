package com.irrigation.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author BasharOthman
 */
@Entity
@Table(name = "PLOT_LAND")
@Getter
@Setter
public class PlotLand implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "PLOT_NAME")
    private String plotName;

    @Column(name = "PLOT_WIDTH")
    private String plotWidth;

    @Column(name = "PLOT_HEIGHT")
    private String plotHeight;

    @Column(name = "water_amount")
    private String waterAmount;

    @Column(name = "activation_status")
    private Boolean isActive;

    @Column(name = "start_time")
    private String startTime;

    @Column(name = "duration_in_minutes")
    private String durationInMinutes;

    @Column(name = "PLOT_LONGITUDE")
    private String longitude;

    @Column(name = "PLOT_LATITUDE")
    private String latitude;

}
