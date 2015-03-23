import java.util.ArrayList;

/**
 * Created by fede on 3/20/15.
 */
public class ArrayLists {



    public static void main(String[] args){
        ArrayList<String> ar = new ArrayList<String>();

        String s1 = "pippo";
        String s2 = "pluto";
        String s3 = "paperino";

        ar.add(s1);
        ar.add(s2);
        ar.add(s3);

        System.out.println("aaa" + ar);

        for (String stringa : ar){
            System.out.println(stringa);
        }

    }
}
