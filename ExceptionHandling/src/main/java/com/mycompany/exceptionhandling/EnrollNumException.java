/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exceptionhandling;

/**
 *
 * @author kisha
 */
public class EnrollNumException extends Exception{
    String en;
    EnrollNumException(String s){
        en = s;
    }
    public String toString(){
        return "Enrollment number wrong\n";
}
}
