package main.java.schildt.vehicle;

class VehConsDemo {
    public static void main(String[] args) {

        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportcar = new Vehicle(2, 14, 12);
        double gallons;
        int dist = 252;

        gallons = minivan.fuelneeded(dist);

        System.out.println("Для преодоления " + dist + " миль мини-фургону требуется " + gallons + " галлонов топлива");

        gallons = sportcar.fuelneeded(dist);
        System.out.println("Для преодоления " + dist + " миль сспортивному автомобилю требуется " + gallons + " галлонов топлива");
    }
}
