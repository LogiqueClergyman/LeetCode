package Medium;
import java.util.*;
public class Q77_Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean[]check=new boolean[n+1];
        helper(n,k,arr,1,list,check);
        return arr;
    }
    public void helper(int n , int k, List<List<Integer>> arr, int idx, List<Integer> list, boolean[]check){
        if(list.size() == k){
            arr.add(new ArrayList<>(list));
            return;
        }
        for(int i = idx; i <= n; i++){
            if(check[i] == false){
                check[i] = true;
                list.add(i);
                helper(n, k, arr, i, list, check);
                list.remove(list.size()-1);
                check[i] = false;
            }
        }
    }
}
