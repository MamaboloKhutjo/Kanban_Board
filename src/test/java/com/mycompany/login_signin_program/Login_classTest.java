/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.login_signin_program;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Khutjo Mamabolo ST10438214
 */
public class Login_classTest {
    
    public Login_classTest() {
    }

     @Test
    public void testCheckUserName() {
        Login_class login = new Login_class(); // Instantiating the Login_class
            String firstName = "Kyle";
            String lastName = "Reedman";
        
                assertEquals(true, login.checkUserName("Kyl_1"));  //checking if the Username inputed meets the requiremnts of the CheckUsername method
                System.out.println("Welcome " + firstName + "," + " " + lastName + " It is great to see you");
         
                assertEquals(false, login.checkUserName("Kyle!!!!!!!")); //checking in the case that the username doesnt meet the requiremnts of the CheckUsername method
                System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length"); 
        
    }

    @Test
    public void testCheckPassword() {
        Login_class login = new Login_class();
            assertEquals(true, login.checkPassword("Ch&&sec@ke99!")); // checking if the password inputted meets the Checkpassword methods requirements
            System.out.println("Password sucessfully captured"); 
        
            assertEquals(false, login.checkPassword("password")); // checking in the case that the password inputted doenst meet the requirements of the Checkpassword method
            System.out.println("Password is not correctly formatted, please ensure that the password contains atleast 8 characters, a capital letter, a number and a  special character"); 
    }  
}
