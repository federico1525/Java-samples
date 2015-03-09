/**
 * Created by fede on 3/2/15.
 */
public class Machine {
    String name;

    public Machine(String name) {
        this.name = name;
    }

    public void start(){
        System.out.println("Machine started : " + name);
    }
}
