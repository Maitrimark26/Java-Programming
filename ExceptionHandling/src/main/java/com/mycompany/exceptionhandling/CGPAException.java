/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exceptionhandling;

/**
 *
 * @author kisha
 */
public class CGPAException extends Exception{
    float f;
    CGPAException(float cgpa){
        f = cgpa;
    }
    public String toString(){
        return "Invalid CGPA"+f+"\n";
}
}
