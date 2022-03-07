package Assessment;

final class Employee
{
    final String firstName;
    final String lastName;
    final String email;
    final int age;
    final Long mob;


    public Employee(String firstName, String lastName, String email, Long mob, int age)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.age=age;
        this.mob=mob;
    }

    @Override
    public String toString() {
        return "Assessment.Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", mob=" + mob +
                '}';
    }
}
class Q1
{
    public static void main(String args[])
    {
        Employee e = new Employee("Sambit", "Pradhan", "sambit.pradhan@csm.co.in", 7008095918L, 24);
        System.out.println(e);
    }
}  