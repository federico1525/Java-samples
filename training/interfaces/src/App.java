/**
 * Created by fede on 2/28/15.
 */

public class App {

    public static void main(String[] args) {

        Machine mach1 = new Machine();
        mach1.start();

        Person person1 = new Person("name");
        person1.greet();


        // I can also do this:
        Info info1 = new Machine(); // I can because Machine implements interface Info
        info1.showInfo();

        Info info2 = new Person("Pluto");  // I can because Machine implements interface Info
        info2.showInfo();

//
//Info info3 = new person1; // I should be able to do that according to the examples in the tutorial but....
//        info3.showInfo();

        private static void outputInfo(Info info){
            info.showInfo();
        }
    }

}