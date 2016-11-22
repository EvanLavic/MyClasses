package MyClasses;

/**
 * Created by airga on 20.11.2016.
 */
public class StringSort
{

    public static void main(String[] args)
    {
        String arr[] = {"String " , "Is " , "Life ",

        "Our ", "neural ", "in ", "the " , "other ",
        "Select ",  "one ", "to ",  "see ", "what ", "it ", "saw "};
        int i, j, k, m;

        String zam;

        for (i=0;i<arr.length;i++) System.out.print(arr[i]);

        System.out.println();


        zam = arr[0];
        arr[0]= arr[2];
        arr[2]= zam;


        for (i=0;i<arr.length;i++) System.out.print(arr[i]);

        System.out.println();

        System.out.println(arr.length);

        System.out.println(arr[1].length());


        for (k=0;k<arr.length;k++)
        {


            for (i=0; i< arr.length-1;i++)
            {


                m = (arr[i].length() < arr[i + 1].length()) ? arr[i].length(): arr[i + 1].length();
                for (j=0; j < m; j++)

                {



                    if (arr[i].charAt(j) >= arr[i + 1].charAt(j) )
                    {
                        zam = arr[i];
                        arr[i]= arr[i+1];
                        arr[i+1]= zam;

                    }

                    else break;


                }


            }
        }


        for (i=0;i<arr.length;i++) System.out.print(arr[i]);


    }
}
