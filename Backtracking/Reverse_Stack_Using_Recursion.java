import java.util.*;

public class Reverse_Stack_Using_Recursion {
    public static void reverseStack(Stack<Integer> stack) {
		if(stack.isEmpty()){
            return;
        }

        int top=stack.pop();
        reverseStack(stack);
        pushatbottom(stack,top);
		
	}
    public static void pushatbottom(Stack<Integer>stack ,int num){
        if(stack.isEmpty()){
            stack.push(num);
            return;
        }

        int top=stack.pop();

        pushatbottom(stack,num);

        stack.push(top);
    }
}
