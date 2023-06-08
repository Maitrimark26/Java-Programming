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
public class savingAccount extends OpenAccount implements Debitable {
    savingAccount(int acc_no,int aadhar,String Name,float ROI,float bal){
        super(acc_no,aadhar,Name,ROI,bal);
    }
    public void withdraw(){
        Scanner sc= new Scanner(System.in);
        float Amount= sc.nextFloat();
        super.bal-=Amount;
    System.out.println("The Withdrawal Amount is: "+Amount);
System.out.println("The Present Account Balance is"+ this.bal);
    }
    void display(){
     System.out.println("Account Holder Name : "+this.Name+"\n");
       System.out.println("Account Number : "+this.acc_no+"\n");
       System.out.println("Balance : "+this.bal+"\n");
    }


}