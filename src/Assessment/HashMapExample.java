package Assessment;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an HasMap ?");
        int size  = scanner.nextInt();
        HashMap<Integer, String> hashMap = new HashMap<>(size);

        if(hashMap.isEmpty()){
            for(int x = 1 ; x <= size; x ++){
                System.out.println("Enter name of the Employee ?");
                String name = scanner.nextLine();
                hashMap.put(x, name);
            }
        }
        else
            System.out.println("HashMap is Not Empty!!");
        System.out.println(hashMap);

        if(hashMap.containsKey(2)){
            System.out.println(hashMap.get(2));
        }
        else
            System.out.println("Doesnot Contains Key!!");
        System.out.printf("Removing of key 1....", hashMap.remove(1));
        System.out.println(hashMap);
    }
}
