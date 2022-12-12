/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.irrigation.entity.repository;

import com.irrigation.entity.Irrigation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author BasharOthman
 */
@Repository
public interface IrrigationRepository extends JpaRepository<Irrigation, Long> {

}
