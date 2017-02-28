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

/**
 *
 * @author Mohd
 */
public class JavaCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Calculator calc=new Calculator();
        int sum=0;
        System.out.println("Please Enter two numbers separated by comma");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String numbers=reader.readLine();
            sum=calc.Add(numbers);
            if(sum==3030)
            {
                System.out.println("You've entered too many numbers");
            }
            else
            System.out.println("The sum = "+sum);
        } catch (IOException ex) {
            Logger.getLogger(JavaCode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
