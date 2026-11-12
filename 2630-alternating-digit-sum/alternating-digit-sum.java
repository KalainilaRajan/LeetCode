class Solution {
    public int alternateDigitSum(int n) {

        int divisor = 1;
        while(n / divisor >= 10) {
            divisor = divisor * 10;
        }
        int sum = 0;
        int sign = 1;
        while(divisor > 0) {
            int digit = n / divisor;
            sum = sum + (digit * sign);
            n = n % divisor;
            divisor = divisor / 10;

            sign = sign * -1;
        }

        return sum;
    }
}