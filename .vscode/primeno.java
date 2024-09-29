public class primeno {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(findingprime(n));
        
    }

    static int findingprime(int n){
      int c = 2;
      int prime = 0;
      while(c*c <=n){
        if(c%n == 0){
           prime = c;
        }
       
        c++;

      }
     return prime;

}
}