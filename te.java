package MyClasses;

/**
 * Created by airga on 31.10.2016.
 */
public class te
{
    public static void main (String [] args)
    {
        double mass ,earth_weight, g, moon_weight;
        mass= 87.7;
        g=9.8;
        earth_weight=mass*g;
        System.out.println("With your mass equal " + mass+ " kilogrammes and acceleration of gravity equal " + g + " metres per second in square your earth weight is " + earth_weight + " Newtons");
        moon_weight = earth_weight*0.17;
        System.out.println ("Your moon weght is " + moon_weight + " Newtons");

    }



}
