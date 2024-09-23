public class Demo {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>(5);
        System.out.println(s.isEmpty());
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());
    }
}