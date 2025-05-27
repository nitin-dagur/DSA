class Solution {
public:
    int minDepth(TreeNode* root) {
        if (!root) return 0;

        queue<pair<TreeNode*, int>> q;
        q.push({root, 1});

        while (!q.empty()) {
            TreeNode* node = q.front().first;
            int depth = q.front().second;
            q.pop();

            // If it's a leaf node, return the depth
            if (!node->left && !node->right) {
                return depth;
            }

            if (node->left) q.push({node->left, depth + 1});
            if (node->right) q.push({node->right, depth + 1});
        }

        return 0; // Never reached, just for completeness
    }
};
