package q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        try{
            int num3= num1/num2;
            System.out.println("The quotient of " +num1 +" and "+num2 +" is: "+ num3);
        }catch(ArithmeticException e)
        {
            System.out.println("DivideByZeroException caught");
        }
        System.out.println("Inside finally block");

    }
}
