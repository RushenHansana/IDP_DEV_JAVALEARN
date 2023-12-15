import java.util.Scanner;

public class SimpleCalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");

        //Displaying Menu
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.println("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextInt();

        scanner.close();

        switch (choice){
            case 1:
                System.out.println(add(num1,num2));
                break;
            case 2:
                System.out.println(subs(num1,num2));
                break;
            case 3:
                System.out.println(mul(num1,num2));
                break;
            case 4:
                System.out.println(div(num1,num2));
                break;
        }
    }

    public static double add(double num1,double num2){
        return num1+num2;
    }
    public static double subs(double num1,double num2){
        return num1-num2;
    }

    public static double mul(double num1,double num2){
        return num1*num2;
    }

    public static double div(double num1,double num2){
        return num1/num2;
    }
}