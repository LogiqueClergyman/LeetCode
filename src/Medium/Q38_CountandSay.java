package Medium;

public class Q38_CountandSay {
    public static void main(String [] args){
        System.out.println((countAndSay(4)));
    }

    public static String countAndSay(int n) {
        if(n==1)return "1";
        if(n==2) return "11";
        String ans="11";

        for(int i = 3; i <=n ; i++){
            ans += "$";
            int count = 1;
            String temp ="";
            for(int j = 1 ; j < ans.length(); j++){
                if(ans.charAt(j-1)==ans.charAt(j)){
                    count++;
                }
                else{
                    temp = temp + count + ans.charAt(j-1);
                    count = 1;
                }
            }
            ans=temp;
        }
        return (ans);
    }
}
