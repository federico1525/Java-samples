/**
 * Created by fede on 3/1/15.
 */
public class Person implements Info {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.println("person name is: " + name);
    }
}
