/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.department;

/**
 *
 * @author kisha
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.list;
public class Student extends Person{
int roll_no,sem,age;
double cgpa;
private List <Double> CgpaList = new ArrayList();

Scanner sc = new Scanner(System.in);

Student(String name, int date,int month,int year,int roll_no,int sem)
{
super(name, date, month ,year);
this.roll_no = roll_no;

this.sem = sem;

for(int i=0;i<this.sem;i++) 
{

System.out.printf("Enter CGPA of sem %d: " ,i+1);

double CGPA = sc.nextDouble();
CgpaList.add(CGPA);
}

}
double Department_Average(Student[] s){
int ans = 0;
for (Student student : s) {
ans += student.cgpa;
}
ans = ans/s.length;
return ans;
}
double Calculate_average_age(Student[] s){
double ans = 0;

for(Student student: s){
student.Calculate_age();
ans+=student.age;

}

ans = ans/s.length;

return ans;
}
void Calculate_avg_sew_cgpa(int n){

double ans = 0;

for(int i=0;i<n;i++){
ans+=Cgpalist.get(i);

}

cgpa = ans/n;
}
void display_cgpa(){
for(int i=0;i<CgpaList.size();i++){
System.out.printin("SGPA of sem "+i+1+" "+Cgpalist.get(i));
}
}
void display(){
System.out.printf("Name :~ %s\nRoll No.:~ %d\n" +
"Semester :- %d\n" +
"CGPA :- %f\n",
super.name,roll_no ,sem ,cgpa);
}}