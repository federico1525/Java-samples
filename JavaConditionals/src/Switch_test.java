/**
 * Created by fede on 3/20/15.
 */
public class Switch_test {

    private static class Init {
        int months = 5;
        String name = "Fede";
        String text = "This is a text of the object - same for everyone!";

    }


    public static void main(String[] args){

        Init values = new Init();

        switch (values.months){
            case 1 : values.name = "Fede e' Gennaio!";
                System.out.println(values.name + " && " + values.text);
                break;
            case 2 : values.name = "Fede e' Febbraio!";
                System.out.println(values.name + " && " + values.text);
                break;
            case 3 : values.name = "Fede e' Marzo!";
                System.out.println(values.name + " && " + values.text);
                break;
            case 4 : values.name = "Fede e' Aprile!";
                System.out.println(values.name + " && " + values.text);
                break;
            case 5 : values.name = "Fede e' Maggio!";
                System.out.println(values.name + " && " + values.text);
                break;
            default:
                System.out.println("eeeeeh vabbe");
        }
    }
}
