//package Medium;
//public class Q98_ValidateBinary {
//    public static boolean isValidBST(TreeNode root) {
//        if(root == null){
//            return true;
//        }
//        if(root.left == null || root.right == null){
//            return true;
//        }
//        if(root.left.val>=root.val){
//            return false;
//        }
//        if(root.right.val<=root.val){
//            return false;
//        }
//        return isValidBST(root.left) && isValidBST(root.right);
//    }
//}
