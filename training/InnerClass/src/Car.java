/**
 * Created by fede on 3/2/15.
 */
public class Car extends Machine {

    @Override
    public void start() {
        System.out.println("Car started");
    }

    public Car(int id, String seriale) {
        super(id, seriale);
    }
}
