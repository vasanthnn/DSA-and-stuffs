package Assignments;

public class nto1 {
    public static void main(String[] args) {
        int n = 5;
        Printno(n);
    }

    static void Printno(int n){
        if(n <1){
            return ;
        }
        System.out.println(n);
        Printno(n-1);
        System.out.println(n);
    }

}
