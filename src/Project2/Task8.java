package Project2;

/*
Create a Class Car that would have the following fields: carPrice and
color and method calculateSalePrice() which should be returning a
price of the car.
Create 2 subclasses: Sedan and Truck. The Truck class has a field
as weight and has its own implementation of calculateSalePrice()
method in which returned price is calculated as following: if
weight>2000 then returned price car should include 10% discount,
otherwise 20% discount.
The Sedan class has field as length and also does it its own
implementation of calculateSalePrice(): if length of sedan is >20 feet
then returned car price should include 5% discount, otherwise 10%
discount
 */
public class Task8 {
    String color;
    double carPrice;

    public Task8(String color, double carPrice) {
        this.carPrice = carPrice;
        this.color = color;
    }

    double calculateSalePrice() {
        return carPrice;
    }
}

class Sedan extends Task8 {
    double length;

    public Sedan(String color, double carPrice, double length) {
        super(color, carPrice);
        this.length = length;
    }

    @Override
    double calculateSalePrice() {
        if (length > 20) {
            return carPrice- (carPrice * 0.05);
        } else {
            return carPrice-(carPrice * 0.1);
        }
    }
}

class Truck extends Task8 {
    double weight;
    public Truck(String color, double carPrice, double weight) {
        super(color, carPrice);
        this.weight = weight;
    }
    @Override
    double calculateSalePrice() {
        if (weight > 2000) {
            return carPrice-(carPrice * 0.1);
        } else {
            return carPrice-(carPrice * 0.2);
        }
    }
}
class CarTester {
    public static void main(String[] args) {

        Task8 cars[] = {new Truck("Black",20000.0, 2500), new Sedan("White", 35000.0, 19.0)};
        for(Task8 car:cars){
            double result=car.calculateSalePrice();
            System.out.println(result);
        }

    }
}
