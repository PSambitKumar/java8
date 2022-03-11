package Lamda;

import java.util.Scanner;

interface add{
    int addMethod(int a, int b);
}
interface average{
    int averageMethod(int a, int b, add addObj);
}

public class Example3 {
    static add addObj1;
    public static void main(String[] args) {
        System.out.println("Enter First Number?");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Enter Second Number?");
        int y = scanner.nextInt();

        addObj1 = (a, b)->{
          return a+b;
        };
        System.out.println("Addition of the two numbers are " + addObj1.addMethod(x, y));

        average averageObj = (a, b, addObj)->{
            int addValue = addObj1.addMethod(x,y);
              return addValue/2;
            };
        System.out.println("Average of these two numbers are: " + averageObj.averageMethod(x,y, addObj1));
    }
}
