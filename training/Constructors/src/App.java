/**
 * Created by fede on 3/1/15.
 */

public class App {

    public static void main(String[] args) {
        Info person1 = new Person("bob");
        person1.showInfo();

        Info person2 = person1;
        person2.showInfo();

        Info person3 = new Person("Fede");

        outputInfo(person3);
    }

    private static void outputInfo(Info info){
        System.out.println("output shown with outputInfo method");

    }
}
