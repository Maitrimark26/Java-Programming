/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical1;

/**
 *
 * @author kisha
 */
public class Shape {
    
    
    
    //sphere, cube, cuboid and cylinder.
  double  volume(double r)//sphere
     {
         double vol=(4/3)*3.14*r*r*r;
       return vol;
     }
       int  volume(int r)//cube
     {
         int vol=r*r*r;
           return vol;
     }
          float volume(float l,float b,float h)//cuboid
     {
         float vol=l*b*h;
           return vol;
     }
             double  volume(double r,double h)//cylinder
     {
         double vol=3.14*r*r*h;
        return vol;
     }
}
