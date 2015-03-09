/**
 * Created by fede on 3/1/15.
 */
public enum Animal {
    CAT("tom", 5), DOG("spike", 6), MOUSE("jerry", 2);

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public String toString(){   // here i'm kinda ovveriding toString() method
        String text = "### \n Overridden toString method - \n" + "this animal is called " + name + "and is : " + age + " years old \n###";
//        return ("this animal is called " + name + "and is : " + age + " years old");
        return (text);
    }
}


