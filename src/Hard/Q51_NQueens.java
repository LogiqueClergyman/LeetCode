//package Hard;
//import java.util.*;
//public class Q51_NQueens {
//    public static void main(String[] args) {
//        System.out.println(solveNQueens(4));
//    }
//    public static List<List<String>> solveNQueens(int n) {
//
//        List<String> list = new ArrayList<>();
//        List<List<String>> ans = new ArrayList<>();
//        boolean[]row = new boolean[n];
//        boolean[]dUp = new boolean[2*(n-1)];
//        boolean[]dDown = new boolean[2*(n-1)];
//        helper(ans, list, "", n, 0, 0, row, dUp, dDown, 0);
//        return ans;
//    }
//    public static void helper(List<List<String>> ans, List<String> list, String temp, int n, int r, int c, boolean[]row, boolean[]dUp, boolean[]dDown, int placed){
//
//        if(c == n){
//            list.add(temp);
//            System.out.println(list);
//            if(placed == n)
//                ans.add(new ArrayList<>(list));
//            return;
//        }
//        for(int i = 0; i < n ; i++){
//            if(!row[r] && !dDown[r+c] && !dUp[n-1-c+r] && !col[c]){
//                row[r] = true;
//                dDown[r+c] = true;
//                dUp[n-1-c+r] = true;
//                helper(ans, list, temp+"Q", n, r, c+1, row, dUp, dDown, placed+1);
//                row[r] = false;
//                dDown[r+c] = false;
//                dUp[n-1-c+r] = false;
//            }
//            else{
//                helper(ans, list, temp+".", n, r, c+1,  row, dUp, dDown, placed);
//            }
//
//        }
//    }
//}
