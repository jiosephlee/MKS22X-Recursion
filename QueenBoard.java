public class QueenBoard{
    private int[][]board;

    public QueenBoard(int size){
        board = new int[size][size];
    }

    private boolean addQueen(int r,int c){
        board[r][c] = -1;
    }

    private boolean removeQueen(int r, int c){
        board[r][c] = 0;
    }        


    public String toString(){
        String output = "";
        for(int i = 0;i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j]_== -1){
                    output += 'Q';
                } else{
                    output+= '_';
                }
            }
            output += '\n';
        }
    }

    public boolean solve(){

    }

    public int countSolutions(){

    }
}
