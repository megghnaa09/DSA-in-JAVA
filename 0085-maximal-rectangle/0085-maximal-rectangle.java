class Solution {
    public ArrayList<Integer> NSL(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (st.isEmpty())
                ans.add(-1);
            else
                ans.add(st.peek());

            st.push(i);
        }
        return ans;
    }
    public ArrayList<Integer> NSR(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (st.isEmpty())
                ans.add(n);
            else
                ans.add(st.peek());

            st.push(i);
        }
        Collections.reverse(ans);
        return ans;
    }
    public int getMaxArea(int[] arr) {
        ArrayList<Integer> left = NSL(arr);
        ArrayList<Integer> right = NSR(arr);
        int maxArea = 0;
        for (int i = 0; i < arr.length; i++) {
            int width = right.get(i) - left.get(i) - 1;
            int area = arr[i] * width;
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0)
            return 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] height = new int[cols];
        int maxArea = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == '1')
                    height[j]++;
                else
                    height[j] = 0;
            }

            maxArea = Math.max(maxArea, getMaxArea(height));
        }

        return maxArea;
    }
}