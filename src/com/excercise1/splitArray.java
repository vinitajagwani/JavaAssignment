package com.excercise1;
import java.util.Scanner;
class splitArray{
    public static void main(String []args){
        int arr[]=new int[20];
        Scanner s=new Scanner(System.in);
        int length,i;
        System.out.println("Enter length of an array:");
        length=s.nextInt();
        System.out.println("Enter elements in an array:");
        for(i=0;i<length;i++)
            arr[i]=s.nextInt();
        int a[]=new int[((length+1)/2)];
        int b[]=new int[length-a.length];
         for(i=0;i<length;i++){
             if(i<a.length)
                a[i]=arr[i];
            else
            b[i-a.length]=arr[i];
         }
         System.out.println("First array:");
          for(i=0;i<a.length;i++){
            System.out.print(a[i]);
          }
          System.out.println();
           System.out.println("Second array:");
        for(i=0;i<b.length;i++){
            System.out.print(b[i]);
          }
    }

}