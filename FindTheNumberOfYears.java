import java.util.Scanner;

// (Find the number of years) Write a program 
// that prompts the user to enter the minutes (e.g., 1 billion), 
// and displays the number of years and days for the min- utes. 
// For simplicity, assume a year has 365 days

public class FindTheNumberOfYears {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter > ");
        String input_text = scanner.nextLine();
        System.out.println(input_text + "nyuuryoku");
        scanner.close();


    }

}