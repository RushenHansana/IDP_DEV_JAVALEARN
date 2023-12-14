import java.util.Scanner;

class fibonacci{
    public static void seqgenrator(int n){
        int[] sequence = new int[n];
        sequence[0] = 1;
        sequence[1] = 1;
        for(int k = 2; k < n;k++){

            sequence[k] = sequence[k-1]+sequence[k-2];
            System.out.print(sequence[k]+" ");

        }
    }

    public static void main (String[] args){

        //getting user input
        Scanner scanner = new Scanner(System.in);

        int number;
        while(true){
            try{
                System.out.println("Fibonacci sequnece genarator starting...");
                System.out.println("Enter the number of terms :");
                String num = scanner.nextLine();
                number = Integer.parseInt(num);
                break;
            }catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }



        scanner.close();

        System.out.print("Fibonacci sequence is => ");

        switch(number){
            case 1:
                System.out.print(1);
                break;
            case 2:
                System.out.print(1+ " "+1);
                break;
            default:
                System.out.print(1+ " "+1+" ");
                fibonacci.seqgenrator(number);
                break;

        }

    }
}