class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // List to store the BFS traversal result
        ArrayList<Integer> result = new ArrayList<>();

        // Queue for BFS traversal
        Queue<Integer> q = new LinkedList<>();

        // Boolean array to mark visited nodes
        boolean[] vis = new boolean[adj.size()];

        // Start BFS from node 0
        q.add(0);
        vis[0] = true;

        // Traverse while queue is not empty
        while (!q.isEmpty()) {
            // Get the current node from queue
            int curr = q.remove();

            // Add current node to result
            result.add(curr);
            vis[curr] = true;

            // Visit all unvisited neighbors of current node
            for (int neighbor : adj.get(curr)) {
                if (!vis[neighbor]) {
                    // Mark neighbor as visited and add to queue
                    vis[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }

        // Return BFS traversal result
        return result;
    }
}
