import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double gasInTank, milesPerGal, priceGas, distance;
        {
            System.out.println("The number of gallons of gas in the tank is: ");
            gasInTank = in.nextDouble();

            System.out.println("The fuel efficiency in miles per gallon is: ");
            milesPerGal = in.nextDouble();

            System.out.println("The price of gas per gallon is: ");
            priceGas = in.nextDouble();
        }

        if(gasInTank <0  || milesPerGal <= 0 || milesPerGal > 100 || priceGas <= 0)
        {
            System.out.print("Invalid input!");
            System.exit(0);
        }

        //Final part of the question
        System.out.println("With the gas price at $" + priceGas + " per gallon, going 100 miles will cost $" + ((priceGas * 100) / milesPerGal));
        distance = gasInTank * milesPerGal;
        System.out.println("You can now travel at a distance of " + distance + " miles.");
    }
}