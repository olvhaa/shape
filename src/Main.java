import gornik.Circle;
import gornik.Square;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj bok kwadratu");
        double x = scanner.nextDouble();
        Square square = new Square(x);

        //obiekt
       // Square square = new Square(4.7);
        System.out.println(square.getSideSquare());
        System.out.println(square);
        double area = square.calculateArea();
        System.out.println(area);
        System.out.printf("Pole kwadratu wynosi %.2f \n", area);
        System.out.printf("Pole kwadratu o boku %.2f wynosi %.2f \n", square.getSideSquare(), area);
        //mozna wywolywac tak jak u gory albo na dole
        //System.out.println(square.calculateArea());
        //System.out.println(square.calculateCircuit());
        double circuit = square.calculateCircuit();
        System.out.println(circuit);

        Circle circle = new Circle(15.45);
        area = circle.calculateArea();
        System.out.println(circle.getRadius());
        System.out.printf("Pole kola o promieniu %.2f wynosi %.2f \n", circle.getRadius(), area);


    }
}