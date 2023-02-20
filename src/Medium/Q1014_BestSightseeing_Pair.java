package Medium;

public class Q1014_BestSightseeing_Pair {
    public static void main(String[] args) {

    }
    public int maxScoreSightseeingPair(int[] values) {
        int max = 0;
        int left = values[0]+0;
        for(int i = 1 ; i < values.length ; i++){
            max = Math.max(max, left+values[i]-i);
            left = Math.max(left, values[i]+i);
        }
        return max;
    }
}
