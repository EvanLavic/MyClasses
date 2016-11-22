package MyClasses;

/**
 * Created by airga on 31.10.2016.
 */
public class sound
{
    public static void main(String [] args)
    {
        int i,j;
        for (i=2;i<=100;i++)
        {
            System.out.print("Factors of " + i + " : ");
            for (j=2;j<=(i/2);j++)
            {
                if ((i%j)==0) System.out.print(j + " ");
            }
            System.out.println();
        }

        Animal dog = new Animal();
        dog.bark() ;

        int range1, range2, miles = 30;



        Venichle minivan = new Venichle();
        minivan.fuelcap=16;
        minivan.mpg=21;
        minivan.passengers=7;
        range1 = minivan.mpg * minivan.fuelcap;

        System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range1);

        Venichle sportcar = new Venichle();
        sportcar.fuelcap=14;
        sportcar.mpg=12;
        sportcar.passengers=2;
        range2 = sportcar.mpg * sportcar.fuelcap;


        System.out.println("Sportcar can carry " + sportcar.passengers + " with a range of " + range2);



        System.out.print("Minivan can carry " + minivan.passengers + " .");
        minivan.range();
        System.out.print("Sportcar can carry " + sportcar.passengers + " .");
        sportcar.range();


        System.out.println("For " + miles + " miles needs " + sportcar.fuelneed(miles) + " gallones of fuel");



    }
}
