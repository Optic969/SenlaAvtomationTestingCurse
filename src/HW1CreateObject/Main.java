package HW1CreateObject;

public class Main {

    public static void main(String[] args) {

        Cat barsik = new Cat("Barsik ",2,44 );
        String barsikName = barsik.getName();
        int barsikAge = barsik.getAge();
        int barsikWeight = barsik.getWeight();

        Cat murka = new Cat("Murka", 5, -6);
        String murkaName = murka.getName();
        int murkaAge = murka.getAge();
        int murkaWeight = murka.getWeight();

        Dog1 d = new Dog1();
        d.voice();

        System.out.println();

        System.out.println("Cat name: " + barsikName);
        System.out.println("Cat age: " + barsikAge);
        System.out.println("Cat weight: " + barsikWeight);

        System.out.println();

        System.out.println("Cat name: " + murkaName);
        System.out.println("Cat age: " + murkaAge);
        System.out.println("Cat weight: " + murkaWeight);
    }
}