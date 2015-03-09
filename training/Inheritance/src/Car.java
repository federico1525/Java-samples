/**
 * Created by fede on 3/2/15.
 */
public class Car extends Machine{
    public Car(String name) {
        super(name);
    }

    @Override
    public void start() {
            System.out.println("car started : " + name);
    }
}
