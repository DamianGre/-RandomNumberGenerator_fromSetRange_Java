import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);

        try
        {
            int min, max, howMany;
            Random randomNumber = new Random();

            System.out.println("Hey, I will pick and print for you choosen number of random numbers from choosen range.");
            System.out.println("Enter min range: ");
            min = scanner.nextInt();
            System.out.println("Enter maximum range: ");
            max = scanner2.nextInt();
            System.out.println("How many random numbers you want me to print: ");
            howMany = scanner3.nextInt();
            if (howMany <= 0) {
                throw new Exception("Wrong amount of random numbers!");
            }
            if (max <= min)
            {
                throw new Exception("Wrong numbers range! Max cannot be smaller or equal then max!");
            }
            for (int i = 1; i <= howMany; i++) {
                System.out.println("Number " + i + " random is: " + randomNumber.nextInt(min, max+1) );
            }
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
    }
}