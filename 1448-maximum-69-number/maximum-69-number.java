
class Solution {
    public int maximum69Number(int num) {

        int temp = num;
        int max = num;
        int count = 0;
        int org = num;

        // Count digits
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        // Select each position
        for (int pos = 1; pos <= count; pos++) {

            int div = 1;

            // Calculate divisor
            for (int d = 1; d <count; d++) {
                div = div * 10;
            }

            int val = 0;

            // Extract and rebuild digits
            for (int i = 1; i <= count; i++) {

                int digit = (org / div) % 10;

                if (i == pos && digit == 6) {
                    digit = 9;
                }

                val = (val * 10) + digit;

                if (i < count) {
                    div = div / 10;
                }
            }

            // Find maximum
            if (val > max) {
                max = val;
            }
        }

        return max;
    }
}
