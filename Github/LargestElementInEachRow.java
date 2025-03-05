import java.util.Scanner;

public class LargestElementInEachRow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        
        int[][] matrix = new int[rows][cols];

        
        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        
        System.out.println("Largest element in each row:");
        for (int i = 0; i < rows; i++) {
            int largest = matrix[i][0]; 
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j]; 
                }
            }
            System.out.println("Row " + (i + 1) + ": " + largest);
        }
    }
}
