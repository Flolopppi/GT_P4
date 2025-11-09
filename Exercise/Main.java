package Exercise;

class Main {
    public static void main(String[] args)
    {
        PrimeFilter primeFilter = new PrimeFilter();
        primeFilter.markPrimeNumbers();
        String numbersCollection = primeFilter.getNumbersCollection();
        int counter = primeFilter.getCounter();
        primeFilter.mapIndexToNumber();

        // System.out.println(numbersCollection);
        // System.out.println(counter);
    }
}
