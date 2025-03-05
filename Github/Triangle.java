public class Triangle {
    public static void main(String args[]) {
        for (int i = 0; i < 4; i++) {    // Outer loop for rows
            for (int j = 0; j < 5; j++) {  // Inner loop for columns
                System.out.print("*");
            }
            System.out.println();  // This prints a newline after each row of 5 asterisks
        }
    }
}
