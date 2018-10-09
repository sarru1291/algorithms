public class NaiveStringMatching {

    static void naiveStringMatching(String text, String pattern) {
        int textLength = text.length();
        int patternLength = pattern.length();
        int i, j;
        for (i = 0; i <= textLength - patternLength; i++) {
            // for (j = 0; j < patternLength; j++) {
            // if (text.charAt(i + j) != pattern.charAt(j))
            // break;
            // }
            // if (j == patternLength) {
            // System.out.println("Pattern found at index: " + i);
            // }
            int z = i;
            int count = 0;
            for (j = 0; j < patternLength; j++) {
                if (text.charAt(z) == pattern.charAt(j)) {
                    z++;
                    count++;
                }
            }
            if (count == patternLength) {
                System.out.println("Pattern fount at index: " + i);
            }
        }
    }

    public static void main(String... input) {
        String text = input[0];
        String pattern = input[1];
        naiveStringMatching(text, pattern);
    }
}