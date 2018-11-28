package com.javaexmp;

import java.util.Scanner;

public class lalala
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        long cardid = sc.nextLong();
        int a = (int)Math.floor(cardid / Math.pow(10,(((cardid+"").length())-1)));
        int b = (int)Math.floor(cardid / Math.pow(10,(((cardid+"").length())-2)));
        String id = cardid+"";
        int len = ((cardid+"").length());
        boolean stat =false;
        switch(a)
        {
            case 4:
                stat =true;
                break;
            case 5:
                stat =true;
                break;
            case 6:
                stat =true;
                break;
            case 3:
                if(b == 37)
                {
                    stat =true;
                }
                default:
                    stat =false;
        }
        int sum=0,obigsum=0,jsum=0;
        char[] idid = id.toCharArray();
        if((int)((cardid+"").length()) % 2 == 0)
        {
            for(int i=len-1;i>0;i-=2)
            {
                if((int)idid[i] * 2 >9)
                {
                    sum = idid[i]*2/10 + idid[i]*2%10;
                    obigsum+=sum;
                }

            }
        }
        else if((int)((cardid+"").length()) % 2 == 1)
        {
            for(int i=len-1;i>0;i-=2)
            {
                if((int)idid[i] * 2 >9)
                {
                    sum = idid[i]*2/10 + idid[i]*2%10;
                    obigsum+=sum;
                }
            }
        }
        if((int)((cardid+"").length()) % 2 == 0)
        {
            for(int i=len-2;i>=0;i-=2)
            {
                jsum+=idid[i];
            }
        }
        else if ((int)((cardid+"").length()) % 2 == 1)
        {
            for(int i=len-1;i>=0;i-=2)
            {
                jsum+=idid[i];
            }
        }
        if(jsum+sum % 10 ==0)
        {
            stat =true;
        }
        else
        {
            stat =false;
        }
        if(stat)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}