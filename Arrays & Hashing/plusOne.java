public class plusOne {
    public static void main(String[] args) {
        int[] digits = { 9, 1, 8, 0, 9, 9 };
        int[] result = plusOne2(digits);

        for (int i : result) {
            System.out.print(i + " ");
        }

    }

    public static int[] plusOne2(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }
}