import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by fede on 3/7/15.
 */
public class ReadObject {
    public static void main(String[] args) {

        try (FileInputStream fi = new FileInputStream("people.bin")) {

            ObjectInputStream os = new ObjectInputStream(fi);

            Person[] people = (Person[]) os.readObject();

            ArrayList<Person> peopleList = (ArrayList<Person>) os.readObject();
            // type erasure - the information on the type of this ArrayList<Person> is lost when de-serializing the ArrayList


            for (Person persona : people) {
                System.out.println(persona);
            }

            for (Person persona : peopleList) {
                System.out.println(persona);
            }

// what a way to write it...  I can also do:
//            for (int i = 0; i<people.length; i++){
//                System.out.println("####" + people[i]);
//            }


            os.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        ;


    }
}

