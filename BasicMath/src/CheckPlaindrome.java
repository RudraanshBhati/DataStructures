public class CheckPlaindrome {

        public boolean isPalindrome(int x) {
            int temp = x;
            int rev = 0;
            while(x > 0)
            {
                int lastDigit = x % 10;
                x = x/10;
                rev = (rev*10) + lastDigit;

            }
            return temp == rev;

        }
    }

