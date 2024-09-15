/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programmingfirstpart;
/**
 *
 * @author RC_Student_lab
 */
class Login {
    public static boolean checkusername(String enteredusername){
    //ensuring that the entered username is formatted correcytly
            if (enteredusername.contains("_")&&enteredusername.length()<=5){
               System.out.println( "Username successfully captured" );
               return true;
            }
            else{
                System.out.println("Username is not correctly formatted ,please ensure that your username contains an underscore and is no more than 5 characters in length");
                return false;
            }
            
    }
    public static boolean PasswordComplexity(String enteredpassword){
        if (enteredpassword.length()>=8 && enteredpassword.contains(".[A-Z].")&& enteredpassword.contains(".[0-9].")&& enteredpassword.matches(".[!@#$%^&].")){
            System.out.println("Password successfully captured");
            return true;
            
        }
        else{
            System.out.println("Password is not correctly formatted ,please ensure that the password contains atleast 8 characters,a capital letter,a number and a special character ");
                    return false;
                    }
        
    }
    public static String Registeruser( String enteredusername,String enteredpassword){
        //Validating username format
        if(checkusername(enteredusername)){
            return"Invalid username,please make sure that your username contains an underscore and it is no more than 5 characters in length";
            
        }
        else if(PasswordComplexity(enteredpassword)){
            return"PasswordComplexity requirements not met,please utilise 8+ characters,an uppercase letter, a digit and a special character";
        }
        else{
            return"You have been succesfully registered username:"+enteredusername+"Successfully registered";
        }
    }
}
