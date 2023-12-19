
import java.util.Scanner;
public class ReadUserIn {
    public static void main(String[] args){
        //Create scanner object
        Scanner scanner = new Scanner(System.in);

        //Prompt for user to input
        System.out.print("Enter Input : ");

        //read the entire line
        String inputline = scanner.nextLine();

        //Create another Scanner to parse the inputline
        Scanner lineScanner = new Scanner(inputline);

        //Read integers one by one from th input
        while (lineScanner.hasNext()) {
            if (lineScanner.hasNextInt()) {
                // If the next token is an integer read and process
                int number = lineScanner.nextInt();
                System.out.println("Read Integer : "+number);

            }else{
                lineScanner.next();
            }
        }
        scanner.close();
        ;lineScanner.close();
    }
}
