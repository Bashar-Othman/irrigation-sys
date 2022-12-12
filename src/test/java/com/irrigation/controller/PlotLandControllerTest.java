/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.irrigation.controller;

import com.irrigation.data.dto.PlotLandDto;
import com.irrigation.entity.PlotLand;
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
public class PlotLandControllerTest {

    public PlotLandControllerTest() {
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
     * Test of listAll method, of class PlotLandController.
     */
    @Test
    public void testListAll() {
        System.out.println("listAll");
        PlotLandController instance = new PlotLandController();
        List<PlotLand> expResult = null;
        List<PlotLand> result = instance.listAll();
        assertEquals(expResult, result);
        // fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class PlotLandController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        PlotLandDto plotLandDto = null;
        PlotLandController instance = new PlotLandController();
        ResponseEntity<PlotLand> expResult = null;
        ResponseEntity<PlotLand> result = instance.create(plotLandDto);
        assertEquals(expResult, result);
        // fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class PlotLandController.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Long id = null;
        PlotLandDto plotLandDto = null;
        PlotLandController instance = new PlotLandController();
        ResponseEntity<PlotLand> expResult = null;
        ResponseEntity<PlotLand> result = instance.update(id, plotLandDto);
        assertEquals(expResult, result);
        //  fail("The test case is a prototype.");
    }

    /**
     * Test of activation method, of class PlotLandController.
     */
    @Test
    public void testActivation() {
        System.out.println("activation");
        Long id = null;
        Boolean status = null;
        PlotLandController instance = new PlotLandController();
        ResponseEntity<PlotLand> expResult = null;
        ResponseEntity<PlotLand> result = instance.activation(id, status);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

}
