import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fib(num));
    }

    public static int fib(int num)
    {
        if( num <= 1)
        {
            return 1;

        }
        else
        {

            return fib(num - 1) + fib(num -2);

        }
    }
}
