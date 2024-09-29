public class hs9 {
    public static void main(String[] args) {
        int n = 10;
        
        System.out.println(printfibancci(n));
      
    }

    static int  printfibancci(int n){
        if(n<2){
            return n;
        }
  
       return printfibancci(n-1 ) + printfibancci(n-2);
    }

}
