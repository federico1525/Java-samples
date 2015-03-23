/**
 * Created by fede on 3/20/15.
 */
public class DoWhileTest {

    private int[] setUp() {
        int numberList[] = new int[]{1, 2, 3, 4, 5};
        return numberList;
    }

    public static void main(String[] args){
        DoWhileTest test = new DoWhileTest();
        int[] arrayNumerato = test.setUp();

        int i = 0;
//        while (i < arrayNumerato.length){
//            System.out.println("yeaaaah " + arrayNumerato[i]);
//            i++;
//        }

        do {
            System.out.println("yeaaah " + arrayNumerato[i]);
            i++;
        } while (i<arrayNumerato.length);
    }
}
