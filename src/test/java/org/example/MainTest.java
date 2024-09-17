package org.example;

import org.junit.Assert;
import org.junit.Test;

import static org.example.Main.isEqu;
import static org.example.Main.validatePasswordCheck;

public class MainTest {
    @Test
    public void CheckSymbolsReturnTrue(){
       /* String password = "ASDzxc123";
        boolean expected = true;

        boolean actual = validatePasswordCheck(password);

        Assert.assertEquals(expected, actual);*/


        // сравнение двух чисел
        Assert.assertTrue(isEqu(8, 8));
        //Assert.assertTrue(true);
    }
}
