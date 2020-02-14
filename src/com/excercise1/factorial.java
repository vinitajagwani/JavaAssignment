package com.excercise1;
import java.util.Scanner;
class factorial{
    public static void main(String []args){
        int i=1,no,fact=1;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number:");
        no=s.nextInt();
        while(i<=no){
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial of "+no+ " is "+fact);

        
    }

}