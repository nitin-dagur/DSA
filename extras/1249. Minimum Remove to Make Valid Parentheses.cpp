class Solution {
public:
    string minRemoveToMakeValid(string s) {
        string firstPass;
        int open = 0;

        // First pass: remove unmatched ')'
        for (char c : s) {
            if (c == '(') {
                open++;
                firstPass += c;
            } else if (c == ')') {
                if (open > 0) {
                    open--;
                    firstPass += c;
                }
                // else skip unmatched ')'
            } else {
                firstPass += c;
            }
        }

        // Second pass: remove unmatched '(' from the end
        string result;
        int close = 0;

        for (int i = firstPass.size() - 1; i >= 0; --i) {
            if (firstPass[i] == ')') {
                close++;
                result += firstPass[i];
            } else if (firstPass[i] == '(') {
                if (close > 0) {
                    close--;
                    result += firstPass[i];
                }
                // else skip unmatched '('
            } else {
                result += firstPass[i];
            }
        }

        // Reverse the result to get the correct order
        reverse(result.begin(), result.end());
        return result;
    }
};
