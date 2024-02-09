import java.util.Scanner;
public class RobustScanner {

        private Scanner scanner;

        public RobustScanner(){

            this.scanner = new Scanner(System.in);

        }

        public String next(){

            return scanner.next();

        }

        public int nextInt(){

            int value = 0;

            boolean valid = false;

            while(!valid){

                try{

                    value = scanner.nextInt();

                    valid = true;

                }catch(Exception ex){

                    System.out.print("Error! Try again: ");

                    scanner.next();

                }

            }

            return value;

        }

        public double nextDouble(){

            double value = 0.0;

            boolean valid = false;

            while(!valid){

                try{

                    value = scanner.nextDouble();

                    valid = true;

                }catch(Exception ex){

                    System.out.print("Error! Try again: ");

                    scanner.next();

                }

            }

            return value;

        }
    public static void main(String[] args) {

        RobustScanner scanner = new RobustScanner();

        //1. divide two integers
        System.out.println("\nAttempt to divide two integers...");
        System.out.print("Enter an number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter another number: ");
        int num2 = scanner.nextInt();
        System.out.println(num1/num2);

        //2. print the third letter of a word
        System.out.println("\nAttempt to print the third letter of a word...");
        System.out.print("Enter a word: ");
        String word = scanner.next();
        System.out.println(word.charAt(2));

        //3. print the given index of 'code'
        System.out.println("\nAttempt to print the character at the given index of code:");
        String message = "code";
        System.out.print("Enter an index: ");
        int index = scanner.nextInt();
        System.out.println(message.charAt(index));

        //4. count from num1 to num2
        System.out.println("\nAttempt to count from num1 to num2:");
        System.out.print("Enter an number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter another number: ");
        num2 = scanner.nextInt();
        for(int i = num1; i != num2; i++){
            System.out.println(i);
        }
    }
}
