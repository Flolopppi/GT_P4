package Exercise;

class Main {
    public static void main(String[] args)
    {
        PrimeFilter primeFilter = new PrimeFilter();
       
        primeFilter.markPrimeNumbers();

        int counter = primeFilter.getPrimeNumbersCount();

        System.out.println("Count of marked prime number: " + counter);
    }
}
