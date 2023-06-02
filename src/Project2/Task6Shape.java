package Project2;

/*
Create an Interface 'Shape' with undefined methods as calculateArea
and calculatePerimeter. Create 2 classes Circle & Square that
implements functionality defined in the Shape Interface. Test your
code.
 */
public interface Task6Shape {
    double calculateArea();

    double calculatePerimeter();
}

class Circle implements Task6Shape {
    private double num;

    public Circle(double num) {
        this.num = num;

    }

    @Override
    public double calculateArea() {
        return Math.PI * num * num;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * num;
    }
}

class Square implements Task6Shape {
    private double side;

    public Square(double side) {
        this.side = side;

    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}

class ShapeTester {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println("The Area of Circle is: " + circle.calculateArea());
        System.out.println("The Perimeter of Circle is: " + circle.calculatePerimeter());

        Square square = new Square(2);
        System.out.println("The Area of Square is: " + square.calculateArea());
        System.out.println("The Perimeter of Square is: " + square.calculatePerimeter());

    }

}
