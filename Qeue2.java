package MyClasses;

/**
 * Created by airga on 21.11.2016.
 */
public class Qeue2 {

    private char q[];
    private int putloc, getloc;

    Qeue2 (int size)
    {
        q = new char [size+1];
        putloc=getloc=0;

    }


    Qeue2 (Qeue2 qu)
    {
        putloc = qu.putloc;
        getloc = qu.getloc;

        q = new char [qu.q.length];

        for (int i = getloc+1; i<=putloc;i++)
        {
            q[i]=qu.q[i];
        }
    }




    Qeue2 (char a[])
    {
        q = new char [a.length +1];
        putloc=getloc=0;

        for(int i=0;i<a.length;i++) put (a[i]);
    }





    public void put (char ch)
    {
        if (putloc==q.length-1)
        {
            System.out.println(" - Queu is full.");
            return;
        }

        putloc++;
        q[putloc]=ch;

    }

    public char get ()
    {
        if (getloc==putloc)
        {
            System.out.println(" - Queu is empty.");
            return (char)0;
        }


        getloc++;

        return (char)q[ getloc ];

    }
}
