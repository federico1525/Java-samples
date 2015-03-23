import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double[] values = { 0.1, 5.2, 5.3, 6.3, 83.3 };

        for(int i=0; i < values.length; i++) {
            System.out.printf("%.2f ", (values[i]));
        }
    }

}