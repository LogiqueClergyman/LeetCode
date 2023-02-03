package Easy;

public class Q191_NoOf1Bits {
    public static void main(String[] args) {
        System.out.println(hammingWeight(00000000000000000000000000001011));
    }
    public static int hammingWeight(int n) {
        System.out.println(n);
        int c = 0;
        String s = Integer.toString(n,2);
        System.out.println(s);
        for(int  i  = 0 ; i<s.length() ; i++){
            if(s.charAt(i) == '1') c++;
        }
        return c;
    }
}
