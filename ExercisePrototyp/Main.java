package ExercisePrototyp;

import java.util.ArrayList;

class Main 
{
    public static void main(String[] args)
    {
        PrimeFilter primeFilter = new PrimeFilter(2, 1000);
        ArrayList<Integer> primeNumbers = primeFilter.filterOutCompositeNumbers();

        System.out.println(
            "NumbersCollection after filtering out composite numbers: " + primeNumbers
        );
    }
}
