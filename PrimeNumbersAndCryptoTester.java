
/**
 * The purpose of this project is to use this. and other concepts previously taught to
 * calculate the number of prime numbers between a given lower value and upper value
 * inputed by the user.
 *
 * @author Trisha Ganesh
 * @version 07/7/2021
 */

import java.util.Scanner;
import java.util.ArrayList;

    public class PrimeNumbersAndCryptoTester
    {
        public PrimeNumbersAndCryptoTester()
        {
            // Constructor for objects of PrimeNumbersAndCryptoTester class
        }

        public static void main(String[] args)
        {

            //declaring and initializing the scanner class,
            // the array list, and the prime number count
            Scanner in = new Scanner(System.in);
            ArrayList<Integer> allPrimeNumbers = new ArrayList<>();
            int primeNumberCount = 0;

            //User will enter lower and upper limits
            System.out.print("Please enter your lower limit (only integers of " +
                    "numbers between 1 and 100): ");
            final int lowerValue = in.nextInt();
            if (lowerValue <= 0) {
                //prompt user to enter correct value
                System.out.println("Please enter " +
                        "a number between 1 and 100: ");
                return;
            }


            System.out.print("Please enter your upper limit (only integers of " +
                    "numbers between 1 and 100): ");
            in.nextLine();
            final int upperValue = in.nextInt();
            if (upperValue <= 0) {
                //prompt user to enter correct value
                System.out.println("Please enter " +
                        "a number between 1 and 100: ");
                return;
            }

            //Creating primeNumbers object
            PrimeNumbersAndCrypto primeNumbers = new PrimeNumbersAndCrypto(lowerValue, upperValue);

            //Finding and assigning the prime numbers in object to allPrimeNumbers
            allPrimeNumbers = primeNumbers.findPrimeNumbers(allPrimeNumbers);

            //Printing output
            System.out.println("-------------------------------------------------");
            System.out.println("All primes between " + lowerValue + " and " + upperValue + " are" + ":");
            System.out.print(" ~ ");
            for(Integer numbers : allPrimeNumbers)
            {
                System.out.print(numbers + " ~ ");
                primeNumberCount++;
            }
            System.out.println("\n");
            System.out.println("We found " + primeNumberCount + " prime number(s)!");
            System.out.println();
            System.out.println("-------------------------------------------------");
            System.out.println("|                                               |");
            System.out.println("| Thank you for using the prime number program! |");
            System.out.println("|                                               |");
            System.out.println("-------------------------------------------------");
        }
    }