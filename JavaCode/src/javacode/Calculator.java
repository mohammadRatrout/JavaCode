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
    int num=0;
    int nigNum[]=new int [10];
    int Max=1000;
    public int Add(String number)
    {
        if(number.isEmpty()||number.equals(""))
            return sum;
        if(number.contains(","))
        {
            int negative=0;
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
                try{
                if(parts[i].contains("/"))
                {
                    Lines=parts[i].split("/");
                            for(int j=0;j<Lines.length;j++)
                            {
                                num=Integer.parseInt(Lines[j]);
                                if(num<0)
                                { 
                                    nigNum[negative]=num;
                                    //JOptionPane.showMessageDialog(null, nigNum[negative]);
                                    negative++;
                                }
                                if(num>1000)
                                    num=0;
                                
                                sum+=num;
                            }
                }
                else 
                {
                    num=Integer.parseInt(parts[i]);
                     if(num<0)
                                { 
                                    nigNum[negative]=num;
                                    negative++;
                                }
                     if(num>1000)
                         num=0;
                    sum+=num;
                }
                if(nigNum[0]<0) throw new IllegalArgumentException();
                }catch(IllegalArgumentException e)
                {
                    for(int k=0;k<nigNum.length;k++)
                    {
                        if(nigNum[k]!=0)
                        System.err.println("You've entered "+nigNum[k]+" and negative numbers are not allowed");
                        
                    }
                    return sum=3030;
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
    public String reading() 
    {
        
        String str="";
        String deli="";
        //boolean flag=false;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
        str=reader.readLine();
        if(str.startsWith("//"))
        {
            deli=str.substring(2,str.length());
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
            
            }
            
            else if(lines==0 && (str.substring(2,str.length())).equals(deli))
            {
            newNumbers=reader.readLine()+"/";
            if(!(newNumbers.contains(deli)||newNumbers.contains("/")))
                throw new IOException();
            newNumbers=newNumbers.replace(deli, ",");
            if(newNumbers.contains(","))
            {
               count++;
            }
            numbers=numbers+newNumbers; 
            lines++;
            }
            else if(lines!=0 && (str.substring(2,str.length())).equals(deli))
            {
             newNumbers=reader.readLine()+"/";
             if(!(newNumbers.contains(deli)||newNumbers.contains("/")))
                throw new IOException();
            newNumbers=newNumbers.replace(deli,",");
            if(newNumbers.contains(","))
            {
               count++;
            }
            numbers=numbers+newNumbers; 
            lines++;
            }
            else if(lines!=0 && !((str.substring(2,str.length())).equals(deli)))
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
        }catch(IOException e)
        {
            System.err.println("Wrong delimiter");
            return"0,*";
        }
        numbers=numbers.substring(0,numbers.length()-1);
       return numbers;
        
    }
}
