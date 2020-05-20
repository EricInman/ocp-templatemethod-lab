package lab.assignment.afterrefactoring.clientcode;

import lab.assignment.afterrefactoring.CoffeeTemplate;
import lab.assignment.afterrefactoring.MochaCoffee;
import lab.assignment.afterrefactoring.CapuccinoCoffee;
import lab.assignment.afterrefactoring.AmericanoCoffee;

public class CoffeeClient {

    public static void main(String[] args) {
        CoffeeTemplate houseType = new MochaCoffee();

        //using template method
        houseType.prepareCoffee();
        System.out.println("************");

        houseType = new CapuccinoCoffee();
        houseType.prepareCoffee();

        System.out.println("************");

        houseType = new AmericanoCoffee();
        houseType.prepareCoffee();
    }
}