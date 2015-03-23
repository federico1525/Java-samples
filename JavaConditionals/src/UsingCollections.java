import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by fede on 3/20/15.
 */
public class UsingCollections {

    public static void main(String[] args){
        List<String> listString = new ArrayList<String>();
        String name = "nome di una stringa";


        for(int i=0;i<5;i++){
            String stringa = name + " " + (i+1);
            listString.add(stringa);
        }


        for(String stringa : listString){
            System.out.println(stringa + " - place in list: " + listString.indexOf(stringa));
        }

        // at the end , empty everything
        if (!listString.isEmpty()){
            listString = Collections.EMPTY_LIST;
            System.out.println("ListString is now empty: " + listString);
        }

        System.out.println("You are now ready to add something manually:");
    }
}
