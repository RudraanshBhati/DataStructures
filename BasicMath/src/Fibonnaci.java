import java.util.Scanner;
public class Fibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fibo(num));
    }

    public static int fibo(int num)
    {
        if( num <= 1)
        {
            return num;

        }
        else
        {

            return fibo(num - 1) + fibo(num -2);

        }
    }
}
