package Strings;

public class difference {
    public static void main(String[] args) {

        System.out.println(finddiff("9876543210"));
   
       
      }

      public  static long finddiff(String  a){

       long n  = Long.parseLong(a);

       long odddigit = 0;
       long evendigit = 0;
       while (n>0) {
           
           long digit = n %10;

           if(digit%2 == 0){
               evendigit = evendigit + digit;
           }

           else{
               odddigit = odddigit + digit;
           }

           n = n/10;

       }

        return  odddigit - evendigit;
      }
}
