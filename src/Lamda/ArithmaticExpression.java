package Lamda;

import java.util.Scanner;

interface Arithmatic{
    public int opeartion (int a, int b);
}

public class ArithmaticExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Numer: ");
        int x = scanner.nextInt();
        System.out.println("Enter Second Number: ");
        int y = scanner.nextInt();

//        For Addition
        Arithmatic arithmatic = (a, b)->{
            return a+b;
        };
        System.out.println("Addition of of these numbers are: " + arithmatic.opeartion(x,y));

//        For Multiplication
        Arithmatic arithmatic1 = (int a, int b)->{
          return a*b;
        };
        System.out.println("Multiplication of these two numbers are: " + arithmatic1.opeartion(x,y));

        //    For Substraction
        Arithmatic arithmatic2 = (a, b)-> {
            return a-b;
        };
        System.out.println("Substraction of these thwo numbers are: " + arithmatic2.opeartion(x,y));
    }
}
