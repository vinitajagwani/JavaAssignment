package com.excercise1;
import java.io.*;
import java.io.IOException;
class readWrite{
    public static void main(String []args){
        try{
        File f1=new File("C:\\Users\\vinita.jagwani\\Desktop\\file1.txt");
        File f2=new File("C:\\Users\\vinita.jagwani\\Desktop\\file2.txt");
        FileInputStream fin=new FileInputStream(f1);
        FileOutputStream fout=new FileOutputStream(f2);
        String data=null;
        byte buffer[]=new byte[1024];
        int length;
        while((length=fin.read(buffer))>0){
            fout.write(buffer);
        }
        }
        catch(Exception e){}
    }


}