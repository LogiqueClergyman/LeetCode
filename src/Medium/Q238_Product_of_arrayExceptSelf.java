package Medium;

public class Q238_Product_of_arrayExceptSelf {
    public static void main(String[] args) {

    }
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int[]left = new int[nums.length];
        int[]right = new int[nums.length];
        for( int i = 0 ; i < left.length ; i ++){
            prod *= nums[i];
            left[i] = prod;
        }
        prod = 1;
        for( int i = nums.length-1 ; i >= 0 ; i --){
            prod *= nums[i];
            right[i] = prod;
        }
        nums[0] = right[1];
        nums[nums.length-1] = left[nums.length-2];
        for(int i = 1 ; i < nums.length-1 ; i++){
            nums[i] = left[i-1] * right[i+1];
        }
        return nums;
    }
}
