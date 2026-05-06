import java.util.Random;

public class UC07 {
    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    static char computerSymbol = '0';

    public static void main(String[] args) {
        computerMove();
        printBoard();

    }
    static void computerMove(){
        Random random = new Random();

        while(true){
            int slot = random.nextInt(9) + 1;
            int row = getRowFromSlot(slot);
            int col = getColFromSlot(slot);

            if(isValidMove(row,col)){
                placeMove(row,col,computerSymbol);
                System.out.println("Computer selected slot: " + slot);
                break;
            }
        }
    }

     static int getRowFromSlot(int slot){
        return(slot - 1) / 3;
    }

    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }

    static boolean isValidMove(int row,int col){
        if(row < 0 || row > 2 || col < 0 || col > 2){
            return false;
        }
        return board[row][col] == '-';
    }

    static void placeMove(int row,int col,char symbol){

        board[row][col] = symbol;

    }

    static void printBoard(){

        System.out.println("-------------");

        for(int row = 0;row < 3;row++){

            System.out.print("| ");

            for(int col = 0;col < 3;col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
}
