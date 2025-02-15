package rought;

public class Queen {
    public static void main(String[] args) {
        int n = 4;
        boolean [][] board = new boolean[n][n];
        rani(board,0);

    }
    static void rani(boolean board[][], int r){
        if (r == board.length){
            display(board);
            return;
        }

        for (int c = 0; c < board[0].length; c++) {
            if (isSafe(board,r,c)){
                board[r][c]=true;
                rani(board,r+1);
                board[r][c] = false;
            }
        }

    }

    private static boolean isSafe(boolean board[][], int r,int c) {
        for (int i = 0; i <r ; i++) {
            if(board[i][c]){
                return false;
            }
        }

        int maxL=Math.min(r,c);
        for (int i = 1; i <=maxL ; i++) {
            if (board[r-i][c-i]){
                return false;
            }

        }

        int maxR = Math.min(r,board.length-c-1);
        for (int i = 1; i <=maxR ; i++) {
            if (board[r-i][c+i]){
                return false;
            }
        }
        return true;
    }

    private static void display(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j]){
                    System.out.print("Q ");
                }else System.out.print("X ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
