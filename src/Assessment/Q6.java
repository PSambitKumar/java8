package Assessment;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

class Employee2 {
    int empcode;
    String firstName;
    String lastName;
    String add;
    Long mob;
    String email;


    public int getEmpcode() {
        return empcode;
    }

    public void setEmpcode(int empcode) {
        this.empcode = empcode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public Long getMob() {
        return mob;
    }

    public void setMob(Long mob) {
        this.mob = mob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee2(int empcode, String firstName, String lastName, String add, Long mob, String email) {
        this.empcode = empcode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.add = add;
        this.mob = mob;
        this.email = email;
    }

}

public class Q6 {
    public static void main(String[] args) {

        List<Employee2> list = new ArrayList<>();
        list.add(new Employee2(1, "Sambit", "Pradhan", "BBSR", 7008095918L, "sambit.pradhan@csm.co.in"));
        list.add(new Employee2(2, "Dillip", "Suna", "BBSR", 7008095918L, "sambit.pradhan@csm.co.in"));
        list.add(new Employee2(3, "Nitish", "Nitish", "BBSR", 7008095918L, "sambit.pradhan@csm.co.in"));

        // key = id, value - websites
        Map<Integer, String> result1 = list.stream().collect(
                Collectors.toMap(Employee2::getEmpcode, Employee2::getFirstName));

        System.out.println("Enter Empcode:");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();

        for(Map.Entry<Integer,String> entry : result1.entrySet()){
            if(id == entry.getKey())
                System.out.println("Assessment.Employee Name is: " + entry.getValue());
        }
//        System.out.println("Result: " + result1);

    }
}
