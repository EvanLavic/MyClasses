package MyClasses;

/**
 * Created by airga on 20.11.2016.
 */
public class SBDemo
{
    public static void main (String[] args)
    {
        ShowBit firstnumb = new ShowBit (8);
        ShowBit secondnumb = new ShowBit (16);
        ShowBit thirdnumb = new ShowBit (32);

        System.out.println("The binary of 117:  ");
        firstnumb.show(117);

        System.out.println("The binary of 31426:  ");
        secondnumb.show(31426);

        System.out.println("The binary of 21562361:  ");
        thirdnumb.show(21562361);

    }
}
