class Solution {
public:
    vector<int> getRow(int rowIndex) {
        vector<int> row;
        long value = 1;
        row.push_back(1); // First element is always 1

        for (int k = 1; k <= rowIndex; ++k) {
            value = value * (rowIndex - k + 1) / k;
            row.push_back((int)value);
        }

        return row;
    }
};
