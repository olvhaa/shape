package gornik;

import static java.lang.Math.*;

public class Circle {

    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea() {
        return PI * pow(this.radius, 2);
        //moze byc math.pi lub zwykle pi tylko trzeba zimportowac (na koncu dac * zamiast math)
    }

    public double calculateCircuit(){
        return 2 * PI * this.radius;

    }
}
