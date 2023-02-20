package Medium;

public class Q31_NextPermutation {
    public static void main(String[] args) {
        int[]nums = {3,2,1};
        nextPermutation(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
//        System.out.println(nums);
    }
    public static void nextPermutation(int[] nums) {
        int bp1 = -1; int bp2 = 0; int t = 0;

        //Find the point where the rightmost element which is smaller than the element on its right
        for(int i = nums.length-2 ; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                bp1 = i;
                break;
            }
        }
        if(bp1 != -1){

            //find the rightmost element which is greater than the element at bp1
            for(int i = nums.length-1 ; i>bp1 ; i--){
                if(nums[i] > nums[bp1]){
                    bp2 = i;
                    break;
                }
            }

            //swap the elements at bp1 and bp2
            t = nums[bp1];
            nums[bp1] = nums[bp2];
            nums[bp2] = t;
        }
        //reverse the elements from bp1+1 to the end
        reverse(nums, bp1+1, nums.length-1);
    }
    public static void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
