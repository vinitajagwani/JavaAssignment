package com.excercise1;
import java.io.IOException;
import java.util.Scanner;
class DivideByZero extends Exception{
    
    DivideByZero(String s){
        super(s);
    }

}

class customException{

    public static void main(String [] args){

        int no1,no2;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter numerator");
        no1=s.nextInt();
         System.out.println("Enter denominator");
        no2=s.nextInt();
        try{
        if(no2==0)
            throw new DivideByZero("Denominator cannot be zero");
             else{
                 int res=no1/no2;
                 System.out.println(res);
            }
        }
       
             catch (DivideByZero ex) 
        { 
            System.out.println("Exception Caught"); 
  
            
            System.out.println(ex.getMessage()); 
        } 

    }


}