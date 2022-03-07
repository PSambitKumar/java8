package Lamda;

@FunctionalInterface
interface areaOfTriangle {
    public void area();
}

public class Example1 {
    public static void main(String[] args) {
        int base = 10;
        int height = 12;

        areaOfTriangle areaOfTriangle = ()->{
            System.out.println("Area of the triangle is: " + (base * height)/2);
        };
        areaOfTriangle.area();
    }
}
