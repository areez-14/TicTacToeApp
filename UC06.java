public class UC06 {
    static char[][] board = new char[3][3];

    public static void main(String[] args) {
        initializeBoard();
        placeMove(0,0, 'X');
        System.out.println(board[0][0]);
    }
    static void initializeBoard(){
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
                board[i][j] = '-';
            }
        }
    }
    static void placeMove(int row,int col,char symbol){
        board[row][col] = symbol;
    }
}
