/**
 * Created by fede on 4/8/15.
 */
public class FizzBuzz2 {

    public static void main(String[] args){
        for (int i=0; i< 100; i++){
            if ((i % 2 == 0) && (i%3 == 0)){
                System.out.println(i + " : fizzbuzz");
            }
            else if (i%2 ==0){
                System.out.println(i + " fizz");
            }

            else if (i%3 ==0){
                System.out.println(i + " buzz");
            }
            else {
                System.out.println("non divisibile");
            }
        }
    }
}
