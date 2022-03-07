package Lamda;

import java.util.Scanner;

@FunctionalInterface
interface printName{
    public String print();
}

public class Example2 {
    public static void main(String[] args) {
        System.out.println("Enter Your Name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        printName printName = ()->{
            return "Hello " + name + " Welcome To CSM Technologies.";
        };
        System.out.println(printName.print());
    }
}
