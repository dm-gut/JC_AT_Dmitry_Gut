package main.java.people;

public class Demo {

    public static void main(String[] args) {

        String type = Man.ANIMAL_TYPE;

        Man myMan = new Man();
        Man myMan2 = new Man(33);
        Man myMan3 = new Man(23);

        int x = myMan.getAge();
        myMan.setAge(22);
    }
}
