package LAB_1;

public class task_9 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 0, 0, 1},
                {0, 1, 0, 0},
                {1, 0, 1, 0},
                {0, 1, 0, 1}
        };

        boolean tracker = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) { // Check diagonal elements
                    if (arr[i][j] != 1) {
                        tracker = false;
                        break;
                    }
                } else { // Check non-diagonal elements
                    if (arr[i][j] != 0) {
                        tracker = false;
                        break;
                    }
                }
            }
            if (!tracker) {
                break;
            }
        }

        if (tracker) {
            System.out.println("Identity Matrix");
        } else {
            System.out.println("Not an Identity Matrix");
        }
    }
}
