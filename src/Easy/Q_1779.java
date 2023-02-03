package Easy;

public class Q_1779 {
    public static void main(String[] args) {
        int [][]arr =  {{1, 2}, {3, 1}, {2, 4}, {2, 3}, {4, 4}};
        System.out.println(nearestValidPoint(3,4, arr ));
    }

    public static int nearestValidPoint(int x, int y, int[][] points) {
        int d = -1, index = -1;
        for (int i = 0; i < points.length; i++) {
            if (x == points[i][0] || y == points[i][1]) {
                if (d > (Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]))) {
                    d = (Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]));
                    index = i;
                }
            }
        }
        return index;
    }
}
