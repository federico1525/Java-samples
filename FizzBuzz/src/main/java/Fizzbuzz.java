/**
 * Created by fede on 4/8/15.
 */
public class Fizzbuzz {

    public static void main(String[] args) {

        int number = 100;
        StringBuilder result = new StringBuilder();
        result.setLength(0);

        for (int i = 0; i < number; i++) {
            if (i % 2 == 0) {
                result.append("fizz");
            }
            if (i % 3 == 0) {
                result.append("buzz");
            }

            if (!result.toString().isEmpty()){
                System.out.println("###: "+ i + " " + result);
                result.setLength(0);
            }
            else {
                System.out.println("non disvisibile");
            }



        }


    }
}
