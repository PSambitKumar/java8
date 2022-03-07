package Assessment;

class Q4 {
    private static Q4 single_instance = null;
    public String name;
    public String mobile;
    public String email;
    public String empcode;
    public String add;

    private Q4()
    {
        name = "Sambit";
        mobile = "7008095918";
        email = "sambit.pradhan@csm.co.in";
        empcode = "Emp001";
        add = "BBSR";

    }

    public static Q4 getInstance()
    {
        if (single_instance == null)
            single_instance = new Q4();

        return single_instance;
    }
}

class Singleton {
    public static void main(String args[])
    {
        Q4 x = Q4.getInstance();
        Q4 y = Q4.getInstance();
        Q4 z = Q4.getInstance();

        System.out.println(x);
        System.out.println("Hashcode of x is "
                + x.hashCode());

        if (x == y && y == z) {
            System.out.println(
                    "Three objects point to the same memory location on the heap i.e, to the same object");
        }
        else {
            System.out.println(
                    "Three objects DO NOT point to the same memory location on the heap");
        }
    }
}
