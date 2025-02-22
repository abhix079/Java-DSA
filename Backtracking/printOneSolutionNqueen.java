public class printOneSolutionNqueen {
    

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
    public static boolean nQueen(char board[][], int row){
    
        //base case

        if(row==board.length){
            printBoard(board);
            return true;
        }

//column lop
        for(int j=0;j<board.length;j++){
            if(isSafe(board, row, j)){
            board[row][j]= 'Q'; // yha pr queen k baithayenge
            if(nQueen(board, row+1)){
                return true;
            } //recursive call............// dosare queen ko dosare row me baithane ke liye call lagayenge
            board[row][j] ='x'; //backtracking step..........// backtrack krte wqt agr koi queen already us row me hai to hta denge as 2 queen ek row me nhi rh skti
            }
            

        }
        return false;

    }

    public static void printBoard(char board[][]){
        System.out.println("-------------chessBoard------------");
        for (int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
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
    }
}
