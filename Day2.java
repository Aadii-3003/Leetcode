import java.util.Arrays;

public class Day2 {

    public static void main(String[] args) {

        Day2 obj = new Day2();

        String s = "listen";
        String t = "silent";

        boolean result = obj.isAnagram(s, t);

        System.out.println("Is Anagram: " + result);
    }

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}