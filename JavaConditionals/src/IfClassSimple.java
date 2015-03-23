import java.util.Scanner;

/**
 * Created by fede on 3/20/15.
 */
public class IfClassSimple {
    public static void main(String[] args){

        Scanner inputNumber = new Scanner(System.in);
        int number;

        System.out.println("Type a number! ");
        number = inputNumber.nextInt();

        if (number == 10){
            System.out.println("Check is 10!!!");
        }
        else if (number == 2){
            System.out.println("Check is 2!!!!");
        }
        else {
            System.out.println("eh niente");
        }
    }
}
