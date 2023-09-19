package gornik;


import static java.lang.Math.pow;

public class Square {
   private double sideSquare;
    public Square(double sideSquare){
        this.sideSquare = sideSquare;}

    public double getSideSquare() {
        return sideSquare;
    }

    //metoda
public double calculateArea(){
    return pow(this.sideSquare, 2);
}
public double calculateCircuit(){
        return sideSquare * 4;
}

   }

