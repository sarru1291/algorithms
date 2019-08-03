
// 2. It is a Finite automata string matching for a any pattern.

public class FiniteAutomataStringMatching {

    static int no_of_alphabets = 256;

    static int getNextState(char[] pat, int M, int state, int x) {

        if (state < M && x == pat[state])
            return state + 1;

        int ns, i;

        for (ns = state; ns > 0; ns--) {
            if (pat[ns - 1] == x) {
                for (i = 0; i < ns - 1; i++)
                    if (pat[i] != pat[state - ns + 1 + i])
                        break;
                if (i == ns - 1)
                    return ns;
            }
        }

        return 0;
    }

    static void computeTF(char[] pat, int M, int TF[][]) {
        int state, x;
        for (state = 0; state <= M; ++state)
            for (x = 0; x < no_of_alphabets; ++x)
                TF[state][x] = getNextState(pat, M, state, x);
    }

    static void finiteAutomataStringMatching(char[] pattern, char[] text) {

        int[][] tf = new int[pattern.length + 1][no_of_alphabets];
        computeTF(pattern, pattern.length, tf);

        int i, state = 0;
        for (i = 0; i < text.length; i++) {
            state = tf[state][text[i]];
            if (state == pattern.length)
                System.out.println("Pattern found at: " + (i - pattern.length + 1));
        }

    }

    public static void main(String... input) {
        String userPattern = input[0];
        String userText = input[1];
        System.out.println("Text: " + userText);
        System.out.println("Pattern: " + userPattern);
        char[] text = userText.toCharArray();
        char[] pattern = userPattern.toCharArray();
        System.out.println();
        finiteAutomataStringMatching(pattern, text);
    }
}