/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bankaccount;

/**
 *
 * @author kisha
 */

import java.util.*;
interface Debitable{
    void withdraw();
}
public class BankAccount {
    static int accNumSaving = 11000;
    static int accNumFD = 55000;

    public static void main(String[] args) {
        // TODO code application logic here
        int value = 0;
        Scanner sc = new Scanner(System.in);
        do {
             System.out.println("WELCOME");
              System.out.println("Select from the following menu");
            System.out.println("1: Saving Account\n2: FD Account\n**-1: to exit**\nEnter value: ");
            value = sc.nextByte();
            if (value == 1) {
                // openaccount
                OpenAccount obj = new savingAccount(accNumSaving, 121145144, "Maitri", 0.04f, 100100);
                accNumSaving++;
                obj.display();
                obj.deposit(2000);
            } else if (value == 2) {
                // FD-Account
                System.out.println("Enter lockInPeriod: \n");
                float lockInPeriod = sc.nextFloat();
                System.out.println("Enter FD amount: \n");
                float fd = sc.nextFloat();
                OpenAccount obj = new FixedDepositAccount(accNumFD, 121145144, "Maitri", 0.04f, 101100f, lockInPeriod, fd);
                accNumFD++;
 obj.updateIntrest();
                obj.display();
            } else {
                System.out.println("Invalid Input!...\n");
                break;
            }
        }while(value!=-1);
}
}