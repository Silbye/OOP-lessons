package lesson4;

public class Task {
    public static void main(String[] args) {
        Logic logic = new Logic();
        int[][] matrix = logic.createMatrix();
        logic.printMatrix(matrix);
        logic.findShortestDistance(matrix, 0, 0, 9, 9);
    }
}