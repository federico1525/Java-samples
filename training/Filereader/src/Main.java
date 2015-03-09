import java.io.*;

public class Main {

    private static String linea (String linea){
        File file = new File("test.txt");

        try (FileReader fr = new FileReader(file)) {

            BufferedReader br = new BufferedReader(fr);



//            while ((line = br.readLine()) != null){
//                System.out.println(line);
//            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    };


    public static void main(String[] args) {
//        File file = new File("test.txt");
//
//        try (FileReader fr = new FileReader(file)) {
//
//            BufferedReader br = new BufferedReader(fr);
//
//            String line;
//
////            while ((line = br.readLine()) != null){
////                System.out.println(line);
////            }
//
//
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
