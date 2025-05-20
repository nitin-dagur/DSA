class Solution {
public:
    bool checkValidString(string s) {
        int minOpen = 0; // minimum possible '(' count
        int maxOpen = 0; // maximum possible '(' count

        for (char c : s) {
            if (c == '(') {
                minOpen++;
                maxOpen++;
            } else if (c == ')') {
                minOpen--;
                maxOpen--;
            } else { // c == '*'
                minOpen--;     // treat '*' as ')'
                maxOpen++;     // treat '*' as '('
            }

            if (maxOpen < 0) return false; // Too many ')'
            if (minOpen < 0) minOpen = 0;  // We can't have negative opens
        }

        return minOpen == 0;
    }
};
