package Assessment;

class Employee3 extends EmployeeDetails{
    String specialization;
    String dept;

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}

class Manager extends EmployeeDetails{
    String specialization;
    String dept;

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}

public class Q7 {
    public static void main(String[] args) {

        Employee3 employee3 = new Employee3();
        employee3.setFirstName("Sambit");
        employee3.setLastName("Pradhan");
        employee3.setAdd("BBSR");
        employee3.setEmail("name@email.com");
        employee3.setMob(7008095918L);
        employee3.setDept("BSS");
        employee3.setSalary(15000L);
        employee3.setSpecialization("JAVA");
        System.out.println("Details of Assessment.Employee:");
        System.out.println("Assessment.Employee Name is "+ employee3.getFirstName()+employee3.getLastName() +
                ", Address " + employee3.getAdd() +
                ", Email" + employee3.getEmail() +
                ", Department "+ employee3.getDept() +
                ", Specialization "+ employee3.getSpecialization() +
                ", Salary" + employee3.getSalary());

        Manager manager = new Manager();
        manager.setFirstName("Dilip");
        manager.setLastName("Suna");
        manager.setAdd("BBSR");
        manager.setEmail("name@email.com");
        manager.setMob(7008095918L);
        manager.setDept("BSS");
        manager.setSalary(30000L);
        manager.setSpecialization("JAVA");
        System.out.println("Details of Manger:");
        System.out.println("Manger Name is "+ manager.getFirstName()+manager.getLastName() +
                ", Address " + manager.getAdd() +
                ", Email" + manager.getEmail() +
                ", Department "+ manager.getDept() +
                ", Specialization "+ manager.getSpecialization() +
                ", Salary" + manager.getSalary());
    }
}
