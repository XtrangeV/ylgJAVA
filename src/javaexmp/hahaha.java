package com.javaexmp;

import java.util.Scanner;

public class hahaha
{
    public static void main(String []args)
    {
        int i=0;
        Scanner sc = new Scanner(System.in);
        double [] pt = new double[6];
        double [] line = new double[3];
        while(i<6)
        {
            pt[i] = sc.nextDouble();
            i++;
        }
        line[0] = Math.sqrt(Math.pow(pt[2]-pt[0],2)+Math.pow(pt[3]-pt[1],2));
        line[1] = Math.sqrt(Math.pow(pt[4]-pt[2],2)+Math.pow(pt[5]-pt[3],2));
        line[2] = Math.sqrt(Math.pow(pt[0]-pt[4],2)+Math.pow(pt[1]-pt[5],2));
        double s = (line[0]+line[1]+line[2]) / 2;
        double area  = Math.sqrt(s*(s - line[0])*(s-line[1])*(s-line[2]));
        System.out.println(area);
    }
}