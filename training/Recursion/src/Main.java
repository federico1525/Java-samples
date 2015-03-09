public class Main {

    public static void main(String[] args) {
        int values = 10;

        System.out.println(factorial(15));
    }

    private static int factorial(int values) {

        System.out.println("values : " + values);

        if (values == 0) {
            return 1;
        }
        return factorial(values -1) * values;  // invoco factorial di nuovo passandogli un valore di values a meno uno.
    }
};