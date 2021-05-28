public class ExtractVowel {
    /**
     * Extract the vowels from the input string.
     * For example, extractVowel("i love you 3000") → "ioeou".
     * @param str is the input string.
     * @return the vowels of the input string.
     */
    public static String extractVowel(String str) {
		// call your recursive helper method
        return extractVowelHelper(str, 0, "");
    }

    private static String extractVowelHelper(String str, int start, String vowels) {
        // base case
        if(start==str.length())
            return "";
		
		
        // recursive step
        if(isVowel(str.charAt(0)))
		    return str.charAt(0)+extractVowelHelper(str.substring(1),start,vowels+str.charAt(0));
        return extractVowelHelper(str.substring(1),start,vowels+str.charAt(0));

    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
