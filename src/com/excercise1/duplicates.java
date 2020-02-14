package com.excercise1;
import java.util.Scanner;
import java.util.Arrays;
//import javax.xml.transform.Templates;

 class duplicates{
    public static void main(String []args){
        int length,i,j,k,count=0;
       
        //System.out.println("Hello World");
        
       // Scanner s=new Scanner(System.in);
       
        int arr[]={42,32,25,43,22,42,25};
        // System.out.println("Enter length of array:");
        length=arr.length;
        // length=s.nextInt();
        
        
        //System.out.println(length);
        i=0;
        j=i+1;
        k=0;
        // System.out.println("Enter elements of array");
        
        // for(i=0;i<length;i++)

        //         arr[i]=s.nextInt();
                
        // for(i=0;i<length;i++)
        //     System.out.println(arr[i]);
        Arrays.sort(arr);
        int arr1[]=new int[length+1];
        while(j!=length){
            if(arr[i]==arr[j]){
                i++;
                j++;
            }
            else{
                arr1[k]=arr[i];
                i++;
                j++;
                k++;
                count++;
            }
        }
        for(k=0;k<count;k++){
            System.out.println(arr1[k]+" ");
        }
        System.out.println(arr[length-1]);
    }
}