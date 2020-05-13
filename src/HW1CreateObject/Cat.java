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
        System.out.println("Мяу!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name !=null ) {
            this.name = name;
        } else {
            System.out.println("Ошибка! У кота должно быть имя!");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Ошибка! Возраст не может быть отрицательным числом!");
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight >=0) {
            this.weight = weight;
        } else {
            System.out.println("Ошибка! Вес не может быть отрицательным числом!");
        }
    }
}

