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
public class Login_class {

    private String firstName;
    private String lastName;
    private String userName;
    private String Password;
    private String inputUsername;
    private String inputPassword;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setInputUserName(String InputtedUserName) {
        this.inputUsername = InputtedUserName;
    }

    public void setInputPassword(String InputtedPassword) {
        this.inputPassword = InputtedPassword;
    }
    
    /*=========================================================================================================================================================================================
    This is for the Registration of the user
     */
    public boolean checkUserName(String userName) {
        return userName.length() <= 5 && userName.contains("_"); // varifying if the user has inputed information that meets the requirements for the username
    }

    public boolean checkPassword(String password) {
        return password.length() >= 8 && Uppercase(password) && Number(password) && containsSpecialCharacter(password);  // varifying if the user has inputed information that meets the requirements for the password
    }

    public String registerUser(String userName, String password) {   //method that checks if the user can be registered or not
        if (checkUserName(userName) && checkPassword(password) && containsSpecialCharacter(password)) {
            return "Registration successful ";
        }
        return "Registration Failed";
    }

    public static boolean Uppercase(String password) {  // method to confirm if the users password has a Capital letter or not
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;      // capital letter is found            
            }
        }
        return false;  // capital letter not found
    }

    public static boolean Number(String password) { // method to confirm if the users password has at atleast one digit or not
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;         // Digit is found         
            }
        }
        return false;     // Digit not found
    }

    public static boolean containsSpecialCharacter(String str) {  //method for checking if the inputted value has a character or not.
        String specialCharacters = "!@#$%^&*()-_+=<>?/.,";

        for (int i = 0; i < str.length(); i++) {  // this is a loop that goes through each character.
            if (specialCharacters.contains(Character.toString(str.charAt(i)))) {  // checks if the charcter has a special character or not
                return true; //special character is found
            }
        }
        return false;//special character is not found
    }

    /*==========================================================================================================================================================================================
    Thiss is for the Users Login
   
     */

    public boolean loginUser(String inputUsername, String inputPassword) {

        Frame Signin = new Frame();
        Login_Frame Login = new Login_Frame();

        inputUsername = Login.getInputUsername();
        inputPassword = Login.getInputPassword();

        userName = Signin.getUserName();
        Password = Signin.getPassword();

        if (userName.equals(inputUsername) && Password.equals(inputPassword)) {
            return true;
        }
        return false;
    }

    public String returnLoginStatus(String userName, String password) {   //method that checks if the user can login or not
        if (loginUser(userName, password)) {
            return "Login successful";
        }
        return "Login failed";
    }

    public String generateWelcomeMessage(String userName) {
        if (checkUserName(userName)) {
            return "Welcome " + userName.substring(0, 1).toUpperCase() + userName.substring(1);
        }
        return "";
    }

}
