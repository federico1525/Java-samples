public class Main {

    public static void main(String[] args) {
	// write your code here
        Machine mach1 = new Machine(7, "pippo");
        mach1.start();
        mach1.showSerial();

        Car car1 = new Car(3, "500 abarth");
        car1.start();
        car1.showSerial();
        car1.Info();
    }
}
