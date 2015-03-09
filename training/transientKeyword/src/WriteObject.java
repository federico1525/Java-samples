import java.io.*;

public class WriteObject {

    public static void main (String[] args){
        System.out.println("Writing objects");


        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("people.bin")) ) {
            // using try resources, also closes automatically 'fs' , like doing fs.close

            Person fede = new Person (543, "federico");
            Person.setCount(88); // setCount is static and common to all Person type of objects

            os.writeObject(fede);

            os.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } ;   // stream data to a file, it sending data sequencially to a file
    }

}
