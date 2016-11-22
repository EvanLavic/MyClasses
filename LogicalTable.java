package MyClasses;

/**
 * Created by airga on 02.11.2016.
 */
public class LogicalTable
{
    public static void main (String[] args)
    {
        boolean p, q;

        System.out.println("P\t\tQ\t\tOR\t\tAND\t\tXOR\t\tNOT");

        p=false; q=false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p|q) + "\t" + (p&q) + "\t" );
        System.out.print((p^q) + "\t" + (!p)+ "\n");


        p=false; q=true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p|q) + "\t" + (p&q) + "\t" );
        System.out.print((p^q) + "\t" + (!p)+ "\n");


        p=true; q=false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p|q) + "\t" + (p&q) + "\t" );
        System.out.print((p^q) + "\t" + (!p)+ "\n");


        p=true; q=true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p|q) + "\t" + (p&q) + "\t" );
        System.out.print((p^q) + "\t" + (!p)+ "\n");

    }
}
