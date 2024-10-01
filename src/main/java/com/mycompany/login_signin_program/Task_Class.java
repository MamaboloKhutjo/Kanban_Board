/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login_signin_program;

import javax.swing.JOptionPane;

/**
 *
 * @author Khutjo Mamabolo ST10438214
 */
public class Task_Class {
 
    
    //method the confirms the length of the description
    boolean CheckTaskDescription(String[] taskDescription){
        return taskDescription.length > 50;
    }
    
    //method to create taskID
    public String CreateTaskID(String[] taskName, String[] devName, int i){
        String ID = taskName[i].substring(0, 2).toUpperCase() + ":" + i + ":" + devName[i].substring(devName[i].length() - 3).toUpperCase();
        return ID;
    }
    
    // dispalying all the task details
    public void printTaskDetails(int choice, String[] taskStatus, String[] developerDetails,int i, String[] taskName, String[] taskDescription,String taskID, int[] taskDuration ){
         JOptionPane.showMessageDialog(null, taskStatus[choice], "task Status", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, developerDetails[i], "developer details", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Task number: " + (i + 1), "task number", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, taskName[i], "task Name", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, taskDescription[i], "task Description", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, taskID, "task ID", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, taskDuration[i] + " Hours", "task Duration", JOptionPane.INFORMATION_MESSAGE);
    }
    
    //method that calculates the total duration of all tasks
    public int returnTotalHours(int[] taskDuration){
        int totalDuration = 0;
         // adding the sum of all task duration and storing them in total duration
        for(int taskTime : taskDuration){
           totalDuration += taskTime; 
        } 
        return totalDuration;
    }
}
