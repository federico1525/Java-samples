import java.io.*;

/**
 * Created by fede on 3/7/15.
 */
public class WriteObject {

    public static void main (String[] args){
        System.out.println("Writing objects");

        Person[] people = {new Person(1, "fede"), new Person(2, "pippo"), new Person(7, "joe")};

        try (FileOutputStream fs = new FileOutputStream("people.bin")) {
            // using try resources, also closes automatically 'fs' , like doing fs.close

            ObjectOutputStream os = new ObjectOutputStream(fs);

            os.writeObject(people);

            os.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } ;   // stream data to a file, it sending data sequencially to a file
    }

}
