public class basic {
    public static void main(String args[])
    {
        int n=4;

        for (int i=1;i<=n;i++)
        {//spaces
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
         //stars
            for(int k=1;k<=n;k++)
            {System.out.print("*");}
            System.out.println();
        }
}
}