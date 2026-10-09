package lab3;
import java.util.Scanner;
public class stackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackReferenceBased stack1 = new StackReferenceBased();
		stackTest stackObTest = new stackTest();
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		
		int number = 0;
		
		
		//stack1.push("Milk");
		//stack1.push("Eggs");
		//stack1.push("Chicken");
		//stack1.push("Pizza");
		
		//stack1.displayStack();
		String letter;
		//System.out.print(stackObTest.isBlanced("{}"));
		
		//System.out.println(isBlanced("{}"));
		while(number != 6) {
			
		System.out.println("Welcome to StackTest! Please select a number from the list: "
				+ "\n1. Push a string on to the stack"
				+ "\n2. Pop a string from the stack"
				+ "\n3. Peek at the top of the stack"
				+ "\n4. Empty the stack"
				+ "\n5. Check if a string has balanced brackets"
				+ "\n6. Quit the program");
		if(number == 1) {
			System.out.println("Enter an item: ");
			letter = scanner2.nextLine();
			stack1.push(letter);
		}
		
		else if(number == 2) {
			stack1.pop();
		}
		
		else if(number == 3) {
			stack1.peek();
		}
		
		else if(number == 4) {
			stack1.isEmpty();
		}
		else if(number == 5) {
			//stack1.isBlanced(); 
		}
		number = scanner.nextInt();
		}
		System.out.print("End");
		
	}
	
	//I definitely did this part wrong. 
	
	  public static boolean isBlanced(String s) {
		  StackReferenceBased stack = new StackReferenceBased();
		  int x = 0;
		  while(x < s.length()) {
			  char ch = s.charAt(x);
			  if(ch == '{') {
				  stack.push(ch);
				  
			  }
			  
			  else if(ch == '}') {
				  if(!stack.isEmpty()) {
					  stack.pop();
				  }
				  else {
					  return false;
				  }
	
			  }
			 x++; 
		  }
		  return stack.isEmpty();
	  }

}
