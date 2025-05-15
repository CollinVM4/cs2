import java.util.*;


public class Syntax {


    public static void main(String[] args) 
    {

        StringBuilder myString = new StringBuilder();
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        myString.append("stringy");

        // for(int i = 0; i < (myString.length()); i++)
        // {
        //     System.out.println("ma string is this long yo, " + i);
        // }

        for (int number : numbers)
        {
            if((number % 2) == 0)
            {
                System.out.println("THIS AN EVEN NUMBA YO, "+ number);
            }
            else 
            {
                System.out.println("THIS AN OOOODDDD NUMBA YO, "+ number);
            }
        }



        String name = "Bart";
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, "  + name);
    }


}
