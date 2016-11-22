package MyClasses;

/**
 * Created by airga on 14.11.2016.
 */
public class Bubble {

    public static void main (String[] args)
    {

        int arr[] = {345, 435345, 435 ,432 ,556 ,788, 4864, 4684 ,684};
        int size=9;
        int i, j;

        System.out.println("Originally massive is ");
        for (i=0;i<size;i++)
        {
            System.out.print(" " + arr[i]);
        }
        System.out.println (" ");


        for (i = 1; i < size; i++)
        {

            for (j = 1; j < size; j++)
            {
                if (arr[j-1] > arr[j])
                {

                    arr[j-1] ^=  arr[j];
                    arr[j] ^=  arr[j-1];
                    arr[j-1] ^=  arr[j];
                }
            }


        }



        System.out.println("New massive is ");
        for (i=0;i<size;i++)
        {
            System.out.print(" " + arr[i]);
        }
        System.out.println (" ");
    }
}
