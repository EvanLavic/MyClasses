package MyClasses;

/**
 * Created by airga on 05.11.2016.
 */
public class dasdf {

    public static void main (String args[]) throws java.io.IOException
    {
        char ch, ignore, answer='D';

        do
        {
            System.out.println("I think letter betwenn A and Z");
            System.out.println("Try to guess it ");
            ch = (char)System.in.read();

            do
            {
                ignore = (char)System.in.read();
            }while (ignore != '\n');

            if (ch == answer) System.out.println("***Right***");
            else
            {
                System.out.print("Sorry, you're wrong\t");
                if (ch > answer) System.out.println("Too high");
                else System.out.println("Too low");
                System.out.println("Try again\n");
            }


        }while (answer != ch);
    }

}
