/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mohd
 */
public class JavaCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic 
        Calculator calc=new Calculator();
        int sum=0;
        String number="";
        String str;
        System.out.println("Please Enter two operands separated by comma, you could saparate the first operand with new lines for as many numbers you want");
          
        number=calc.reading();
        sum=calc.Add(number);
        if(sum==3030)
             System.out.println("Invalid entry");
        else System.out.println("The sum = "+sum);
         

       
       


    }
    
}
