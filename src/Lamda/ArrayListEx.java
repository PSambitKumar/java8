package Lamda;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        System.out.println("Enter size of an Arraylist");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        ArrayList<String> arrayList = new ArrayList<String>(size);
//        System.out.println("Enter the names for an ArrayList:");
        for (int x = 0; x < size; x++){
            System.out.println("Enter " + x + " Location Name:");
            String name = scanner.nextLine();
            arrayList.add(name);
        }
        System.out.println("ArrayList contents are: ");
        System.out.println(arrayList);
        arrayList.forEach((n)-> System.out.println(n)
        );
    }
}
