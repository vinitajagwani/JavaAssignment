package com.excercise1;
class alphabetPattern{
    public static void main(String []args){
        int i,j;
        int alphabet=65;
        for(i=0;i<5;i++){
            for(j=0;j<=i;j++){
                System.out.print((char)(alphabet+j)+"");
            }
            System.out.println();
        }
      for(i=0;i<5;i++){
            for(j=0;j<=3-i;j++){
                
                System.out.print((char)(alphabet+j)+"");
            }
            System.out.println();
        }
    }
    

}