package MyClasses;

/**
 * Created by airga on 20.11.2016.
 */
public class MedArifm
{
    public static void main(String[] args) {

        double arr[] = {2.23, 43.6 ,5.0 ,6.43 ,7.0 ,8.0 ,9.786 ,9.0 ,99.0 ,10.6674}, sum;
        int i;

        sum=0;

        for(i=0;i<arr.length;i++)
        {
            sum += arr[i];
        }

        System.out.println("Medium arifmetic of array is " + (sum/arr.length));
    }

}
