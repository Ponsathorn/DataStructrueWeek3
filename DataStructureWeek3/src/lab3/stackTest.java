package lab3;
import java.util.Scanner;
public class stackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackReferenceBased stack1 = new StackReferenceBased();
		Scanner scanner = new Scanner(System.in);
		
		stack1.push("Milk");
		stack1.push("Eggs");
		stack1.push("Chicken");
		stack1.push("Pizza");
		
		stack1.displayStack();
	}

}
