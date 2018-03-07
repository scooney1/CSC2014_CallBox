/**
 * Author:	Sam Cooney
 * Project:	CallBox
 * Date:	Nov 29, 2017
 * I assert that the program I am submitting is the result of my own efforts.
 * General: 
 */

/**
 * @author Sam
 *
 */
public class NewBox {
	int projectNum;	// Global variable.
	
	public NewBox(int pnumb) {
		projectNum = pnumb;	// Assigns global variable the value of the passes number.
		double ans = 10/5;
		int[] list = {5,6,7};
				
		System.out.println("Box instantiated.");
		System.out.println(ans);
		for (int i=0;i<3;i++) {
			System.out.println(list[i]);
		}
	}
	
	public String toString() {
		
		String result = "*************************************************************\n"
				+ "*                        Sam Cooney                         *\n"
				+ "*                         CSC 2014                          *\n"
				+ "*                       Project #" + projectNum + "                        *\n"
				+ "*************************************************************\n\n";	
		// Puts box into variable result.
		return result;	// Returns box in the form of variable result.
	}
}