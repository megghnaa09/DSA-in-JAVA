    class Solution {
        public boolean isSafe(char board[][], int row, int col, int n){
            //check same col
            for(int i=0; i<row; i++){
                if(board[i][col]=='Q') return false;
            }
            //check upper left diag
            for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
                if(board[i][j]=='Q') return false;
            }
            //check upper right diag
            for(int i=row-1, j=col+1;i>=0 && j<n; i--, j++ ){
                if(board[i][j] =='Q') return false;
            }
            return true;
        }
        public void solve(char board[][], int row, int n, List<List<String>> ans){
            //basecase
            if(row==n){
                List<String> temp= new ArrayList<>();
                for(int i=0; i<n; i++){
                    temp.add(new String (board[i]));
                }
                ans.add(temp);
                return;
            }
            //check if its safe
            //try placing queen in every column
            for(int col=0; col<n; col++){
                if(isSafe(board, row, col, n)){
                    board[row][col]='Q';
                    solve(board, row+1, n, ans);
                    //backtrack
                    board[row][col]='.';
                }
            }
        }
        public List<List<String>> solveNQueens(int n) {
            List<List<String>> ans = new ArrayList<>();
            char board[][]= new char[n][n];
            for(int i=0; i<n; i++){
                Arrays.fill(board[i],'.');
            }
            int row = 0;
            solve(board, row, n, ans);
            return ans;
        }
    }