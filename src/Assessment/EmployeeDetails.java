package Assessment;

public class EmployeeDetails {
    String firstName;
    String lastName;
    String add;
    Long mob;
    String email;
    Long salary;

    @Override
    public String toString() {
        return "Assessment.EmployeeDetails{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", add='" + add + '\'' +
                ", mob=" + mob +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
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

    public String printSalary(Long salary){
        this.salary = salary;
        return "Salary of the Assessment.Employee is: " + salary;
    }
}
