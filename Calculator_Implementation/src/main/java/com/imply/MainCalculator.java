package com.imply;

import com.SimpleCalculator.Calculator;

public class MainCalculator {

    public static void main(String[] args)
    {
        Calculator obj = new Calculator(1,2,'+');
        obj.getAnswer();
        Calculator obj1 = new Calculator(5,2,'-');
        obj1.getAnswer();
        Calculator obj2 = new Calculator(3,2,'*');
        obj2.getAnswer();
        Calculator obj3 = new Calculator(8,2,'/');
        obj3.getAnswer();
    }
}