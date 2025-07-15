package com.main.basic_java;

import java.util.Scanner;

import static java.lang.Math.min;

public class Pattern {

    // Pattern 1: Square Fill Pattern
    static void pattern1(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern 2: Right Half Pyramid
    static void pattern2(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern 3: Right-Angle Number Increasing Pyramid
    static void pattern3(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    // Pattern 4: Right-Angle Number Increasing Pyramid With Repeating Digits.
    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    // Pattern 5: Reverse Right Half Pyramid
    static void pattern5(int n) {
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern 6: Reverse Right-Angle Number Increasing Pyramid
    static void pattern6(int n) {
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //Pattern 7: Reverse Right-Angle Number Increasing Pyramid With Repeating Digits
    static void pattern7(int n) {
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i+1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    // Pattern 8: Triangle Star Pattern
    static void pattern8(int n) {
        for (int i=0; i<n; i++) {
            // Printing Space
            for (int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            // Printing Star
            for (int j=0; j<2*i+1; j++) {
                System.out.print("*");
            }
            // Printing Space
            for (int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // Pattern 9: Reverse Triangle Star Pattern
    static void pattern9(int n) {
        for (int i=0; i<n; i++) {
            // Printing Space
            for (int j=0; j<i; j++) {
                System.out.print(" ");
            }
            // Printing Star
            for (int j=0; j<2*n-(2*i+1); j++) {
                System.out.print("*");
            }
            // Printing Space
            for (int j=0; j<i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // Pattern 10: Diamond
    static void pattern10(int n) {
        for (int i=0; i<n; i++) {
            // Printing Space
            for (int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            // Printing Star
            for (int j=0; j<2*i+1; j++) {
                System.out.print("*");
            }
            // Printing Space
            for (int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i=0; i<n; i++) {
            // Printing Space
            for (int j=0; j<i; j++) {
                System.out.print(" ");
            }
            // Printing Star
            for (int j=0; j<2*n-(2*i+1); j++) {
                System.out.print("*");
            }
            // Printing Space
            for (int j=0; j<i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // Pattern 11: Right Half Diamond
    static void pattern11(int n) {
        for (int i=1; i<=2*n-1; i++) {
            int star = i;
            if (i > n) star = 2*n-i;
            for (int j=1; j<=star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Pattern 12: Zero-One Triangle
    static void pattern12(int n) {
        for (int i=0; i<n; i++) {
            int start = 1;
            if (i%2==0) start=1;
            else start=0;
            for (int j=0; j<=i; j++) {
                System.out.print(start+" ");
                start = 1-start;
            }
            System.out.println();
        }
    }

    // Pattern 13:
    static void pattern13(int n) {
        for (int i=1; i<=n; i++) {
            // Numbers
            for (int j=1; j<=i; j++) {
                System.out.print(j);
            }
            // Space
            for (int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            // Numbers
            for (int j=i; j>=1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Pattern 14: Right Half Number Changing Pyramid
    static void pattern14(int n) {
        int num=1;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(num + " ");
                num += 1;
            }
            System.out.println();
        }
    }

    // Pattern 15: Right Half Character Pyramid
    static void pattern15(int n) {
        for (int i=0; i<n; i++) {
            for (char ch='A'; ch<='A'+i; ch++) {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    // Pattern 16: Reverse Right Half Character Pyramid
    static void pattern16(int n) {
        for (int i=0; i<=n; i++) {
            for (char ch='A'; ch<='A'+(n-i-1); ch++) {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    // Pattern 17: Right Half Character Pyramid With Increasing
    static void pattern17(int n) {
        for (int i=0; i<=n; i++) {
            char ch = (char) ('A' + i);
            for (int j=0; j<=i; j++) {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    // Pattern 18: Character Triangle
    static void pattern18(int n) {
        for (int i=0; i<n; i++) {
            // Printing Space
            for (int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            // Printing Char
            char ch = 'A';
            int breakPoint = (2*i+1)/2;
            for (int j=1; j<=2*i+1; j++) {
                System.out.print(ch);
                if (j<=breakPoint) ch++;
                else ch--;
            }
            // Printing Space
            for (int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // Pattern 19: Reversed Pyramid of Characters
    static void pattern19(int n) {
        for (int i=0; i<n; i++) {
            for (char ch = (char) ('E' - i); ch<= 'E'; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    // Pattern 20: Mirrored Hourglass Pattern
    static void pattern20(int n) {
        int iniS = 0; // Initial space count, which will increment by 2 in each iteration
        for (int i=0; i<n; i++) {
            // Print Left Stars
            for (int j=1; j<=n-i; j++) {
                System.out.print("*");
            }
            // Print Spaces in the Middle
            for (int j=0; j<iniS; j++) {
                System.out.print(" ");
            }
            // Print Right Stars
            for (int j=1; j<=n-i; j++) {
                System.out.print("*");
            }
            iniS += 2; // Increase Spaces for the Next Row
            System.out.println(); // Move to the Next Line after Printing One Row
        }
        iniS = 2*(n-1); // Initial Space Count, Which Decreases by 2 in Each Iteration
        for (int i=0; i<n; i++) {
            // Print Left Stars
            for (int j=0; j<=i; j++) {
                System.out.print("*");
            }
            // Print Spaces in the Middle
            for (int j=0; j<iniS; j++) {
                System.out.print(" ");
            }
            // Print Right Stars
            for (int j=0; j<=i; j++) {
                System.out.print("*");
            }
            iniS -= 2; // Decrease Spaces for the Next Row
            System.out.println(); // Move to the Next Line after Printing One Row
        }
    }

    // Pattern 21: Horizontal Hourglass Pattern
    static void pattern21(int n) {
        int inis = 2 * (n - 1); // Initial space count for the upper part
        for (int i = 0; i < n; i++) { // Upper half of the pattern
            // Print left stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            // Print Spaces in the Middle
            for (int j = 0; j < inis; j++) {
                System.out.print(" ");
            }
            // Print Right Stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            inis -= 2; // Decrease spaces for the next row
            System.out.println(); // Move to the next line
        }
        inis = 2; // Reset space count for the lower part
        // Lower half of the pattern (reverse of the upper part)
        for (int i = n - 1; i > 0; i--) {
            // Print left stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // Print spaces in the middle
            for (int j = 0; j < inis; j++) {
                System.out.print(" ");
            }
            // Print right stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            inis += 2; // Increase spaces for the next row
            System.out.println(); // Move to the next line
        }
    }

    // Pattern 22: Hollow Square
    static void pattern22(int n) {
        for (int i=0; i<n; i++) { // Outer Loop for Rows
            for (int j=0; j<n; j++) { // Inner Loop for Columns
                // Print '*' for the border (first row, last row, first column, or last column)
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Pattern 23: Square Matrix with Concentric Numbers
    static void pattern23(int n) {
        int size=2*n-1;
        for (int i=0; i<size; i++) {
            for (int j=0; j<size; j++) {
                // Calculate the value to be printed based on the minimum distance from the edge
                int num = n - min(min(i, j), min(size - i - 1, size - j - 1));
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = in.nextInt();
        pattern23(n);
    }
}
