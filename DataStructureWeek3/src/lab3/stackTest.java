package lab3;
import java.util.Scanner;
public class stackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackReferenceBased stack1 = new StackReferenceBased();
		stackTest stackObTest = new stackTest();
		Scanner scanner = new Scanner(System.in);
		
		stack1.push("Milk");
		stack1.push("Eggs");
		stack1.push("Chicken");
		stack1.push("Pizza");
		
		stack1.displayStack();
		
		//System.out.print(stackObTest.isBlanced("{}"));
		
		System.out.println(isBlanced("{}"));
	}
	
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
