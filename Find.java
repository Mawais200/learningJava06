import java.util.Scanner;

public record Find() {
    public static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns:");
        int col = sc.nextInt();

        int num[][] = new int[rows][col];

        // Input
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                num[i][j] = sc.nextInt();
            }
        }
System.out.println("enter x value that you want to find in 2darray");
        int x=sc.nextInt();
        // Output in matrix format
        System.out.println("The entered matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {

                if(num[i][j]==x){
                    System.out.println("x found at position ("+i+","+j+")");
                }
            }
          
        }

        sc.close(); // Close scanner at the end to prevent memory leaks
    }
}

