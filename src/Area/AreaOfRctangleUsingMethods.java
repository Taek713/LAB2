package Area;
import java.util.Scanner;
public class AreaOfRctangleUsingMethods {
	private static Scanner sc;

	public static void main(String[] args) {
		double width, length; 
		sc = new Scanner(System.in);
		
		System.out.println("\n Enter Length:  ");
		width = sc.nextDouble();
		System.out.println("\n Enter Width: ");
		length = sc.nextDouble();

		AreaofRectangle(width, length);
	}
	
	public static void AreaofRectangle( double width, double length ) {
		double Area, Perimeter; 
		
		Area = width * length;
		Perimeter = 2 * (width + length);

		System.out.format("\n Area:  %.2f\n",Area);
		System.out.format("\n Perimeter: %.2f\n", Perimeter);
	}
}

