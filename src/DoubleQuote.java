@FunctionalInterface
interface printData{
    void printData();
}
public class DoubleQuote {
    static void data(){
        System.out.println("Hello, Welcome to CSM.");
    }
}
class mainMethod{
    public static void main(String[] args) {
        printData print = DoubleQuote::data;
        print.printData();
    }
}
