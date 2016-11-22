package MyClasses;

/**
 * Created by airga on 06.11.2016.
 */
public class Venichle
{
    int passengers;
    int fuelcap;
    int mpg;

    void range()
    {
        System.out.println("Range is " + fuelcap*mpg);
    }

    double fuelneed (int miles)
    {
        return (double)miles/mpg;
    }
}
