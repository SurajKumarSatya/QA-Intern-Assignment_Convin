package programPractise;

public class NumberPattern {
	    public static void main(String[] args) {
	        // Loop from 1 to 5
	        for (int i = 1; i <= 5; i++) {
	            // Loop from 5 to i
	            for (int j = 5; j > i; j--) {
	                // Print a space
	                System.out.print("  ");
	            }
	            // Loop from 1 to i
	            for (int k = 1; k <= i; k++) {
	                // Print k followed by a space
	                System.out.print(k + " ");
	            }
	            // Print a new line
	            System.out.println();
	        }
	    }
	}
