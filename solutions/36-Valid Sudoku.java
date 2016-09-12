//36. Valid Sudoku

public class Solution {

    public boolean isValidSudoku(char[][] a) {
        
        for(int i=0; i<=8; i++){
            if(!isDistinct(i,i,0,8,a) || !isDistinct(0,8,i,i,a) || !isDistinct((i/3)*3,(i/3)*3+2,(i%3)*3,(i%3)*3+2,a))
                return false;
        }
        return true;
    }
    
    public boolean isDistinct(int x1, int x2,int y1,int y2,char[][] board){
        
        boolean arr[]=new boolean[10];
        
        for (int i=x1; i<=x2; i++){
            for(int j=y1; j<=y2; j++){
                if(board[i][j] != '.'){
                    int no=board[i][j]-'0' ;
                    if(arr[no])
                        return false;
                    arr[no]=true;
                }
            }
        }
        return true;
    } 
}