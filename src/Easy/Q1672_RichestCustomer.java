package Easy;

public class Q1672_RichestCustomer {
    public static void main(String[] args) {
        int [][] arr = {{1, 2, 3},{3, 2, 1}};
        System.out.println(maximumWealth(arr));
    }
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i = 0; i<accounts.length;i++){
            int sum = 0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            Math.max(sum,max);
        }
        return max;
    }
}
