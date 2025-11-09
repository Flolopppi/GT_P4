package Exercise;

import java.util.Arrays;

class PrimeFilter {
    private boolean[] numbersCollection;
    private int counterStart;
    private int counterEnd;

    public PrimeFilter()
    {
        this.numbersCollection = new boolean[48];
        this.populateNumbersCollection();
        this.counterStart = 0;
        this.counterEnd = 48;
    }

    public String getNumbersCollection()
    {
        return Arrays.toString(this.numbersCollection);
    }

    public void mapIndexToNumber()
    {
        for (int i = 0; i < this.numbersCollection.length; i++)
        {
            int numberRepresentedByIndex = i + 2;

            if (this.numbersCollection[i])
            {
                System.out.println("Value at index: " + i + " = " + this.numbersCollection[i] + " with number: " + numberRepresentedByIndex);
            }
        }
    }

    public int getPrimeNumbersCount()
    {
        return this.countPrimeNumbers();    
    }

    public void markPrimeNumbers()
    {
        for (int i = 0; i < this.numbersCollection.length; i++)
        {
            int numberRepresentedByIndex = i + 2;

            if (this.isPrimeNumber(numberRepresentedByIndex))
            {       
                for (int j = numberRepresentedByIndex * numberRepresentedByIndex; j < this.numbersCollection.length + 2;)
                {
                    this.numbersCollection[j - 2] = false;

                    j = numberRepresentedByIndex + 1 * j;
                }
            }
        }
    }

    private boolean isPrimeNumber(int numberToCheck)
    {
        for (int i = 2; i < numberToCheck; i++)
        {
            if (numberToCheck % i == 0)
            {
                return false;
            }
        }

        return true;
    }

    private void populateNumbersCollection()
    {
        for (int i = 0; i < 48; i++)
        {
            this.numbersCollection[i] = true;
        }
    }

    private int countPrimeNumbers()
    {
        int counter = 0;

        for (int i = this.counterStart; i < this.counterEnd; i++)
        {   
            if (this.numbersCollection[i])
            {
                counter++;
            }
        }

        return counter;
    }
}
