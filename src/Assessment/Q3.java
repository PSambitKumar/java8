package Assessment;

import java.util.Scanner;

class InvalidException  extends Exception
{
    public InvalidException (String str)
    {
        super(str);
    }
}



public class Q3
{
    static void validateName (String name) throws InvalidException{
        if(name == ""){
            throw new InvalidException("Name Must Not Empty!!");
        }
        else {
            System.out.println("Welcome" + name);
        }
    }


    static void validateAdd (String add) throws InvalidException{
        if(add == ""){
            throw new InvalidException("Address Must Not Empty!!");
        }
        else {
            System.out.println(add + "Validated");
        }
    }

    static void validateMob (String mob) throws InvalidException{
        if(mob == ""  || mob.length() != 10 || mob == null){
            throw new InvalidException("Mobile Number Must Not Empty and Must be 10 Digits!!");
        }
        else {
            System.out.println(mob + "Validated");
        }
    }

    static void validateEmpCode (String empCode) throws InvalidException{
        if(empCode == ""  || empCode == null){
            throw new InvalidException("Mobile Number Must Not Empty and Must be 10 Digits!!");
        }
        else {
            System.out.println(empCode + "Validated");
        }
    }

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        try
        {
            System.out.println("Enter Assessment.Employee Name:");
            String name = scanner.nextLine();
            validateName(name);

            System.out.println("Enter Address:");
            String add = scanner.nextLine();
            validateAdd(add);

            System.out.println("Enter Mobile Number:");
            String mob = scanner.next();
            validateMob(mob);

            System.out.println("Enter Assessment.Employee Code:");
            String empCode = scanner.nextLine();
            validateEmpCode(empCode);


        }
        catch (InvalidException e)
        {
            System.out.println(e);
        }
    }
}