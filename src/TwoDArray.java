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
	public double getAverage(){
		//casting integer to double
		return (double)getTotal()/(ROWS_SIZE * COLS_SIZE);
	}
	public double getRowTotal(int r){
		int rowTotal = 0;
		for(int c = 0; c < COLS_SIZE; c++){
			rowTotal += numberArray [r][c];
			
		}
		return rowTotal;
	}
}
