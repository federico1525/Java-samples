/**
 * Created by fede on 4/8/15.
 */
public class FizzBuzz3 {

    public static void main(String[] args){
        String text;

        for (int i=0; i<100; i++){
            text = "";
            text += (i%3)==0 ? "fizz" : "";
            text += (i%5)==0 ? "buzz" : "";
            text += (text.isEmpty()) ? "non divisibile" : "";
            System.out.println(i + " " + text);
        }
    }
}
