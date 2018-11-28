package com.test;

public class t1
{
    public static void main(String[] args)
    {
        int [] arr = new int[100];
        try
        {
            System.out.println(arr[101]);
        }catch(Exception a)
        {
            //System.out.println(a);
            a.printStackTrace();
        }
    }
}