package com.pearsoncorelation;
import java.util.Scanner;
import java.util.Arrays;
public class Calculation{
    public double sumOfArray(double[] array){
        double sum=0;
        for(double arrays: array)
            sum=sum+arrays;
        return sum;
    }
    public double meanOfArray(double [] array){
        return (sumOfArray(array))/array.length;
    }
    public double[] deviation(double [] array){
        double temp[]=new double[array.length];
        for(int index=0;index<array.length;index++)
            temp[index]=array[index]-meanOfArray(array);
            return temp;
    }       
     public double[] deviationSquared(double []array){
        double temp1[]=new double[array.length];
        temp1=deviation(array);
        for(int index=0;index<temp1.length;index++)
            temp1[index] =  Math.pow(temp1[index], 2);
        return temp1;
     }
     public double[] productOfArray(double []array1,double []array2){
         double[] product=new double[array1.length];
         for(int index=0;index<array1.length;index++)
            product[index] = array1[index]*array2[index];
        return product;
     }
     public double squareRoot(double number){
         double sqrRoot=Math.sqrt(number);
         return sqrRoot;
     }
     public double division(double number1,double number2){
         double divisionOfNumbers=number1/number2;
         return divisionOfNumbers;
     }
     public double PearsonCorrelation(double[] array1,double[] array2)
     {
         double sumOfproductOfArray=sumOfArray(productOfArray(deviation(array1),deviation(array2)));
         double SquarerootOfSumOfDeviationSquared=squareRoot(sumOfArray(deviationSquared(array1))*sumOfArray(deviationSquared(array2)));
         double correlationCoefficient=division(sumOfproductOfArray, SquarerootOfSumOfDeviationSquared);
         return correlationCoefficient;
     }
}