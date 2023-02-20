package Medium;

//GENERALISED JOSEPHUS PROBLEM


public class Q1823_Circular_Game {
    public static void main(String[] args) {

        System.out.println(findTheWinner(5, 2));
    }
    public static int findTheWinner(int n, int k) {
        return helper(n, k)+1;
    }
    public static int helper(int n, int k){
        if(n==1)
            return 0;
        return (helper(n-1,k) + k) % n;
    }
}
