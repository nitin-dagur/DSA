#include <cctype>
#include <iostream>
#include <stack>
#include <string>

class Solution {
public:
    int calculate(const std::string& s) {
        int len = s.size();
        int sgn = 1;     // Current sign
        int val = 0;     // Accumulated value
        int num = 0;     // Current number being parsed
        std::stack<int> st;

        for (size_t i = 0; i < len; ++i) {
            char c = s[i];
            if (c == ' ') {
                continue;
            } else if (std::isdigit(c)) {
                num = num * 10 + (c - '0');
                // Apply the number if the next character is not a digit
                if (i == len - 1 || !std::isdigit(s[i + 1])) {
                    val += sgn * num;
                    num = 0;
                }
            } else if (c == '+') {
                sgn = 1;
            } else if (c == '-') {
                sgn = -1;
            } else if (c == '(') {
                // Save current context
                st.push(val);
                st.push(sgn);
                val = 0;
                sgn = 1;
            } else if (c == ')') {
                val = val * st.top(); st.pop(); // Apply saved sign
                val += st.top();      st.pop(); // Add saved result
            }
        }

        return val;
    }
};
