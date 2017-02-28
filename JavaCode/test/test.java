/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javacode.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mohd
 */


 
public class test {
    Calculator c=new Calculator();
    @Test(expected = RuntimeException.class)
    public final void whenMoreThanTwo() {
        c.Add("1,2,3");
    }
    @Test
    public final void when2NumbersAreUsedThenNoExceptionIsThrown() {
        c.Add("1,2");
        Assert.assertTrue(true);
    }
    
    @Test
    public final void whenEmptyString() {
    Assert.assertEquals(0, c.Add(""));
    }
    @Test
    public final void whenOneNumberIsUsed() {
        Assert.assertEquals(3, c.Add("3"));
    }

    @Test
    public final void whenTwoNumbersAreUsed() {
        Assert.assertEquals(3+6, c.Add("3,6"));
    }
    @Test
    public final void whenAnyNumberOfNumbersIsUsed() {
        Assert.assertEquals(3+6+15+18+46+33, c.Add("3,6,15,18,46,33"));
    }
    @Test
    public final void whenNewLineIsUsed() {
        Assert.assertEquals(3+6+15, c.Add("3,6n15"));
    }
    
    
    
    @Test
    public final void whenOneOrMoreNumbersAreGreaterThan1000IsUsed() {
    Assert.assertEquals(3+1000+6, c.Add("3,1000,1001,6,1234"));
  }
}