package MyClasses;

/**
 * Created by airga on 06.11.2016.
 */
public class Helper
{
    void helpon (int x)
    {
        switch (x) {
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
                break;

            default:
                System.out.println("Selection not found\n");
                break;


        }

    }
}
