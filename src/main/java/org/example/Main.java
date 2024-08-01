package org.example;

import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;
import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");

        System.out.println(car.startEngine());

        System.out.println(car.accelerate());

        System.out.println(car.brake());

        System.out.println("---------------------------------");

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

        System.out.println(mitsubishi.startEngine());

        System.out.println(mitsubishi.accelerate());

        System.out.println(mitsubishi.brake());

        System.out.println("---------------------------------");

        Car ford = new Ford(6, "Ford Falcon");

        System.out.println(ford.startEngine());

        System.out.println(ford.accelerate());

        System.out.println(ford.brake());

        System.out.println("---------------------------------");

        Car holden = new Holden(6, "Holden Commodore");

        System.out.println(holden.startEngine());

        System.out.println(holden.accelerate());

        System.out.println(holden.brake());

        System.out.println("---------------------------------");

        CarSkeleton newCar = new GasPoweredCar("Murat131", "Yeni nesil türk arabası.", 2.2, 6);

        newCar.startEngine();

        System.out.println(newCar.toString());

        System.out.println("---------------------------------");

        CarSkeleton electronic = new ElectricCar("Raijin", "Yıldırım gibi!", 5, 200000);

        electronic.startEngine();

        System.out.println(electronic.toString());

        System.out.println("---------------------------------");

        CarSkeleton hybrid = new HybridCar("Yunus", "Yunus gibi bi orada bi burada!", 2.5, 150000, 4);

        hybrid.startEngine();

        System.out.println(hybrid.toString());

        System.out.println("---------------------------------");
    }
}