// (Financial application: calculate tips) 
// Write a program that reads the subtotal and the gratuity 
// rate, then computes the gratuity and total. For example, 
// if the user enters 10 for subtotal and 15% for gratuity rate, 
// the program displays $1.5 as gratuity and $11.5 as total. 

public class FinancialApplication {

    public static void main (String[] args) {
        // float subtotal, gratuity, total;
        // subtotal = 10;
        // gratuity = subtotal + 0.15;
        // total = subtotal + gratuity;

        float f = 0.15f;
        int subtotal = 10;
        float total = subtotal + (subtotal * f);
        
        System.out.println("total is " + total);

    }
}