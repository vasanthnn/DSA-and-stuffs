package Assignments;

public class number {
    public static void main(String[] args) {
    //  System.out.println(strongno(145));
    //    System.out.println(fact(5));
    //  findArmstrongnos();
     findstrongnos();

    }

    public static boolean Armstrongno(int n){
        int sum = 0;
        int temp = n;

        while(temp>0){
            int rem = temp%10;

            sum = sum + (rem*rem* rem);

            temp = temp/10;
        }
        return n == sum ;
    }

    public static boolean strongno(int n){
        int sum = 0;
        int temp = n;

        while(temp>0){
            int rem = temp%10;

            int fact = fact(rem);

            sum += fact;

            temp = temp/10;
        }
        return n == sum ;
    }


    private  static int fact(int n){


        if(n==1){
            return 1;
        }

        return n * fact (n-1);

    }

    public static void findArmstrongnos(){
        int sum = 0;

        for (int i = 0; i <=1000; i++) {
            int temp =i;
            while(temp>0){
                int rem = temp%10;
    
                sum = sum + (rem*rem* rem);
    
                temp = temp/10;
            }

            if(i == sum){
                System.out.println(i);
            }
            else{
                sum = 0;
            }
        }

    }

public static void  findstrongnos(){

    for (int i = 0; i <=1000; i++) {
        if(strongno(i)){
            System.out.println(i);
        }
    }


}



}