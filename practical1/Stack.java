/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical1;

/**
 *
 * @author kisha
 */
public class Stack {
    int size;
    int val;
    int s[];
    int top;
    public Stack(int s){
        size=s;
        this.s=new int[size];
        this.top=-1;
    }
    boolean isFull(){
        if(top>=size-1){
            return true;
        }
        else{
            return false;
        }
    }
    boolean isEmpty(){
       if(top==-1){
            return true;
        }
        else{
            return false;
        }
    }
    void push(int val){
    if(isFull()){
            System.out.println("stack is full");
            
        }
    else{
             top++;
        s[top]=val;
        }
    }
       int pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        else{
        int p=s[top];
        top--;
       
        return p;
        }
    }
    void display(){
        System.out.print("Stack elements are:\n");
        for(int i=0;i<=top;i++){
            System.out.print(s[i]+"\n");
        }
    }
    int peek(){
        return s[top];
    }
}

