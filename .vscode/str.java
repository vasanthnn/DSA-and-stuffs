import java.util.*;

public class str {

    public static void main(String args[])
    {
        StringBuilder name = new StringBuilder("monie");

        name.append("stark");

        System.out.println(name);

        System.out.println(name.charAt(0));
        name.setCharAt(0,'t');
        System.out.println(name);
        System.out.println(name.reverse());

     double no = (double)5/ 2;

        System.out.println(no);
    }
}

