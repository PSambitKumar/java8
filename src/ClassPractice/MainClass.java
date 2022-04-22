package ClassPractice;

public class MainClass {

    public static Arithmatic calculateArithmatic(int a, int b){
        int addition = a + b;
        int Subtraction = a - b;
        int multiplication = a * b;
        int division = a /b;
        return new Arithmatic(addition, Subtraction, multiplication, division);
    }

    public static void main(String[] args) {
        Arithmatic arithmatic = calculateArithmatic(20, 5);
        System.out.println("Arithmatic is : " + arithmatic);
        System.out.println("Addition is : " + arithmatic.getAddition());
        System.out.println("Addition is : "+ arithmatic.addition + ", Subtraction is : " + arithmatic.subtraction + ", Multiplication is : " + arithmatic.multiplication + ", Division is : " + arithmatic.division);
    }
}
