class Solution {
    public int clumsy(int n) {

        int result = 0;
        int fact = n;
        int count = 0;

        for (int i = n - 1; i > 0; i--) {

            if (count % 4 == 0) {
                fact = fact * i;
            }
            else if (count % 4 == 1) {
                fact = fact / i;
            }
            else if (count % 4 == 2) {
                result = result + fact;
                fact = i;
            }
            else {
                result = result + fact;
                fact = -i;
            }

            count++;
        }

        return result + fact;
    }
}