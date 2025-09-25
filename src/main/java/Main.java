import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        double number1 = input.nextDouble();
        System.out.print("Please enter the second number: ");
        double number2 = input.nextDouble();

        System.out.println("What operation would you like to perform?");
        System.out.println("1, Add");
        System.out.println("2, Subtract");
        System.out.println("3, Multiply");
        System.out.println("4, Divide");

        System.out.print("Please enter your choice (1-4): ");
        int choice = input.nextInt();

        double result = number1 * number2;
        System.out.println("The result of multiplying is: " + result);
        input.close();


    }
}
