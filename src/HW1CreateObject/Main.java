package HW1CreateObject;

public class Main {

    public static void main(String[] args) {

        Cat barsik = new Cat("Барсик", -77, 4);
        String barsikName = barsik.getName();
        int barsikAge = barsik.getAge();
        int barsikWeight = barsik.getWeight();

        Cat murka = new Cat("Муркаа", 5, -6);
        String murkaName = murka.getName();
        int murkaAge = murka.getAge();
        int murkaWeight = murka.getWeight();

        Dobermann d = new Dobermann();
        d.voice();

        System.out.println();

        System.out.println("Имя кота: " + barsikName);
        System.out.println("Возраст кота: " + barsikAge);
        System.out.println("Вес кота: " + barsikWeight);

        System.out.println();

        System.out.println("Имя кота: " + murkaName);
        System.out.println("Возраст кота: " + murkaAge);
        System.out.println("Вес кота: " + murkaWeight);
    }
}