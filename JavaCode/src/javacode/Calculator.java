/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Mohd
 */
public class Calculator {
    int sum=0;
    int x;
   //CharSequence theSparator=",";
    String numbers="";
    String newNumbers="";
    String []Lines;
    public int Add(String number)
    {
        if(number.isEmpty()||number.equals(""))
            return sum;
        if(number.contains(","))
        {
            String parts[]=number.split(",");
           
           
            for(int i=0;i<parts.length;i++)
            {
                try{
                x=Integer.parseInt(parts[1]);
                }
                catch(Exception e)
                   {
                       return sum=3030;
                   }
                if(parts[i].contains("/"))
                {
                    Lines=parts[i].split("/");
                            for(int j=0;j<Lines.length;j++)
                            {
                                sum+=Integer.parseInt(Lines[j]);
                            }
                }
                else 
                {
                    
                    sum+=Integer.parseInt(parts[i]);
                }   
            }
            return sum;

        }
        else
        {
            sum=Integer.parseInt(number);
            return sum;
        }
        
        
    }
    public String reading() throws IOException
    {
        String str="";
        boolean flag=false;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        str=reader.readLine();
        if(str.length()>3)
        if(str.startsWith("//"))
        {
            flag=true;
              
        }
              
        int count=0;
        int lines=0;
        while(count!=1)
        {
            if (lines==0 && !(str.startsWith("//")))
            {
                
                newNumbers+=str+"/";
               
           
                if(newNumbers.contains(","))
                 {
                    count++;
                 }
            numbers=numbers+newNumbers; 
            lines++;
            // JOptionPane.showMessageDialog(null, newNumbers);
            }
            
            else if(lines==0 && (str.startsWith("//")))
            {
            newNumbers=reader.readLine()+"/";
           
            newNumbers=newNumbers.replace(str.charAt(2)+"", ",");
            if(newNumbers.contains(","))
            {
               count++;
            }
            numbers=numbers+newNumbers; 
            lines++;
            }
            else if(lines!=0 && str.startsWith("//"))
            {
             newNumbers=reader.readLine()+"/";
            newNumbers=newNumbers.replace(str.charAt(2)+"", ",");
            if(newNumbers.contains(","))
            {
               count++;
            }
            numbers=numbers+newNumbers; 
            lines++;
            }
            else if(lines!=0 && !(str.startsWith("//")))
            {
             newNumbers=reader.readLine()+"/";
           
            if(newNumbers.contains(","))
            {
               count++;
            }
            numbers=numbers+newNumbers; 
            lines++;
            }
        }
        numbers=numbers.substring(0,numbers.length()-1);
       return numbers;
        
    }
}
