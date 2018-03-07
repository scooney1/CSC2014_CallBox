/**
 * Author:	Sam Cooney
 * Project:	CallBox
 * Date:	Nov 29, 2017
 * I assert that the program I am submitting is the result of my own efforts.
 * General: 
 */

// 1. Yes
// 2. Yes
// 3. 2.0
// 4. 5,6,7
// 5. No
// 6. ii
// 7. Yes
// 8. No
// 9. / by zer0
// 10. java.lang.ArithmeticException: / by zero
//	   at NewBox.<init>(NewBox.java:18)
//	   at CallBox.main(CallBox.java:40)
// 11. No
// 12. Yes
// 13. Yes
// 14. Yes
// 15. 2.0
// 16. 5,6,7
// 17. 3
// 18. java.lang.ArrayIndexOutOfBoundsException: 3
//	   at NewBox.<init>(NewBox.java:24)
//	   at CallBox.main(CallBox.java:40)
// 19. Because myBox is created in the same line in both cases.
// 20. Yes

public class CallBox {

	public static void main(String[] args) {
		
		System.out.println("Main has started.");
		try {
			NewBox myBox = new NewBox(103);
		
		} catch (ArithmeticException problem) {
			
			System.out.println("The exception message: " + problem.getMessage());
			System.out.println();
			System.out.println("The call stack trace:");
			problem.printStackTrace();
			System.out.println();
		} catch (IndexOutOfBoundsException problem) {
			
			System.out.println("The exception message: " + problem.getMessage());
			System.out.println();
			System.out.println("The call stack trace:");
			problem.printStackTrace();
			System.out.println();
		}
		System.out.println("Main method is ending.");
	}

}
