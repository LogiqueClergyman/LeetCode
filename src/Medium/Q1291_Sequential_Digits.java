package Medium;
import java.util.*;
public class Q1291_Sequential_Digits {
    public static void main(String[] args) {
        int low = 1000 , high = 13000;
        int l = low;
        while(low/10>0){
            low /= 10;
        }
        List<Integer>ans = new ArrayList<>();
        for(int i = low; i < 9; i++){
            help(i, ans, high, l);
        }
        Collections.sort(ans);
        System.out.println(ans);
    }
    public static void help(int end, List<Integer> ans, int high, int low){
        if(end>high) return;
        if(end>=low){
            ans.add(end);
        }
        help(end*10 + end%10+1, ans, high, low);
    }
}
