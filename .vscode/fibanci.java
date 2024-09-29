public class fibanci {
    public static void main(String args[]){
        int a= 0;
        int b =1;
        System.out.println(a);
        System.out.println(b);
        int c = a+b;
        System.out.println(c);
        for(int i=1;i<10;i++){
                int temp = b; //1
                b = c;   //1
                c=  temp+b; 
                 

        System.out.println(c);
    }
}
}