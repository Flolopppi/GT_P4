package ExercisePrototyp;
import java.util.ArrayList;

class PrimeFilter 
{
    private ArrayList<Integer> numbers = new ArrayList<Integer>();
    private ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
    public int counter;


    public PrimeFilter(int rangeStart, int rangeEnd) 
    {
        createNumbersCollectWithinRange(rangeStart, rangeEnd);
        this.counter = 0;
    }


    public ArrayList<Integer> getNumbers()
    {
        return this.numbers;
    }


    public ArrayList<Integer> getPrimeNumbers()
    {
        return this.primeNumbers;
    }


    public ArrayList<Integer> filterOutCompositeNumbers()
    {   
        for (int i = 0; i < this.numbers.size(); i++) 
        {
            int currentOuterNumber = this.numbers.get(i);

            if (this.isPrimeNumber(currentOuterNumber))
            {
                for (int j = 0; j < this.numbers.size(); j++) 
                {
                    int currentInnerNumber = this.numbers.get(j);

                    if (this.isCompositeNumber(currentOuterNumber, currentInnerNumber))
                    {
                        this.numbers.remove(j);
                    } 
                }      
            }   
        }

        return this.numbers;
    }


    private void createNumbersCollectWithinRange(int rangeStart, int rangeEnd)
    {
        for (int i = rangeStart; i < rangeEnd + 1; i++) 
        {
            this.numbers.add(i);
        }
    }


    private boolean isPrimeNumber(int numberToCheck) 
    {
        for (int i = 2; i < numberToCheck; i++) 
        {
            if (numberToCheck % i == 0) {
                return false;
            }
        }

        return true;
    }


    private boolean isCompositeNumber(int primeNumber, int numberToCheck)
    {
        return ((numberToCheck != primeNumber) && (numberToCheck % primeNumber == 0));
    }
}