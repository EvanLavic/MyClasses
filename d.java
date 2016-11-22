package MyClasses;

/**
 * Created by airga on 21.11.2016.
 */
public class d {
    private int a[];
    private int errval;

    public int length;

    public d (int size, int errv)
    {
        a=new int[size];
        errval=errv;
        length=size;

    }


    public int get (int index) {

        if (ok(index)) return a[index];
        return errval;
    }


    public boolean put (int index, int val)
    {
        if (ok(index))
        {
            a[index] = val;
            return true;
        }
        return false;
    }



    private boolean ok (int index)
    {
        if (index >=0 & index < length) return true;
        return false;
    }

}