

import java.util.Stack;

public class Redundant_Brackets {
    public static boolean findRedundantBrackets(String s) 
    {
        // Write your code here.
        Stack<Character>stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch==')'){
                boolean isoperator=false;
                while(!stack.isEmpty() && stack.peek()!='('){
                    char top=stack.pop();

                    if(top=='+' || top=='-' || top=='*' || top=='/')isoperator=true;
                }
                stack.pop();

                if(!isoperator){
                    return true;
                }
            }else{
                stack.push(ch);
            }
        }
        return false;
    }
}
