import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by fede on 3/7/15.
 */
public class ReadObject {
    public static void main(String[] args) {

        try (FileInputStream fi = new FileInputStream("people.bin")) {

            ObjectInputStream os = new ObjectInputStream(fi);

            Person[] people = (Person[]) os.readObject();

            for (Person persona : people) {
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

