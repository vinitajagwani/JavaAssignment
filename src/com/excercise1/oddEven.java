package com.excercise1;
import java.util.Scanner;
class oddEven{
    static void numbers(int no){
        if(no%2==0)
            System.out.println(no+" is Even");
        else
            System.out.println(no+ " is Odd");
    }
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int no;
        System.out.println("Enter number");
       // no = s.nextInt();

        //check the input 
        if(s.hasNextInt()) {
            no = s.nextInt();
            numbers(no);
        }
        else 
            System.out.println("Invalid Input");
        
    }

}