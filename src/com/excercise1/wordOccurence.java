package com.excercise1;
import java.util.Scanner;

class wordOccurence{
    static int occurence(String str,String word){
        int i;
        int count=0;
        String temp[]=str.split("");

        for(i=0;i<temp.length;i++){
            if(word.equals(temp[i]))
                count++;
        }
        return count;

    }
    public static void main(String []args){

            Scanner s = new Scanner(System.in);
            String str = "";
            String word="";

            System.out.println("Enter the string:");
            str= s.nextLine();
           // System.out.println(str);

            System.out.println("Enter the word to search:");
            word=s.next();
            
            int occur=occurence(str,word);
            System.out.println("Number of occurence of " +word+"  in a given string is  "+occur);
             

    }
}