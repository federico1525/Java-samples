/**
 * Created by fede on 3/20/15.
 */
public class ForSimple {

    public static void main(String[] args) {

        int[] foobar = new int[] {1,2,3,4,5,6};
        for(int numero: foobar){
            System.out.println("going through the int array! " + numero);
        }


        String[] pippo = new String[5];
        for (String stringa : pippo){
            stringa = "questa e' una stringa ";
            stringa = stringa.toUpperCase();
            System.out.println(stringa);
        }


        for (int i = 0; i < 10; i++) {
            System.out.println("Hello! " + i);
        }
    }
}
