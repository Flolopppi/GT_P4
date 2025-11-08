package Exercise;

class Main 
{
    public static void main(String[] args)
    {
        PrimeFilter pFilter = new PrimeFilter(2, 1000);

        System.out.println("Numbers: " + pFilter.getNumbers() + "PrimeNumbers: " + pFilter.getPrimeNumbers());
    }
}
