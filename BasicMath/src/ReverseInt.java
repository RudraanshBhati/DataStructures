
public class ReverseInt {

    public int reverse(int x) {
        long ans = 0;
        int lastDigi;
        while(x != 0)
        {
            lastDigi = x%10;
            x = x/10;
            ans = (ans * 10) + lastDigi;
        }

        if(x<0)
        {
            return (int)(-1*ans);
        }

        if(ans > Integer.MAX_VALUE|| ans < Integer.MIN_VALUE )
        {
            return 0 ;
        }
        return (int)ans ;
    }
}