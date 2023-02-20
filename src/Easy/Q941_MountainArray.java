package Easy;

public class Q941_MountainArray {
    public static void main(String[] args) {
        int[]arr={3,5,5};
        System.out.println(validMountainArray(arr));
    }
        public static boolean validMountainArray(int[] arr) {
            if (arr.length < 3) {
                return false;
            }
            int left = 0;
            int right = arr.length - 1;
            while (left + 1 < arr.length && arr[left] < arr[left + 1]) {
                left++;
            }

            while (right > 0 && arr[right - 1] > arr[right]) {
                right--;
            }
//            if(left==arr.length-1||right==arr[0]){
//                return false;
//            }
//            return true;
            if(left == right){
                return true;
            }
            return false;
        }
}
