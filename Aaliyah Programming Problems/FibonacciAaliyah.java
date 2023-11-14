public class FibonacciAaliyah {

    public static void main(String[] args) {

        int fibonacciAmountLimit = 10;
        int firstNum = 1;
        int secondNum = 1;

        // Printing the first and second numbers in the fibonacci sequence (starting
        // from 1)
        System.out.println("Fibonacci Series (First " + fibonacciAmountLimit + " numbers):");
        System.out.print(firstNum + " " + secondNum + " ");

        int fiboCounter = 2;

        // Printing the remaining 8 fibonacci numbers
        while (fiboCounter < fibonacciAmountLimit) {
            int nextNum = firstNum + secondNum;
            System.out.print(nextNum + " ");
            firstNum = secondNum;
            secondNum = nextNum;
            fiboCounter++;
        }

    }

}