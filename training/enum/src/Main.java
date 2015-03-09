public class Main {


    public static void main(String[] args) {

        Animal animal = Animal.DOG;


        switch(animal){
            case DOG:
                System.out.println("Dog");
                System.out.println(Animal.DOG);
                break;
            case CAT:
                System.out.println("Cat");
                break;
            default:
                break;
        }


        System.out.println(Animal.DOG);
        System.out.println("Enum name as a string is: " + Animal.DOG.name());
        System.out.println(Animal.DOG.getClass());

        System.out.println(Animal.DOG instanceof Animal);
        System.out.println(Animal.DOG instanceof Enum);

    }
}
