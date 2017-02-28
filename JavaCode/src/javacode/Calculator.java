/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacode;

/**
 *
 * @author Mohd
 */
public class Calculator {
    int sum=0;
    public int Add(String number)
    {
        if(number.isEmpty())
            return sum;
        if(number.contains(","))
        {
            String parts[]=number.split(",");
            if(parts.length>2)
            {
                return 3030;//as it is invalid number
            }
            for(int i=0;i<2;i++)
            {
                sum+=Integer.parseInt(parts[i]);
            }
            return sum;

        }
        else
        {
            sum=Integer.parseInt(number);
            return sum;
        }
        
        
    }
}
