import java.util.*;

//Stack is a first in last out
public class StackForString
{
    public static void main(String[] ArrayListString)
    {
        Stack<String> stackString= new Stack<>();

        //This will be push element in stack
        stackString.push("stack one");
        stackString.push("stack two");
        stackString.push("stack three");
        stackString.push("stack four");

        System.out.println("Stack: "+stackString);
        

        //This will be which element on top
        System.out.println(stackString.peek());


        //This will be remove the element
        System.out.println(stackString.pop());
        

    }
}