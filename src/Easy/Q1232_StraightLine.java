package Easy;

public class Q1232_StraightLine {
    public static void main(String[] args) {
        int [][] arr = {{1, -8}, {2, -3}, {1, 2}};
        System.out.println( checkStraightLine(arr));
    }
    public static boolean checkStraightLine(int[][] coordinates) {
        for(int i = 0; i<coordinates.length-2;i++){
            int x2=coordinates[i+1][0];
            int x1=coordinates[i][0];
            int y2=coordinates[i+1][1];
            int y1=coordinates[i][1];
            int x22=coordinates[i+2][0];
            int x11=coordinates[i+1][0];
            int y22=coordinates[i+2][1];
            int y11=coordinates[i+1][1];
            if((x2-x1)/(y2-y1) != (x22-x11)/(y22-y11))
                return false;
        }
        return true;
    }
}
