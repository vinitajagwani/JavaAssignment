package com.excercise1;
import java.util.Scanner;
class Palindrome{
    static boolean isPalindrome(String str){
        int i=0,j;
        j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j))
               return false;
           

            i++;
            j--;
        }
        //System.out.println(str+" is palindrome");
        return true;
    }
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        String str;
        System.out.println("Enter string:");
        str=s.nextLine();
        if(isPalindrome(str))
            System.out.println(str+" is palindrome");
        else
            System.out.println(str+" is not palindrome");
    }

}