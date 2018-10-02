public class LongestChainSequence {

    static void longestChainSequence(String s1, String s2, int l1, int l2) {
        int m[][] = new int[l1+1][l2+1];
        for (int i = 0; i < l1; i++) {
            m[i][0]=0;
            for (int j = 0; j < l2; j++) {
               m[0][j]=0;
            }
        } 
        for (int i = 1; i < l1; i++) {
            for (int j = 1; j < l2; j++) {
                if (s1[i] == s2[j]) {
                        
                }
            }
        }
    }

    public static void main(String... input) {
        String s1 = "abbbccd";
        String s2 = "acdd";
        int l1 = s1.length();
        int l2 = s2.length();
        longestChainSequence(s1, s2, l1, l2);
    }
}