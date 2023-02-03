package Medium;

public class Q7_ReverseI_Integer {
    public static void main(String[] args) {

    }
    public int reverse(int n) {
        // long n = Math.abs(x);
        long sum = 0;
        while(n!=0){
            sum = sum*10 + n%10;
            n /= 10;
        }
        // System.out.println(sum);
        // if(x<0) sum = 0 - sum;
        if(sum < Math.pow(-2,31) || sum > (Math.pow(2,31)-1)) return 0;
        return (int)sum;
    }
}
