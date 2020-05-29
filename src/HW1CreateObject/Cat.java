package HW1CreateObject;

import javax.xml.namespace.QName;

public class Cat {
    private String name= "NoName";
    private int age=1;
    private int weight=1;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat() {
    }

    public void sayMeow() {
        System.out.println("May!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name !=null ) {
            this.name = name;
        } else {
            System.out.println("Error! Give a name to the cat!");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Error!! " + "Age cannot be a negative number!");
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight >=0) {
            this.weight = weight;
        } else {
            System.out.println("Error! Weight cannot be a negative number!");
        }
    }
}

