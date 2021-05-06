//N-Queen problem
 import java.util.Scanner;

public class lab10 {
	public static int[] board = new int[20];

	public static int count;

	public static void main(String[] args) {
		int n, i, j;
		System.out.print(" - N Queens Problem Using Backtracking -");
		System.out.print("\n\nEnter number of rows:");
		n = STDIN_SCANNER.nextInt();
		queen(1, n);
	}

	public static void print(int n) {
		System.out.println("\n\nSolution " + ++count + ":\n");
		for(int i = 1; i <= n; ++i) {
			System.out.print("\t" + i);
		}
		for(int i = 1; i <= n; ++i) {
			System.out.print("\n\n" + i);
			for(int j = 1; j <= n; ++j) {
				if(board[i] == j) {
					System.out.print("\tQ");
				} else {
					System.out.print("\t-");
				}
			}
		}
	}

	public static boolean place(int row, int column) {
		for(int i = 1; i <= row - 1; ++i) {
			//checking column and digonal conflicts
			if(board[i] == column) {
				return false;
			} else if(Math.abs(board[i] - column) == Math.abs(i - row)) {
				return false;
			}
		}

		return true; //no conflicts
	}

	/**
	 * function to check for proper positioning of queen
	 */
	public static void queen(int row, int n) {
		for(int column = 1; column <= n; ++column) {
			if(place(row, column)) {
				board[row] = column; //no conflicts so place queen
				if(row == n /* dead end */) {
					print(n); //printing the board configuration
				} else {
					//try queen with next position
					queen(row + 1, n);
				}
			}
		}
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}