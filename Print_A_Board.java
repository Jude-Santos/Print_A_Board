import java.util.Scanner;
/**
 * Write a description of class Print_A_Board here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Print_A_Board
{

   
    static String[][] Print_Board()
    {
        String[][] board = {{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"}};
        for (int x = 0; x < 7; x++) {
            for (int y = 0; y < 7; y++) {
                board[x][y] = "0";
            }
        } 
        return board;
    }

    static void printboard (String[][] board)  {
        for (int x = 0; x < 7; x++) {
            for (int y = 0; y < 7; y++) { 
                System.out.print("     " + board[x][y] + "     ");
            }
            System.out.println();
        }
    }
    
    static String[][] user_board(String[][] board) {
        int xPrint;
        int yPrint;
        Scanner myScanner = new Scanner(System.in);
        for(int x = 0; x < 7; x++) {
            for (int y = 0; y < 7; y++) {
                xPrint = x + 1;
                yPrint = y + 1;
                
                System.out.println("Please type the value you'd like for " + xPrint + "," + yPrint + ":  ");
                board[x][y] = myScanner.next();
            }
        }
        
        return board;
    }
    
    public static void main(String[] args) {
        boolean playAgain = true;
        boolean fillAnElement = true;
        int x,y;
        int number = 5;
        String[][] myBoard = {{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"}};
        int Element;
        Scanner myScanner = new Scanner(System.in);
        do {
            System.out.println(\u000C);
            System.out.println("There is a 7 by 7 board, but it currently full of 0's. You can make it whatever number you want. Go crazy!");
            myBoard = Print_Board();
            printboard(myBoard);
            
            System.out.println("Would you like to do this again?");
            playAgain = myScanner.nextBoolean();
        } while (playAgain);
    }
}
        