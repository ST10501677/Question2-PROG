/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consoleapp;

/**
 *
 * @author Student
 */

import java.util.Scanner;
public class ConsoleApp {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.print("Enter a console device");
       System.out.print("1.Ps5");
       System.out.print("2.Xbox");
       System.out.print("3.switch");
       String select = input.nextLine();
       boolean select = true ;
       
        if( select = 1) {
           
           System.out.print("Enter store name");
           String name = input.nextLine();
           
           System.out.print("Enter the total sales of Ps5 " +name);
           int sales = input.nextInt();
           
           System.out.println("\nConsole SALES REPORT");
           System.out.println("------------------");
           System.out.println("Console Type : Ps5");
           System.out.println("Store: " +name);
           System.out.println("Total Sales : " + sales);
       } else if( select = 2) {
           
           System.out.print("Enter store name");
           String name = input.nextLine();
           
           System.out.print("Enter the total sales of Xbox " +name);
           int sales = input.nextInt();
           
           System.out.println("\nConsole SALES REPORT");
           System.out.println("------------------");
           System.out.println("Console Type : Xbox");
           System.out.println("Store: " +name);
           System.out.println("Total Sales : " + sales);
       } else if( select = 3) {
           
           System.out.print("Enter store name");
           String name = input.nextLine();
           
           System.out.print("Enter the total sales of Ps5 " +name);
           int sales = input.nextInt();
           
           System.out.println("\nConsole SALES REPORT");
           System.out.println("------------------");
           System.out.println("Console Type : Switch");
           System.out.println("Store: " +name);
           System.out.println("Total Sales : " + sales);
       } else{ 
           System.out.println("INCORRECT VALUE ENTERD.PLEASE TRY AGAIN");
       }
       }
    }
    

