public class fibanacci {

    public static void numbs(int a , int b, int temp){
        if(temp == 0 ){
            return;
        }
         int c = a+b;
        System.out.println(c);
        numbs(b,c,temp-1);
    }
    public static void main(String args[])
    {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        numbs(0,1 , 5);
    }
}
