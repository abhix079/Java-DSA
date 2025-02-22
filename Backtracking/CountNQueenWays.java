public class CountNQueenWays {

    public static boolean isSafe(char board[][],int row,int col){
        //Vertical up


        for (int i=row;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //Diagonal left Up

        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //Diagonal left Up
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;

    }
    public static void nQueen(char board[][], int row){
    
        //base case

        if(row==board.length){
            count++;
            return;
        }

//column lop
        for(int j=0;j<board.length;j++){
            if(isSafe(board, row, j)){
            board[row][j]= 'Q'; // yha pr queen k baithayenge
            nQueen(board, row+1); //recursive call............// dosare queen ko dosare row me baithane ke liye call lagayenge
            board[row][j] ='x'; //backtracking step..........// backtrack krte wqt agr koi queen already us row me hai to hta denge as 2 queen ek row me nhi rh skti
            }

        }

    }

   static int count=0;
    public static void main(String[] args) {
        int n =4;
        char board[][]= new char[n][n];
        //initialize 

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x'; 
            }
        }
        nQueen(board,0);
        System.out.println("Total ways to solve n quenn is: " +count);
    }
    
}
