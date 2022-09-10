public class Palindrome2 {
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                if (isPalin(s, i + 1, j) || isPalin(s, i, j - 1)) {
                    return true;
                }
            }
            i++;
            j--;
        }
        return true;
    }

    private boolean isPalin(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;

        }
        return true;
    }
}