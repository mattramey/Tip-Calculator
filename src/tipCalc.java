import java.util.Scanner;

public class tipCalc {
    public  static void main(String[] args)
    {
        System.out.println("Enter  Subtotal");

        try (// Intantiate scanner class
        Scanner input = new Scanner (System.in)) {
            // Initialize variable subtotal
            Double subtotal = input.nextDouble();

            // Enter the Gratuity rate
            System.out.println("Gratuity Rate");

            // Initialize variable tip
            Double tip = input.nextDouble();

            // Calculate gratuity, subtotal * tip / 100
      Double  gratuity = (subtotal * tip / 100D); 

            // Initialize var total and find total subtotal + gratuity
            Double total = (subtotal + (gratuity));
            
            // Display the total and gratuity rate
            System.out.println("The gratuity is $ " + gratuity + " The total is $ " + total);
        }

    }
    
}