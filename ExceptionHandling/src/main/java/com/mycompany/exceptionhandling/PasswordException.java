/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exceptionhandling;

/**
 *
 * @author kisha
 */
public class PasswordException  extends Exception{
    String en;
    PasswordException(String s){
        en = s;
    }
    public String toString(){
        return "Password format wrong\n";
}
}
