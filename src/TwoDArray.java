public class TwoDArray {

	private final int ROWS_SIZE = 2;
	private final int COLS_SIZE = 3;

	int[][] numberArray = new int[ROWS_SIZE][COLS_SIZE];

	public TwoDArray(int[][] temp) {
		for (int row = 0; row < ROWS_SIZE; row++) {
			for (int col = 0; col < COLS_SIZE; col++) {
				this.numberArray[row][col] = temp[row][col];
			}
		}

	}

	public TwoDArray() {
		int[][] numberArray = { { 1, 1, 1 }, { 1, 1, 1 } };
	}

	public int getTotal() {
		int total = 0;
		for (int r = 0; r < ROWS_SIZE; r++) {
			for (int c = 0; c < COLS_SIZE; c++) {
				total += numberArray[r][c];

			}
		}
		return total;
	}

	public double getAverage() {
		// casting integer to double
		return (double) getTotal() / (ROWS_SIZE * COLS_SIZE);
	}

	public double getRowTotal(int r) {
		int rowTotal = 0;
		for (int c = 0; c < COLS_SIZE; c++) {
			rowTotal += numberArray[r][c];

		}
		return rowTotal;
	}

	public double getColTotal(int c) {
		int colTotal = 0;
		for (int r = 0; r < COLS_SIZE; r++) {
			colTotal += numberArray[r][c];

		}
		return colTotal;
	}

	public int getHightestInRow(int row) {
		int maxValue = numberArray[row][0];
		for (int c = 1; c < COLS_SIZE; c++) {
			if (maxValue < numberArray[row][c]) {
				maxValue = numberArray[row][c];
			}// end if
		}// end for
		return maxValue;
	}

	public int getLowestInRow(int row) {
		int minValue = numberArray[row][0];
		for (int c = 1; c < COLS_SIZE; c++) {
			if (minValue > numberArray[row][c]) {
				minValue = numberArray[row][c];
			}// end if
		}// end for
		return minValue;

	}
}
