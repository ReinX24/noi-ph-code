import java.util.Random;

public class SOLOMON_2DIM {
    public static void main(String[] args) {

        // Creating an array with 5 outer arrays and 5 inner arrays
        int[][] twoDimArray = new int[5][5];

        // Creating a Random object to create random numbers to fill our twoDimArray
        Random randomNumGenerator = new Random();

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = randomNumGenerator.nextInt(66) + 10;
            }
        }

        // Printing the array elements with printArray, a custom method to print our
        // twoDimArray elements
        System.out.println("Array Elements:");
        printArray(twoDimArray);

        // Printing the prime numbers of the randomly generated integers of our
        // twoDimArray
        System.out.println("\nSum of Prime Numbers: " + sumOfPrimes(twoDimArray));

        // Printing the diagonal elements in our twoDimArray, starting from the top left
        // element
        System.out.println("\nMain Diagonal Elements:");
        printMainDiagonal(twoDimArray);

        // Printing and calculating the sum of elements below the diagonal numbers
        System.out.println("\nSum of Elements Below the Diagonal: " + sumBelowDiagonal(twoDimArray));

        // Printing and calculating the sum of elements above the diagonal numbers
        System.out.println("Sum of Elements Above the Diagonal: " + sumAboveDiagonal(twoDimArray));

        // Printing the odd numbers below the diagonal elements
        System.out.println("\nOdd Numbers Below the Diagonal:");
        printOddBelowDiagonal(twoDimArray);

        // Printing the odd numbers above the diagonal elements
        System.out.println("\nEven Numbers Above the Diagonal:");
        printEvenAboveDiagonal(twoDimArray);
    }

    private static void printArray(int[][] paraTwoDimArray) {
        // Prints the elements of our two dimensional array
        for (int[] eachRow : paraTwoDimArray) {
            for (int eachElement : eachRow) {
                System.out.print(eachElement + "\t");
            }
            System.out.println();
        }
    }

    private static boolean isPrime(int num) {
        // Checking if the integer in the parameter is a prime number
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int sumOfPrimes(int[][] paraTwoDimArray) {
        // Finding the sum of all prime numbers in our two dimensional array
        int sumOfPrimeNumbers = 0;
        for (int[] eachRow : paraTwoDimArray) {
            for (int eachElement : eachRow) {
                if (isPrime(eachElement)) {
                    sumOfPrimeNumbers += eachElement;
                }
            }
        }
        return sumOfPrimeNumbers;
    }

    private static void printMainDiagonal(int[][] paraTwoDimArray) {
        // Find the diagonal elements of the two dimensional array starting from the
        // upper left element
        for (int i = 0; i < paraTwoDimArray.length; i++) {
            System.out.print(paraTwoDimArray[i][i] + "\t");
        }
        System.out.println();
    }

    private static int sumBelowDiagonal(int[][] paraTwoDimArray) {
        // Calculate the sum below the diagonal elements in our two dimensional array
        int sum = 0;
        for (int i = 1; i < paraTwoDimArray.length; i++) {
            for (int j = 0; j < i; j++) {
                sum += paraTwoDimArray[i][j];
            }
        }
        return sum;
    }

    private static int sumAboveDiagonal(int[][] paraTwoDimArray) {
        // Calculate the sum above the diagonal integers in our two dimensional array
        int sumAboveDiagonalIntegers = 0;
        for (int i = 0; i < paraTwoDimArray.length - 1; i++) {
            for (int j = i + 1; j < paraTwoDimArray[i].length; j++) {
                sumAboveDiagonalIntegers += paraTwoDimArray[i][j];
            }
        }
        return sumAboveDiagonalIntegers;
    }

    private static void printOddBelowDiagonal(int[][] paraTwoDimArray) {
        // Print the elements below the diagonal elements in our two dimensional array
        for (int i = 1; i < paraTwoDimArray.length; i++) {
            for (int j = 0; j < i; j++) {
                if (paraTwoDimArray[i][j] % 2 != 0) {
                    System.out.print(paraTwoDimArray[i][j] + "\t");
                }
            }
        }
        System.out.println();
    }

    private static void printEvenAboveDiagonal(int[][] paraTwoDimArray) {
        // Print the elements above the diagonal elements in our two dimensional array
        for (int i = 0; i < paraTwoDimArray.length - 1; i++) {
            for (int j = i + 1; j < paraTwoDimArray[i].length; j++) {
                if (paraTwoDimArray[i][j] % 2 == 0) {
                    System.out.print(paraTwoDimArray[i][j] + "\t");
                }
            }
        }
        System.out.println();
    }
}