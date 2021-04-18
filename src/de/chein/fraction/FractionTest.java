package de.chein.fraction;

public class FractionTest {

    public static void main(String[] args) {

        
            Fraction bruch = new Fraction(65,87);
            
//            neues Fraction-Objekt mit getProductOfThisAnd-Methode am bruch-Objekt und Übergabe eines neuen Objektes über den Konstruktor 
            Fraction neuerBruch = bruch.getProductOfThisAnd(new Fraction(3,5));
            System.out.println("gekürzter Bruch: "+neuerBruch.toString());

    }

}
