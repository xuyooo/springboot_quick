package com.demo.utils;

public class Calc implements CalcImp {
    public int add(int x, int y)
    {
        return(x+y);
    }
    public int sub(int x, int y)
    {
        if (x==0)
            return (x+y);
        else
            return (x-y);
    }
}
