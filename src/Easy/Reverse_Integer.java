package Easy;

/**
 * Input: x = 123 <br>
 * Output: 321
 */

public class Reverse_Integer {

    public static long reverse(long x) {
        if (x >= 0)
            return Long.parseLong(new StringBuilder(x + "").reverse().toString());

        long revNum = Long.parseLong(new StringBuilder(String.valueOf(x).replace("-", "")).reverse().toString());

        return revNum * -1;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
    }
}
