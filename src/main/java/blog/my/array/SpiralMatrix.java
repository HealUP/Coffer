package blog.my.array;

/**
* Description: 螺旋矩阵
* date: 2023/9/12 11:41
 *
* @author: Deng
* @since JDK 1.8
*/
public class SpiralMatrix {
    public int [][] generateMatrix(int n) {
        int loop = 0; // 循环次数
        int[][] res = new int[n][n]; // 存放结果
        int x = 0, y = 0; // 从(0,0)开始
        int i, j; // 横纵坐标
        int val = 1; // 从1开始累加
        int mid = n / 2; // 中点

        while (loop++ <= mid) {
            // 从左至右 横不变 纵变
            for (j = y; j < n - loop; j++) {
                res[x][j] = val++;
            }
            // 从上至下 横变纵不变
            for (i = x; i < n - loop; i++) {
                res[i][j] = val++;  // 此时的j就是第一次从左至右的j
            }

            // 从右至左 横不变 纵变
            for (; j > y; j--) { // j不能小于起始位置
                res[i][j] = val++;
            }

            // 从下至上 横变纵不变
            for (; i > x; i--) {
                res[i][j] = val++;
            }
            // 转弯一圈 横纵坐标+1
            x++;
            y++;
        }

        // 如果n为单数 填充中点
        if (n % 2 == 1) {
            res[mid][mid] = val;
        }
        return res;
    }

    public static void main(String[] args) {
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        int[][] ints = spiralMatrix.generateMatrix(3);
        for (int[] a : ints) {
            for (int b : a) {
                System.out.println(b);
            }
        }


    }
}
