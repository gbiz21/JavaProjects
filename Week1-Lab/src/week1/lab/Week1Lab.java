/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week1.lab;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Germaine Beazer
 * Module 1 - Lab Developing OOP Console App
 * 09/2/2023
 */

public class Week1Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create Scanner object to get input on console environment 
        Scanner scan = new Scanner(System.in); 
        
        
        // loop until user gives us an 'X'
        String name = "";
        
        //while( name.equalsIgnoreCase("X") == false) {
        while( true ) {
            System.out.print("Enter name or X to quit: ");
            name = scan.nextLine();
            
            if( !name.equalsIgnoreCase("X")) {
                // get the rest of information
                System.out.print("Enter age: ");
                int age = scan.nextInt(); 
                System.out.print("Enter weight: ");
                double weight = scan.nextDouble();
                System.out.print("Enter height - feet: ");
                int feet = scan.nextInt();
                System.out.print("Enter height - inches: ");
                double inches = scan.nextDouble();  // 10 ENTER
                scan.nextLine();  // read until it hits a "\n" or ENTER KEY -- use up the ENTER KEY
                
                //show the health profile
                HealthProfile hp = new HealthProfile( name, age, weight, feet, inches ); 
                System.out.println( "\nHealth Profile for " + hp.getName() );
                double bmi = hp.calculateBMI();
                DecimalFormat fmt = new DecimalFormat( "0.0" );
                System.out.println( "BMI: " + fmt.format(bmi) );
                System.out.println( "BMI Category: " + hp.calculateCategory() );
                System.out.println( "Max heart rate: " + hp.calculateMAXHR() );
                System.out.println();
                
                
            }
            else 
            {
                break; // break out of the while loop
            }
           
        }
        
    }
}
    

