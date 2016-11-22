package MyClasses;

/**
 * Created by airga on 18.11.2016.
 */
public class Qeue {

    private double q[];
    private int putloc, getloc;

    Qeue (int size)
    {
        q = new double [size+1];
        putloc=getloc=0;

    }

   public void put (double ch)
    {
        if (putloc==q.length-1)
        {
            System.out.println(" - Queu is full.");
            return;
        }

        putloc++;
        q[putloc]=ch;

    }

    public double get ()
    {
        if (getloc==putloc)
        {
            System.out.println(" - Queu is empty.");
            return (char)0;
        }


        getloc++;

        return (double)q[ getloc ];

    }
}
