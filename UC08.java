public class UC08 {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    public static void main(String[] args) {

        int turnCount = 0;

        while(!gameOver){

            if (isHumanTurn){
                System.out.println("Human player's turn");
            } 
            else{
                System.out.println("Computer player's turn");
            }
            System.out.println("Move played");

            turnCount++;

            if (turnCount == 5) {
                System.out.println("Game Over");
                gameOver = true;
            } 
            else {
                isHumanTurn = !isHumanTurn;
            }
        }
    }
}
