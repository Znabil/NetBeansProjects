
package tic.tac.toe;

/**
 * my new tic tac toe console game
 * @author NABIL AZIZ
 */
import java.util.Scanner;
import javafx.application.Application;
        
        
        
        
public class TTT {
 public static int row, col;
 public static Scanner scan = new Scanner(System.in);

    /**
     *creation d'un objet de type array avec une dimension variable selon le besoin d'utilisateur
     */
 public static  char [][] board ;
 public static char turn = 'X';
 public static int boardsz;

 public static void main(String [] args){
     System.out.println("this game is presented by nabil aziz");
    System.out.println("welcome to the 3 X 3 tic tac toe console game" );
    boardsz = 3 ; 
    board = new char [boardsz][boardsz];      
    for(int r = 0 ; r < boardsz  ; r++){
         for(int c = 0 ; c < boardsz ; c++){          
           board[r][c]='_';             
         }    
    }
     Play();
     
 }
  
 public static void Play(){
    boolean playing = true;
    PrintBoard();
    System.out.println();
    while (playing){
         do{ System.out.print("player "+turn + " please enter a row number Between 1 and 3:");
            row = scan.nextInt() -1;}
            while (row < 0 || row > 3);
      
         do {System.out.print("please enter a colone number Between 1 and 3 : ");
            col = scan.nextByte() -1;}
             while(col < 0 || col > 3); 
      
        board[row][col] = turn;   
        if(GameOver(row,col)) {
        playing = false;
        System.out.println();
        System.out.println("Game Over !! the player " + turn +" wins the turn");
        Play();
    }
        PrintBoard();
     System.out.println();
     if (turn == 'X' ){
            turn = 'O';
        }else turn = 'X' ;
    }
 }
 
 public static  void PrintBoard(){
    for (int r = 0 ; r < boardsz  ; r++){
        System.out.println();
        for(int c = 0 ; c <boardsz  ; c++){
            if ( c == 0) System.out.print("| ");
            System.out.print(board[r][c] + " | ");
        }
    }
    System.out.println();
    }
 
 public static boolean GameOver(int rmove,int cmove){
    // check prepecendal vectory
         
    if( board [0][cmove] == board [1][cmove]
            && board [1][cmove] == board [2][cmove]) return true ;
    else if( board [rmove][0]== board [rmove][1]
            && board [rmove][1] == board[rmove][2] ) return true ;
    // check diagonal vectory
    else if(board[0][0] == board [1][1]
        && board[1][1] == board [2][2] && board[1][1] != '_') return true;
    else if(board[2][0] == board[1][1]
            && board[0][2] == board [1][1] && board[1][1] != '_') return true;
    
     return false;
     }
}
