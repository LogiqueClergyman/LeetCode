package Medium;

public class Q55_JumpGame {
    public static void main(String[]args){
        int[]nums = {3,2,1,0,4};
        helper(nums, 0);
        System.out.println(check);
    }
    static boolean check = false;
    private static void helper(int[]nums, int i){
        if(nums[i] == 0) return;
        if(i > nums.length) return;
        if(i == nums.length-1) {
            check=true;
            return;
        }
        for(int j = 1 ; j <= nums[i] ; j++){
            helper(nums, i+j);
        }
    }
}
