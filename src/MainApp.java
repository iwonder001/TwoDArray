
public class MainApp {

	public static void main(String[] args) {
		//declare variables
		//creating an object of the TwoDArray class
		TwoDArray twoD = new TwoDArray();
		
		int [][] c3Po = {{7,6,3}, {42,7, -19}};
		TwoDArray r2D2 = new TwoDArray(c3Po);
		
		System.out.println("The total is: " + r2D2.getTotal());
		System.out.println("The Average is:  " + r2D2.getAverage());
		
		System.out.println("The highest in row 1 is: " + r2D2.getHightestInRow(0));
		System.out.println("The lowest in row 2 is: " + r2D2.getLowestInRow(1));
	}

}
