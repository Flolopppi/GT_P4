package Exercise;
import java.util.ArrayList;

class PrimeFilter 
{
    private ArrayList<Integer> numbers = new ArrayList<Integer>();
    private ArrayList<Integer> primeNumbers = new ArrayList<Integer>();


    public PrimeFilter(int rangeStart, int rangeEnd) 
    {
        createNumbersCollectWithinRange(rangeStart, rangeEnd);
        getAllPrimeNumbersFromCollection();
    }


    public ArrayList<Integer> getNumbers()
    {
        return this.numbers;
    }


    public ArrayList<Integer> getPrimeNumbers()
    {
        return this.primeNumbers;
    }


    private void createNumbersCollectWithinRange(int rangeStart, int rangeEnd)
    {
        for (int i = rangeStart; i < rangeEnd + 1; i++) {
            this.numbers.add(i);
        }
    }


    private boolean isPrimeNumber(int numberToCheck) 
    {
        for (int i = 2; i < numberToCheck; i++) {
            if (numberToCheck % i == 0) {
                return false;
            }
        }

        return true;
    }


    private void getAllPrimeNumbersFromCollection() 
    {
        for (int i = 0; i < this.numbers.size(); i++) {
            if (this.isPrimeNumber(i)) {
                this.primeNumbers.add(i);
            }
        }
    }
}