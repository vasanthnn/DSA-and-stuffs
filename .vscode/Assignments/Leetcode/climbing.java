package Assignments.Leetcode;

public class climbing {
    public static void main(String[] args) {
        // System.out.println(findsteps("", 3));
        // System.out.println(findstepsfibo(2));
        System.out.println(findsteparr(3));
    }
    private static int findsteparr(int n) {
// optimal solution

        int [] arr = new int[n+1];

            arr[0]=1;
            arr[1]=1;

            for(int i=2;i<=n;i++){
                arr[i]=arr[i-1]+arr[i-2];
            }

            return arr[n];

    }


    public static int findsteps(String p,int n){

        if(n ==0){
            System.out.println(p);
            return 1;
        }
        int count =0;
        for(int i=1; i<=n;i++){
            if(i<=2){
        count += findsteps(p+i,n-i);
        }}
        return count;
}

public static int findstepsfibo(int n){

    if(n <2){
        System.out.println(n);
        return 1;}

        int count =0;

        int ans = findstepsfibo(n-1) + findstepsfibo(n-2);
        count = ans;
        return count;

}




}