package HW2;

public class HW2Task2 {
    public static void main(String[] args) {
        double total = 0;
        Rouse ros1 = new Rouse(36.5, "Rouse", "Red");
        Rouse ros2 = new Rouse(20, "Rouse", "Green");
        Violet vio1 = new Violet(55.56, "Violent", "Yellow");
        Tulip tul1 = new Tulip(43.22,"Tulip","Black");

        System.out.println("The price for your bouquet: "+Flower.totalPrice);
    }

}
 class  Flower{
    double price;
    String name;
    String color;
    static double totalPrice;

}

class Rouse extends Flower{
    Rouse(double price, String name, String color){
        this.price = price;
        this.name = name;
        this.color = color;
        totalPrice += price;
    }
}
class Violet extends Flower{
    Violet(double price, String name, String color){
        this.price = price;
        this.name = name;
        this.color = color;
        totalPrice += price;
    }
}
class Tulip extends Flower{
    Tulip(double price, String name, String color){
        this.price = price;
        this.name = name;
        this.color = color;
        totalPrice += price;
    }
}


