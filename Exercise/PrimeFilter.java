package Exercise;

import java.util.Arrays;

class PrimeFilter {
    private boolean[] numbersCollection;
    private int counter;

    public PrimeFilter()
    {
        this.numbersCollection = new boolean[48];
        this.counter = 0;
        this.populateNumbersCollection();
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

    public int getCounter()
    {
        return this.counter;
    }

    public void markPrimeNumbers()
    {
        for (int i = 0; i < this.numbersCollection.length; i++)
        {
            int numberRepresentedByIndex = i + 2;

            if (this.isPrimeNumber(numberRepresentedByIndex))
            {       
                for (int j = numberRepresentedByIndex; j < this.numbersCollection.length + 2;)
                {
                    if (j != numberRepresentedByIndex)
                    {
                        this.numbersCollection[j - 2] = false;
                    }

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
}
