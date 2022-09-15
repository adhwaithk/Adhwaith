package stackjava;
import java.util.Stack;

public class stackjava {

	public static void main(String[] args) {
		Stack<Integer>stack=new Stack<>();
		stack.push(10);
		stack.push(11);
		stack.push(12);
		stack.push(13);
		System.out.println("stack: "+stack);
		System.out.println("popped element: "+stack.pop());
		

	}

}
