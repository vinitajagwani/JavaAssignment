package com.pearsoncorelation;
class CorelationCoefficient extends Calculation{
    public static void main(String []args){
        double array1[]={14,16,45,74,89};
        double array2[]={1,2,3,4,5};
        Calculation cal=new Calculation();
        System.out.println("Corelation Coefficient:  "+cal.PearsonCorrelation(array1, array2));
    }
}