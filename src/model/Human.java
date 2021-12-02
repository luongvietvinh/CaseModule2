package model;

import java.io.Serializable;

public class Human implements Serializable {
    private int id;
    private String name;
    private int age;
    private int numberCMT;
    public static int idNumber = 1;

    public Human() {
    }

    public Human( String name, int age, int numberCMT) {
        this.id = idNumber++;
        this.name = name;
        this.age = age;
        this.numberCMT = numberCMT;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberCMT() {
        return numberCMT;
    }

    public void setNumberCMT(int numberCMT) {
        this.numberCMT = numberCMT;
    }

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", numberCMT=" + numberCMT +
                '}';
    }
}
