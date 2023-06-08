/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankaccount;

/**
 *
 * @author kisha
 */

import java.util.*;
public class OpenAccount {
    int acc_no,aadhar;
    String Name;
    float ROI,bal;

    OpenAccount(int acc_no,int aadhar,String Name,float ROI,float bal){
        this.acc_no=acc_no;
        this.aadhar=aadhar;
        this.Name=Name;
        this.ROI=ROI;
        this.bal=bal;
    }
    void deposit(int Amount){
        this.bal+=Amount;
        System.out.println("The Account Balance after Deposit is:"+bal+"\n");
    }
    void withdraw(int Amount){
        this.bal-=Amount;
        System.out.printf("The Account Balance after withdrawal is:",bal,"\n");
    }

    void updateIntrest(){
        System.out.printf("Depositing 4% intrest to the Account","\n");
        this.bal*=0.04*this.bal;
        System.out.printf("The Updated Balance : ",this.bal,"\n");
    }
    public void closeAccount(){
        this.acc_no=0;
        this.aadhar=0;
        this.Name="";
        this.ROI=0;
     System.out.printf("The Withdrawed Amount is: ",this.bal,"\n");
        this.bal=bal;
        System.out.printf("Account Closed.","\n");
    }
    void display(){
     System.out.println("Account Holder Name : "+this.Name+"\n");
     System.out.println("Account Number : "+this.acc_no+"\n");
       System.out.println("Balance : "+this.bal+"\n");
    }
}