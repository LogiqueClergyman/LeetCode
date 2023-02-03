//package Easy;
//import java.util.*;
//public class Q100_Same_Tree {
//    public boolean isSameTree(TreeNode root, TreeNode subroot) {
//        if(subroot == null && root == null){
//            return true;
//        }
//        if(root == null || subroot == null){
//            return false;
//        }
//        if(root.val != subroot.val) {
//            return false;
//        }
//        return isSameTree(root.left, subroot.left) && isSameTree(root.right, subroot.right);
//    }
//}
