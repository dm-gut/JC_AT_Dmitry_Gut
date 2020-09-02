package main.java.people;

public class PersonDemo {

    public static void main(String[] args) {

        Man youngOne = new Man();
        youngOne.age = 15;

        Man oldOne = new Man();
        oldOne.age = 85;

        System.out.println("Young person age: " + youngOne.age);
        System.out.println("Old person age: " + oldOne.age);

    }

}
