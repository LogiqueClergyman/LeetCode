package Medium;

public class Q647_Palindromic_Substring {
    public static void main(String[] args) {
        System.out.println(countSubstrings("jack"));
    }

    public static int countSubstrings(String s) {
        helper(s, "");
        return count;
    }
    static int count =0;
    public static void helper(String s , String ans){
        for(int i = 0 ; i < s.length() ; i++){

        }
    }
    public static boolean pal(String s){
        if(s.length()==1) return true;
        int i=0,j = s.length()-1;
        while(i!=j){
            if(s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
