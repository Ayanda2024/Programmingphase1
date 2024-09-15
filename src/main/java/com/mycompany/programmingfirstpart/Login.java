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
        //Methods for ensuring entered password meets Password Complexity requirements
        if (enteredpassword.length()>=8 && enteredpassword.contains(".[A-Z].")&& enteredpassword.contains(".[0-9].")&& enteredpassword.contains("!")||enteredpassword.contains("@")||enteredpassword.contains("#")||enteredpassword.contains("$")||enteredpassword.contains("%")||enteredpassword.contains("^")||enteredpassword.contains("&")){
          //Statement that executes if entered password meets Password complexity requuirements
            System.out.println("Password successfully captured");
            return true;
            
        }
        else{
            //Statement that executes if entered password does not meet Password complexity requirements
            System.out.println("Password is not correctly formatted ,please ensure that the password contains atleast 8 characters,a capital letter,a number and a special character ");
                    return false;
                    }
        
    }
    public static String Registeruser( String enteredusername,String enteredpassword){
        //Message that outputs if username format is incorrect
        if(!checkusername(enteredusername)){
            return"Username incorrectly formatted";
            
        }
        //Message that outputs if passwordcomplexity requirements are not met
        else if(!PasswordComplexity(enteredpassword)){
            return"PasswordComplexity requirements not met";
        }
        else{
            return"You have been succesfully registered username:"+enteredusername;
        }
        
    }
    public static String loginUser(String enteredusername,String enteredpassword){
        //Declarations
        String username="Aya_1";
        String password="Berry@1992!";
        String firstname="Ayanda";
        String lastname="Ngwenya";
        //ensuring login details entered matches the login details stored when the user registers
        if(enteredusername.equals(username)&&enteredpassword.equals(password)){
            
            return"Welcome:"+firstname+lastname+"It is great to see you again";
            
            
        }
        else{
       return" Username or password incorrect, please try again";
        }
        
    }
    
}
