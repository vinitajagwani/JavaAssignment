package com.excercise1;
import java.util.Scanner;

class multiples{
    public static void main(String [] args){

        int i,length;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter length of an array:");
        length=s.nextInt();
        int arr[]=new int[20];
        int arr1[]=new int[20];
        
        System.out.println("Enter elements in array:");

        for(i=0;i<length;i++)
                arr[i]=s.nextInt();
        System.out.println("Multiples of 3, 5 or 7 are :");

        for(i=0;i<length;i++){
            if(!(arr[i] % 3==0 || arr[i] % 5 ==0 || arr[i] % 7 ==0))
                    return;
            arr1[i]=arr[i];
            
            System.out.print(arr1[i]+"\t");
        }
        // for(i=0;i<length;i++)
        //     System.out.println(arr1[i]);
    }   



}