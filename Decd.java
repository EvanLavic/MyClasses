package MyClasses;

/**
 * Created by airga on 19.11.2016.
 */
public class Decd
{
    public static void main(String[] args)
    {
        String str = "Parararam pam";
        String encode = "";
        String decode = "";
        int i, j;
        String fey = "abcddcba";

        System.out.println(str);


        for (i=0,j=0;i<str.length();i++, j++)
        {

            encode = encode + (char)(str.charAt(i)^fey.charAt(j));
            if (j==7) j=0;
        }

        System.out.println(" Encode string is " + encode);



        for (i=0, j=0;i<encode.length();i++, j++)
        {
            decode = decode + (char)(encode.charAt(i)^fey.charAt(j));
            if (j==7) j=0;
        }

        System.out.println(" Decode string is " + decode);
    }
}
