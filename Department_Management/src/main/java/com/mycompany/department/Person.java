/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.department;

/**
 *
 * @author kisha
 */


import java.time.LocalDateTime;

public class Person {

String name;

int date, month ,year;



int age,curr_year;


Person(String name, int date,int month, int year){
this.name = name;
this.date = date;
this.month = month;
this.year = year;
}
void Calculate_age(){
LocalDateTime now = LocalDateTime.now();

curr_year = now.getYear();
if(this.month > now.getMonthValue()){
age = curr_year - this.year -1;

}
else{

age = curr_year - this.year -1;
}
}
void displayAge() { System.out.println("Your current age is "+age);
}}