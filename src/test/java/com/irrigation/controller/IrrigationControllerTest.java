/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.irrigation.controller;

import com.irrigation.data.dto.IrrigationDto;
import com.irrigation.entity.Irrigation;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author BasharOthman
 */
public class IrrigationControllerTest {

    public IrrigationControllerTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of listAll method, of class IrrigationController.
     */
    @Test
    public void testListAll() {
        System.out.println("listAll");
        IrrigationController instance = new IrrigationController();
        List<Irrigation> expResult = null;
        List<Irrigation> result = instance.listAll();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class IrrigationController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        IrrigationDto irrigationDto = null;
        IrrigationController instance = new IrrigationController();
        ResponseEntity<Irrigation> expResult = null;
        ResponseEntity<Irrigation> result = instance.create(irrigationDto);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class IrrigationController.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Long id = null;
        IrrigationDto irrigationDto = null;
        IrrigationController instance = new IrrigationController();
        ResponseEntity<Irrigation> expResult = null;
        ResponseEntity<Irrigation> result = instance.update(id, irrigationDto);
        assertEquals(expResult, result);
        // fail("The test case is a prototype.");
    }

    /**
     * Test of activation method, of class IrrigationController.
     */
    @Test
    public void testActivation() {
        System.out.println("activation");
        Long id = null;
        Boolean status = null;
        IrrigationController instance = new IrrigationController();
        ResponseEntity<Irrigation> expResult = null;
        ResponseEntity<Irrigation> result = instance.activation(id, status);
        assertEquals(expResult, result);
        //  fail("The test case is a prototype.");
    }

}
