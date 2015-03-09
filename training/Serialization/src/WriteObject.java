import java.io.*;

/**
 * Created by fede on 3/7/15.
 */
public class WriteObject {

    public static void main (String[] args){
        System.out.println("Writing objects");

        Person fede = new Person (543, "federico");
        Person pippo = new Person (654, "pippo");

        System.out.println("fede");
        System.out.println("pippo");

        try (FileOutputStream fs = new FileOutputStream("people.bin")) {
            // using try resources, also closes automatically 'fs' , like doing fs.close

            ObjectOutputStream os = new ObjectOutputStream(fs);

            os.writeObject(fede);
            os.writeObject(pippo);

            os.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } ;   // stream data to a file, it sending data sequencially to a file
    }

}
