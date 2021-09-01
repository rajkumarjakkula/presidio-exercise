package com.presidio.vaccination;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String temp="";
        int min=0;
        for(int i=0;i<str.length();i++)
        {

            String temp1="";

            temp=str.substring(i,str.length());
            //  System.out.println("temp"+temp);
            for(int k=0;k<temp.length();k++)
            {
                String revstr="";
                temp1=temp1+temp.charAt(k);
              //  System.out.println(temp1+" dsf");
                for(int j=temp1.length()-1;j>=0;j--)
                {
                    revstr=revstr+temp1.charAt(j);
                //     System.out.println(revstr);
                    if(revstr.equals(temp1) && temp1.length()>1){
                        if(revstr.length()>min){
                            min=revstr.length();
                        }
                    }
                }

            }

        }
        System.out.println(min);
    }
}
