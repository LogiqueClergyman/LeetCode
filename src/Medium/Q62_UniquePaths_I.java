package Medium;

public class Q62_UniquePaths_I {
    public static void main(String[] args) {
        System.out.println(uniquePaths(2,3));
    }
    public static int uniquePaths(int m, int n) {
        int[][]matrix = new int[m][n];
        for(int i = 0 ; i < n ; i++){
            matrix[0][i] = 1;
        }
        for(int i = 1 ; i < m ; i++){
            matrix[i][0] = 1;
        }
        int i = 1, j = 1;
        if(j>=n) return 1;
        while(i<m){
            matrix[i][j] = matrix[i][j-1] + matrix[i-1][j];
            j++;
            if(j == n){
                i++;
                j=1;
            }
        }
        return matrix[m-1][n-1];
    }
}
