package com.test;
import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class t2
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        File file = new File("E:\\Exercise9_19.txt");
        try
        {
            OutputStream out = new FileOutputStream("E:\\Exercise9_19.txt");
            for (int i = 0; i < 10; i++)
            {
                out.write(rand.nextInt());
            }
            out.close();
        }catch(Exception a)
        {
            a.printStackTrace();
        }
        try
        {
            InputStream in = new FileInputStream("E:\\Exercise9_19.txt");
            int [] arr = new int [10];
            for(int i=0;i<10;i++)
            {
                arr[i]=(int) in.read();
            }
            Arrays.sort(arr);
            for(int i=0;i<10;i++)
            {
                System.out.print(arr[i]+" ");
            }
            in.close();
        }catch(Exception b)
        {
            b.printStackTrace();
        }
    }
}
