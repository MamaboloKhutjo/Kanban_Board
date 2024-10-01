/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.login_signin_program;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Khutjo Mamabolo
 */
public class Task_ClassTest {

    @Test
    void testCheckTaskDescription_LessThan50() {
        Task_Class taskClass = new Task_Class();
        String[] taskDescription = new String[49]; // Creating an array with length less than 50
        boolean result = taskClass.CheckTaskDescription(taskDescription);
        assertFalse(result, "Task description length should be less than or equal to 50");
    }
    
    @Test
    void testCheckTaskDescription_GreaterThan50() {
        Task_Class taskClass = new Task_Class();
        String[] taskDescription = new String[51]; // Creating an array with length greater than 50
        boolean result = taskClass.CheckTaskDescription(taskDescription);
        assertTrue(result, "Task description length should be greater than 50");
    }
    
    @Test
    void testCreateTaskID() {
        Task_Class taskClass = new Task_Class();
        String[] taskName = {"Login Feature"};
        String[] devName = {"Robyn Harrison"};
        String expectedID = "LO:0:SON"; 
        String result = taskClass.CreateTaskID(taskName, devName, 0);
        assertEquals(expectedID, result, "Task ID should match expected format");
    }
 
}
