/**
 * Created by fede on 3/20/15.
 */
public class ifCycle {

    //creating the array
    String arrayTest[] = new String[] {"one", "two", "three"};

    public void cycleArray(){
        for (String stringa: arrayTest){
            if (stringa == "two"){
                System.out.println("string due!");
            }
            else if (stringa == "three"){
                System.out.println("string tre!");
            }
            else {
                System.out.println("no string found");
            }
        }
    }

    public static void main(String[] args){
        ifCycle ifTest = new ifCycle();
        ifTest.cycleArray();
    }

};

