/**
 * Created by fede on 3/1/15.
 */
public class Machine implements Info {

    private int id = 7;

    public void start(){
        System.out.println("Machine started");
    }

    @Override
    public void showInfo() {
        System.out.println("Show machine info : " + id);
    }
}
