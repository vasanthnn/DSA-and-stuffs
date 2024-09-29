package Assignments;

public class removeduplicate {
    public static void main(String[] args) {
    

        // int n = 3 ^ 5;
        // System.out.println(n);

        String str = "aanaabbab";
        ;
        System.out.println(str.lastIndexOf('a'));
        // System.out.println(uniquechar("aaaabccd"));
    }

    private static String remdup (String str){
        
        String result = "";
        for (int i = 0; i <str.length(); i++) {
            String  ch = ""+str.charAt(i);
            if(result.contains(ch)){
               
               continue;
            }
                result += ch;
            
        

        }
      return result;


    }

    public static String uniquechar (String str){
        
        String unique = "";
        for (int i = 0; i <str.length(); i++) {
            
            char ch = str.charAt(i);

            
            if(str.indexOf(ch) == str.lastIndexOf(ch)){
                unique+=ch;
            }
        }
        

        return unique;
        }

    }

