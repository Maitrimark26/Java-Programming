/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practical1;

/**
 *
 * @author kisha
 */
public class Practical1 {

    public static void main(String[] args) {
        System.out.println("A)Stack implementation");
  Stack s1=new Stack(5);
 
  s1.push(3);
      s1.push(13);    
          s1.push(23); 
             s1.push(33);    
             s1.push(43); 
              s1.display();
              int t=s1.peek(); //peek;
                System.out.println("peek of stack is "+t);
            int m=  s1.pop();//pop
          System.out.println("Element poped put is "+m);
     
             s1.display();//display
              s1.push(43); 
                s1.push(53); 
                  s1.display();
     System.out.println("\nB)Volume of different Shapes:");
       Shape s=new Shape();
        
        System.out.println("\n Volume of Sphere is "+s.volume(3.54));
        System.out.println("\n Volume of Cube is "+s.volume(5));
        System.out.println("\n Volume of Cuboid is "+s.volume(5.1f,3.2f,1.8f));
        System.out.println("\n Volume of Cylinder is "+s.volume(6.5,2));
    }
    
}
