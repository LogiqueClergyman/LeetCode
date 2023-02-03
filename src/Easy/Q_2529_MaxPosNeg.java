package Easy;

public class Q_2529_MaxPosNeg {
    public static void main(String[] args) {
        int [] arr = new int[1000];
        System.out.println(maximumCount(arr));
    }
    public static int maximumCount(int[] nums) {
        int n=0;
        int i=0;
        while(i < nums.length && nums[i] <=0){
            if(nums[i] < 0){n++;}
            i++;
        }
        return Math.max(n,nums.length-i);
    }
}
