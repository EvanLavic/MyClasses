package MyClasses;

/**
 * Created by airga on 16.05.2016.
 */
public class MaFirstClass  {


    public static void main (String[] args)throws java.io.IOException
    {
        int choice, ignore;


        Helper list = new Helper();

        do {
            System.out.println("Help on\n 1.if\n 2.switch\n 3.for\n 4.while\n 5.do-while\n 6.break\n 7.continue\n");
            System.out.println("To exit from selection menu press E ");
            choice = (char) System.in.read();

            do{
                ignore = System.in.read();
            }while(ignore != '\n');

            if (choice == 'E') break;


            /*
            switch (choice) {
                case '1':
                    System.out.println("The if:\n");
                    System.out.println("if (conditions) {\n statement; \n}");
                    System.out.println("else {\n statement;\n }\n");
                    break;
                case '2':
                    System.out.println("The switch:\n");
                    System.out.println("switch (expression) {");
                    System.out.println("case constant: ");
                    System.out.println("statement sequence;");
                    System.out.println("break;");
                    System.out.println("// ...");
                    System.out.println(" }\n");
                    break;
                case '3':
                    System.out.println("The for:\n");
                    System.out.println("for (initiation ; condition ; itteration) {");
                    System.out.println("statement; ");
                    System.out.println(" } \n");
                    break;
                case '4':
                    System.out.println("The while:\n");
                    System.out.println("while (condition) {");
                    System.out.println("statement; ");
                    System.out.println(" } \n");
                    break;
                case '5':
                    System.out.println("The do-while:\n");
                    System.out.println("do {");
                    System.out.println("statement;");
                    System.out.println(" } while (conditions); \n");
                    break;
                case '6' :
                    System.out.println("The break:\n");
                    System.out.println("break; or break label;\n");
                    break;
                case '7' :
                    System.out.println("The continue:\n");
                    System.out.println("continue; or contunue label;\n");

                default:
                    System.out.println("Selection not found\n");
                    break;


            }

            */

            list.helpon(choice);

        } while(choice != 'E');

        /*
        int i,j;
        System.out.println("Press S to stop");
        for (i=0; (char)System.in.read() != 'S';i++)
        {
            System.out.println("Pass №" + i + "\n");


        }
        */
    }
}
