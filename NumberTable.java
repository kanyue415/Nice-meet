import java.util.Scanner;

public class NumberTable {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in); 
		
		System.out.println("Please enter the height of the table: ");
		int height = scan.nextInt(); 
		
		System.out.println("Please enter the width of the table: ");
		int width = scan.nextInt(); 
		
		Table t = new Table(height, width); 
		
		t.getNumbers(); 
		
	    scan.close();
	}
}