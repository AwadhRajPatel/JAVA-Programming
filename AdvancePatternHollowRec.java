public class AdvancePatternHollowRec {
    public static void hollow_rectangle(int totRows, int totCols) {
        // outerLoop
        for (int i = 1; i <= totRows; i++) {
            // inner - columns
            for (int j = 1; j <= totCols; j++) {
                // cell -(i,j);
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    // boundary cell
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    // Question 2: inverted_rotated_half_pyramid

    public static void inverted_rotated_half_pyramid(int n) {
        // outerLoop
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // starts
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Question 3: Inverted Half-Pyramid with Numbers
    public static void inverted_half_pyramid_Number(int n) {
        // outerloop
        for (int i = 1; i <= n; i++) {
            // inner -Number
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Qquestion 4: Floyd's Triangle
    public static void Floyd_Triangle(int n) {
        // outer
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            // inner how many times will counter be prints
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }

    }

    // Question 5: 0_1 Triangle
    public static void Zero_One_Triangle(int n) {
        // outerLoop
        for (int i = 1; i <= n; i++) {
            // innerLoop
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }

    }

    // Question 6: ButterFly Pattern
    public static void ButterFly_Pattern(int n) {
        // Upper 1st half of the butterfly

        for (int i = 1; i <= n; i++) {
            // Print stars for the first part
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Print spaces 2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            // Print stars for the second part
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 2nd half
        for (int i = n; i >= 1; i--) {
            // Print stars for the first part
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Print spaces 2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            // Print stars for the second part
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    // Question 7: Solid RHOMBUS
    public static void Solid_Rhombus_Pattern(int n) {
        // outer Loop
        for (int i = 1; i <= n; i++) {
            // Space (n-1)
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }

            // Stars prints
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Question 8: Hollow Rhombus
    public static void Hollow_Rhombus_Pattern(int n) {
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }

            // Hollow Rectangle stars
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }  

    // Question 9: Diamond Pattern
    public static void Diamond_Pattern(int n){
        // 1st half
        for(int i=1;i<=n;i++){
            // spaces
            for(int j=1; j<=(n-i);j++){
                System.out.print("  ");
            }

            // Stars
            for(int j=1; j<=(2*i)-1;j++){
                System.out.print("* ");
            }

            System.out.println();
        }

        // 2nd hafl
        for(int i=n;i>=1;i--){
            // spaces
            for(int j=1; j<=(n-i);j++){
                System.out.print("  ");
            }

            // Stars
            for(int j=1; j<=(2*i)-1;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        // hollow_rectangle(4, 5);
        // inverted_rotated_half_pyramid(5);
        // inverted_half_pyramid_Number(5);
        // Floyd_Triangle(5);
        // Zero_One_Triangle(5);
        // ButterFly_Pattern(5);
        // Solid_Rhombus_Pattern(5);
        // Hollow_Rhombus_Pattern(7);
        Diamond_Pattern(6);
    }
}
