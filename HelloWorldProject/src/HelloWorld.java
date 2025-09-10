import java.util.Scanner;

/*
 * Name: Nick Griffith
 * Date: 9/9/25
 * Class Period: 6
 * Program Description: simple "Hello, World" program, asking for users name
 */
public class HelloWorld {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name: ")
		String name = in.next();
		System.out.println(String.format("Hello, %s!", name));
	}

}
// ready for grading 9/9
