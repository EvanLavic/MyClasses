package MyClasses;

/**
 * Created by airga on 18.11.2016.
 */
public class QDem {


    public static void main(String[] args) {
        Qeue bigQ = new Qeue(100);
        Qeue smallQ = new Qeue(4);
        double j, ch;
        char ch2;
        int i;

        System.out.println("Use bigQ to store the alphabet");

        for ( i=0; i<26; i++)
        {
            j=i;
            bigQ.put (j+j*(j/2));
        }

        System.out.println("Contents of bigQ ");
        for ( i=0; i<26; i++)
        {
            ch=bigQ.get();
            if (ch != (char)(0))System.out.print(ch + " ");
        }

        System.out.println();


        System.out.println("Use amsllQ to store the errors");

        for ( i=0; i<5; i++)
        {
            j=i;
            System.out.println("Attempt to store  " +( j+(j/20) - j*j +100));
            smallQ.put (( j+(j/20) - j*j +100));
            System.out.println();
        }

        System.out.println();

        System.out.println("Contents of smallQ ");
        for ( i=0; i<5; i++)
        {
            ch=smallQ.get();
            if (ch != (char)0)System.out.print((double)ch + " ");
        }



        Qeue2  q1  =  new  Qeue2(10);


        char  name[]  =  {'Т', 	'o', 	'm'};
        //  построить  очередь  из  массива
        Qeue2  q2  =  new  Qeue2(name);



        //  поместить  ряд  символов  в  очередь  ql
        for(i=0;  i  <  10;  i++)
            q1.put((char)  ('A'  +  i));
                    //  построить  одну  очередь  из  другой  очереди
                    Qeue2  q3  =  new  Qeue2(q1);
        //  показать  очереди


        System.out.print("Contents  of  ql:  ");



        for(i=0;  i  <  10;  i++) 	{
            ch2  =  q1.get();
            System.out.print(ch2+ " ");
        }


        System.out.println("\n");

        System.out.print("Contents  of  q2:  ");
        for(i=0;  i  <  3;  i++)  {
            ch2  =  q2.get();
            System.out.print(ch2 + " ");
        }
        System.out.println("\n");



        System.out.print("Contents  of  q3:  ");
        for(i=0;  i  <  10;  i++) 	{
            ch2  =  q3.get();
            System.out.print(ch2 + " ");
        }


    }

}
