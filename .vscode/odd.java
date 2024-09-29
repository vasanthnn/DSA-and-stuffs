public class odd {
    public static void main(String args[])
    {
        int N=4;
    
    if(N%2==0){
        if(N>2 && N<5)
        System.out.print("Not Weird");
        if(N>6 && N<20){
            System.out.print("Weird");
        }
        if( N>20){
            System.out.print("Not Weird");
        }
    }
    else{
        System.out.print("weird");
    }
    }
}