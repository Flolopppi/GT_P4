package Exercise;

import java.util.ArrayList;

class Main 
{
    public static void main(String[] args)
    {
        PrimeFilter pFilter = new PrimeFilter(2, 100);
        ArrayList<Integer> primeNumbers = pFilter.filterNonPrimeNumbers();

        System.out.println("NumbersCollection after filtering out composite numbers: " + primeNumbers);
        // System.out.println("Numbers: " + pFilter.getNumbers() + "PrimeNumbers: " + pFilter.getPrimeNumbers());
    }
}
