import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

class Solution {
    public String removeStars(String s) {
        Stack<Character>mystack =new Stack<>();
        StringBuilder str=new StringBuilder();
        for (char c:s.toCharArray())
        {
            if (c=='*')
            {
                mystack.pop();
            }
            else
                mystack.push(c);
        }
        while (!mystack.isEmpty())
        {
            str.append(mystack.pop());
        }
        str.reverse();
        return str.toString();
    }
}
