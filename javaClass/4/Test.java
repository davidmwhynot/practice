import javax.swing.*;
import java.text.DecimalFormat;
public class Test {
	public static void main(String[] args) {
		// int counter = 0;
		// for(int x = 10; x <= 21; x++) {
		// 	System.out.println("Pre-Counter: " + counter);
		// 	++counter;
		// 	System.out.println("Post-Counter: " + counter);
		// 	System.out.println("x: " + x);
		// }
		// double x = 45678.259;
		// DecimalFormat formatter = new DecimalFormat("#,###,##0.00");
		// JOptionPane.showMessageDialog(null, formatter.format(x));
		char chrA = 'd';
		if(chrA == 'A') {
			System.out.println("equal");
		} else if(chrA != 'A') {
			System.out.println("not equal");
		} else {
			System.out.println("error");
		}
	}
}
