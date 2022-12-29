package lesson4;

import java.util.Random;
import java.util.LinkedList;
import java.util.Queue;

public class Logic {
    Random random = new Random();

    public int[][] createMatrix() {
        int[][] matrix = new int[10][10];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int chance = random.nextInt(6);
                if (chance < 4) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }

    public void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean isValid(int matrix[][], boolean visited[][], int row, int col) {
        return ((row >= 0) && (row < matrix.length)) && ((col >= 0) && (col < matrix[row].length))
                && (matrix[row][col] == 1) && (!visited[row][col]);
    }

    public void findShortestDistance(int matrix[][], int i, int j, int x, int y) {
        int row[] = { -1, 0, 0, 1 };
        int col[] = { 0, -1, 1, 0 };

        if(matrix[i][j] == 0){
            System.out.println("Starting point is a wall!");
        }
        else{
            boolean[][] visited = new boolean[matrix.length][matrix[i].length];
            Queue<Node> q = new LinkedList<Node>();
            visited[i][j] = true;
            q.add(new Node(i, j, 0));
            int minimum_distance = Integer.MAX_VALUE;
            while (!q.isEmpty()) {
                Node node = q.poll();
                i = node.getX();
                j = node.getY();
                int dist = node.getDistance();
                if (i == x && j == y) {
                    minimum_distance = dist;
                    break;
                }
    
                for (int k = 0; k < 4; k++) {
                    if (isValid(matrix, visited, i + row[k], j + col[k])) {
                        visited[i + row[k]][j + col[k]] = true;
                        Node n = new Node(i + row[k], j + col[k], dist + 1);
                        q.add(n);
                    }
                }
            }
    
            if (minimum_distance == Integer.MAX_VALUE) {
                System.out.print("Destination cannot be reached");
            } else {
                System.out.print("The shortest path has length " + minimum_distance);
            }
        }  
    }
}
