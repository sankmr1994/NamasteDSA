package _07_stacks_and_queues;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class _10_rotting_oranges {
    public static void main(String[] args) {
        int[][] grid = {{2, 1, 1}, {0, 1, 1}, {1, 0, 1}};
        int n = grid.length;
        int m = grid[0].length;

        Queue<List<Integer>> queue = new ArrayDeque<>();
        int freshCount = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                int isRotten = grid[row][col];
                if (isRotten == 2) {
                    queue.add(List.of(row, col));
                }
                if (isRotten == 1) {
                    freshCount++;
                }
            }
        }

        if (queue.isEmpty()) {
            System.out.println("No orange rotten");
        }

        System.out.println("fresh count : " + freshCount);

        System.out.println(queue);
        int time = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            time++;
            for (int index = 0; index < size; index++) {
                List<Integer> currentRottenPlace = queue.remove();
                int row = currentRottenPlace.get(0);
                int col = currentRottenPlace.get(1);

                //check left
                if (col - 1 >= 0 && grid[row][col - 1] == 1) {
                    grid[row][col - 1] = 2;
                    freshCount--;
                    queue.add(List.of(row, col - 1));
                }
                //check right
                if (col + 1 < m && grid[row][col + 1] == 1) {
                    grid[row][col + 1] = 2;
                    freshCount--;
                    queue.add(List.of(row, col + 1));
                }

                //check top
                if (row - 1 >= 0 && grid[row - 1][col] == 1) {
                    grid[row - 1][col] = 2;
                    freshCount--;
                    queue.add(List.of(row - 1, col));
                }
                //check bottom
                if (row + 1 < n && grid[row + 1][col] == 1) {
                    grid[row + 1][col] = 2;
                    freshCount--;
                    queue.add(List.of(row + 1, col));
                }
            }

            System.out.println(queue);
        }

        for (int[] row : grid) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.println("fresh count : " + freshCount);
        System.out.println(time - 1);
    }
}
