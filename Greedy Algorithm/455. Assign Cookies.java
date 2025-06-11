class Solution {
    public int findContentChildren(int[] g, int[] s) {
        // Sort the greed factor array (g) and the cookie sizes array (s)
        Arrays.sort(g); 
        Arrays.sort(s);

        int r = 0; // Pointer for children (index in greed array)
        int l = 0; // Pointer for cookies (index in size array)

        // Loop until we run out of either cookies or children
        while (l < s.length && r < g.length) {
            // If the current cookie can satisfy the current child
            if (g[r] <= s[l]) {
                r++; // Move to the next child (child is content)
            }
            l++; // Move to the next cookie
        }

        // Return the number of content children
        return r;
    }
}
