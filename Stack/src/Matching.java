public class Matching {

    public static boolean areMatching(String line) {
        Stack<Character> s = new Stack<>(100);

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {

                if (s.isEmpty() || !isMatchingPair(s.pop(), ch)) {
                    return false;
                }
            }
        }

        return s.isEmpty();
    }

    private static boolean isMatchingPair(char opening, char closing) {

        if(opening == '(' && closing == ')'||opening == '{' && closing == '}' ||opening == '[' && closing == ']')
        {
            return true;
        }
        return false;


    }

    public static void main(String[] args) {
        String expression1 = "((())";
        String expression2 = "((({})))";
        String expression3 = "({[}])";

        System.out.println(expression1 + " is balanced: " + areMatching(expression1));
        System.out.println(expression2 + " is balanced: " + areMatching(expression2));
        System.out.println(expression3 + " is balanced: " + areMatching(expression3));
    }
}