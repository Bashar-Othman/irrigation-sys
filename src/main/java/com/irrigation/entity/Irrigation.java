package com.irrigation.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author BasharOthman
 */
@Entity
@Table(name = "IRRIGATION")
@Getter
@Setter
@ToString
public class Irrigation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "irrigation_time_slot")
    private String irrigationTimeSlot;

    @Column(name = "description")
    @JsonIgnore
    private String description;

    @Column(name = "activation_status")
    @JsonIgnore
    private Boolean isActive;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    Collection<PlotLand> lands;

}
