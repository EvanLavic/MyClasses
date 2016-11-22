package MyClasses;

/**
 * Created by airga on 02.11.2016.
 */
public class SimpleCount
{
    public static void main(String [] args)
    {
        int i , counter, number, j;
        for (i=2; i<=1000; ++i)
        {
            number=i;
            counter=0;
            for (j=2; j<=i; ++j)
            {
                if (number % j == 0)
                {
                    ++counter;
                }
            }
            if (counter<2)
            {
                System.out.println (number);
            }
        }

    }
}
