import java.util.HashSet;
import java.util.Set;

public class isValidSoduku {
    public static boolean isValid(char[][] board) {
        Set seen = new HashSet();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char n = board[i][j];
                if(n!='.'){
                    if(!seen.add(n + "row" + i)&&!seen.add(n+"column"+j)&&!seen.add(n+"row"+i/3+"and"+j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] ch = {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}} ;
        System.out.println(isValid(ch));
    }
}
