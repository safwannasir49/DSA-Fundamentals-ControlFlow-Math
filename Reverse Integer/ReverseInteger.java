class Solution {
    public int reverse(int n) {
        int reverse = 0;
        while (n != 0) {
            int digit = n % 10;
            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && digit > 7))
                return 0;
            if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && digit < -8))
                return 0;

            reverse = reverse * 10 + digit;
            n /= 10;
        }
        return reverse;
    }
}
