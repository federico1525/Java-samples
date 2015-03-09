import java.io.Serializable;

public class Person implements Serializable{

    private transient int id;  // just to prevent things to being serialized
    private String name;

    private static int count;


    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }


    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}' + " / Count is: " + count;  // Count will be 0 and is not going to be serialized as the same for all the obejcts
    }
}
