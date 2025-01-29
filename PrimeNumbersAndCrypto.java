
/**
 * This class defines a PrimeNumbersAndCrypto object.
 *
 * @author Trisha Ganesh
 * @version 07/7/2021
 */

import java.util.ArrayList;

    public class PrimeNumbersAndCrypto
    {
        private int lowerNumber;
        private int upperNumber;

         //Constructor for objects of class PrimeNumbersAndCrypto
        public PrimeNumbersAndCrypto(int l, int u)
        {
            this.lowerNumber = l;
            this.upperNumber = u;
        }


         //Finding all the primes between this.lowerNumber and this.upperNumber
         //returning an array list containing prime numbers.
        public ArrayList findPrimeNumbers(ArrayList primeNumbers)
        {
            int value = this.lowerNumber;

            //Prime number checking
            if(this.lowerNumber == 0 || this.lowerNumber == 1)
                value = 2;

            //Outer for loop looping through all the values between lowerNumber and upperNumber Value
            for(int index = value; index <= this.upperNumber; index++)
            {
                int countNumbers = 0;

                //an inner for loop which determines if a value is prime or not.
                // If prime, the count will be set to 0.
                for(int k = 2; k < index; k++)
                {
                    if(index % k == 0)
                    {
                        countNumbers++;
                        break;
                    }
                }
                if(countNumbers == 0)
                {
                    primeNumbers.add(index);
                }
            }
            //return prime numbers
            return primeNumbers;
        }
    }

