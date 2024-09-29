public class Rfactoial {
    
    public static void printfact(int i,int n,int fact){
        if(i ==n){
            fact *=i;
            System.out.println("the fctorial of 5 is " + fact);
            return;
        }
        fact *=i;
        printfact( i+1, n, fact);
    }

    public static void main (String args[])
    {
        printfact(1, 5, 1);
    }
}
