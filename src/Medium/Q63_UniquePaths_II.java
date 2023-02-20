package Medium;

public class Q63_UniquePaths_II {
    public static void main(String[] args) {
        int[][]arr = {{0,0},{1,1},{0,0}};
        System.out.println(helper(arr));
    }

    public static int helper(int[][]matrix) {
        if(matrix[0][0] == 1 || matrix[matrix.length-1][matrix[0].length-1]==1) return 0;
        matrix[0][0]=1;
        for(int i = 1 ; i < matrix[0].length ; i++){
            if(matrix[0][i]!=1)
                matrix[0][i] = matrix[0][i-1];
            else
                matrix[0][i] = 0;
        }
        for(int i = 1 ; i < matrix.length ; i++){
            if(matrix[i][0]!=1)
                matrix[i][0] = matrix[i-1][0];
            else
                matrix[i][0] = 0;
        }
        int i = 1, j = 1;
        if(j>=matrix[0].length) return 1;
        while(i<matrix.length){
            if(matrix[i][j] != 1)
                matrix[i][j] = matrix[i][j-1] + matrix[i-1][j];
            else
                matrix[i][j] = 0;
            j++;
            if(j == matrix[0].length){
                i++;
                j=1;
            }
        }
        return matrix[matrix.length-1][matrix[0].length-1];
    }
}

//[[0,0,0,0],[0,1,0,0],[0,0,0,0],[0,0,1,0],[0,0,0,0]]