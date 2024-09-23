public class InfixToPostfix {
    public static void main(String[] args) {

        String exp = "a + b * (d + e)";
        System.out.println(exp);
        String ans = infixToPost(exp);
        System.out.println(ans);


    }

    static String infixToPost(String exp) {

        StringBuilder result = new StringBuilder();


        Stack<Character> stack = new Stack<>(100);


        for (int i = 0; i < exp.length(); i++)
        {
            char c = exp.charAt(i);


            if (Character.isLetterOrDigit(c))
            {
                result.append(c);
            }
            else if (c == '(')
            {
                stack.push(c);
            }
            else if (c == ')')
            {
                while (!stack.isEmpty() && stack.peek() != '(')
                {
                    result.append(stack.pop());
                }
                stack.pop();
            }
            else if (isOperator(c))
            {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek()))
                {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }


        while (!stack.isEmpty())
        {
            result.append(stack.pop());
        }

        return result.toString();
    }
    static int precedence(char c) {
        if(c == '+' || c == '-')
        {
            return 1;
        }
        else if(c == '*' || c == '/')
        {
            return 2;
        }
        else if(c == '^')
        {
            return 3;
        }
        return -1;
    }
    static boolean isOperator(char ch) {
        return (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^');
    }
}