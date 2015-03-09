import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {

        try ( ObjectInputStream os = new ObjectInputStream(new FileInputStream("people.bin"))) {


            Person person1 = (Person) os.readObject();

            os.close();

            System.out.println(person1);

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

