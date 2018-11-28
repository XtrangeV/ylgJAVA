package com.javaexmp;

import java.util.Scanner;
public class tra
{
    double side1 = 1.0,side2 = 1.0,side3 = 1.0;

    class makeatra
    {
        double side1 = 1.0, side2 = 1.0, side3 = 1.0;
        public void makeatra()
        {

        }

        public makeatra(double s1,double s2,double s3)
        {
            this.side1=s1;
            this.side2=s2;
            this.side3=s3;
        }
        public double getside1()
        {
            return side1;
        }
        public double getside2()
        {
            return side2;
        }
        public double getside3()
        {
            return side3;
        }
        public double getArea()
        {
            double s = side1+side2+side3 / 2;
            return (Math.sqrt(s*(s-side1)*(s=side2)-(s*side3)));
        }
        public double getPerimeter()
        {
            return (side1+side2+side3);
        }
        public void tostring()
        {
            System.out.println("Side1 = "+side1);
            System.out.println("Side2 = "+side2);
            System.out.println("Side3 = "+side2);
            System.out.println("Perimeter = "+getPerimeter());
            System.out.println("Area = "+getArea());
        }

    }
    }
