package MyClasses;

/**
 * Created by airga on 21.11.2016.
 */
public class FSDemo
{
    public static void main(String[] args) {
        d fs = new d(5, -1);
        int x;

        System.out.println("Fail quietly.");
        for (int i=0; i < (fs.length *2);i++) fs.put(i,i*10);

        for (int i=0; i < (fs.length *2);i++) {
            x = fs.get(i);


            if (x != -1) System.out.print(x + " ");

        }

        System.out.println();

        System.out.println("\n Fails with error reports.");

        for (int i=0; i < (fs.length *2);i++) if( !fs.put(i,i*10)) System.out.println("Index " + i + " out-of-bounds");

        for (int i=0; i < (fs.length *2);i++) {
            x = fs.get(i);


            if (x != -1) System.out.print(x + " ");
            else System.out.println("Index " + i + " out-of-bounds");

        }
    }

}
