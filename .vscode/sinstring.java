public class sinstring {
    public static void main(String[] args) {
        String name = "where_writting_begins";

        char target = 'e';
        System.out.println(name.toCharArray());

        System.out.println(findChar(name,target));

    }

    static boolean findChar(String name, char target){
     
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)== target){
                return  true;
            }

        }
        return false;
    }
}
