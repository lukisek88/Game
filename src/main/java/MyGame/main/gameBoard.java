package MyGame.main;

import java.util.Random;
import java.util.Scanner;

public class gameBoard {

    public gameBoard() {
        char[][] board =
                {{' ', ' ', ' '},
                        {' ', ' ', ' '},
                        {' ', ' ', ' '}};


        printBoard(board);
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
while (!check) {

for (int a = 1; a <=4;a++){
    check= true;
    System.out.println("");
    playerTurn(board, scanner);
    aiTurn(board);
    printBoard(board);
}




}
    }

    private void printBoard(char[][] board) {
        System.out.println("-----------");
        System.out.print("|");
        System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2] + "|");
        System.out.print("|");
        System.out.println("--+---+--|");
        System.out.print("|");
        System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2] + "|");
        System.out.print("|");
        System.out.println("--+---+--|");
        System.out.print("|");
        System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2] + "|");
        System.out.print("-----------");
    }

    private void playerTurn(char[][] board, Scanner scanner) {
        String user = scanner.nextLine();

     switch (user) {
         case "1":
             if (board[0][0] == ' ') {
                 board[0][0] = 'x';
                 break;
             } else {
                 System.out.println("Place Occupatied");
                 break;
             }
         case "2":
             if (board[0][1] == ' ') {
                 board[0][1] = 'x';
                 break;
             } else {
                 System.out.println("Place Occupatied");
                 break;
             }
         case "3":
             if (board[0][2] == ' ') {
                 board[0][2] = 'x';
                 break;
             } else {
                 System.out.println("Place Occupatied");
                 break;
             }
         case "4":
             if (board[1][0] == ' ') {
                 board[1][0] = 'x';
                 break;
             } else {
                 System.out.println("Place Occupatied");
                 break;
             }
         case "5":
             if (board[1][1] == ' ') {
                 board[1][1] = 'x';
                 break;
             } else {
                 System.out.println("Place Occupatied");
                 break;
             }
         case "6":
             if (board[1][2] == ' ') {
                 board[1][2] = 'x';
                 break;
             } else {
                 System.out.println("Place Occupatied");
                 break;
             }
         case "7":
             if (board[2][0] == ' ') {
                 board[2][0] = 'x';
                 break;
             } else {
                 System.out.println("Place Occupatied");
                 break;
             }
         case "8":
             if (board[2][1] == ' ') {
                 board[2][1] = 'x';
                 break;
             } else {
                 System.out.println("Place Occupatied");
                 break;
             }
         case "9":
             if (board[2][2] == ' ') {
                 board[2][2] = 'x';
                 break;
             } else {
                 System.out.println("Place Occupatied");
                 break;
             }
         default:
             System.out.println("Error");


     }
 }



    private void aiTurn(char[][]board) {


        Random rng = new Random();


        int aiType = rng.nextInt(1,9);
            switch (aiType) {

                case 1:
                    if (board[0][0] == ' ') {
                        board[0][0] = 'O';
                        System.out.println("Choose:" +aiType);
                        break;
                    } else {
                        System.out.println(aiType);

                    }

                case 2:
                    if (board[0][1] == ' ') {
                        board[0][1] = 'O';
                        System.out.println("Choose:" +aiType);
                        break;
                    } else {
                        System.out.println(aiType);

                    }
                case 3:
                    if (board[0][2] == ' ') {
                        board[0][2] = 'O';
                        System.out.println("Choose:" +aiType);
                        break;
                    } else {
                        System.out.println(aiType);

                    }
                case 4:
                    if (board[1][0] == ' ') {
                        board[1][0] = 'O';
                        System.out.println("Choose:" +aiType);
                        break;
                    } else {
                        System.out.println(aiType);

                    }
                case 5:
                    if (board[1][1] == ' ') {
                        board[1][1] = 'O';
                        System.out.println("Choose:" +aiType);
                        break;
                    } else {
                        System.out.println(aiType);

                    }
                case 6:
                    if (board[1][2] == ' ') {
                        board[1][2] = 'O';
                        System.out.println("Choose:" +aiType);
                        break;
                    } else {
                        System.out.println(aiType);


                    }
                case 7:
                    if (board[2][0] == ' ') {
                        board[2][0] = 'O';
                        System.out.println("Choose:" +aiType);
                        break;
                    } else {
                        System.out.println(aiType);

                    }
                case 8:
                    if (board[2][1] == ' ') {
                        board[2][1] = 'O';
                        System.out.println("Choose:" +aiType);
                        break;
                    } else {
                        System.out.println(aiType);

                    }
                case 9:
                    if (board[2][2] == ' ') {
                        board[2][2] = 'O';
                        System.out.println("Choose:" +aiType);
                        break;
                    } else {
                        System.out.println(aiType);

                    }

                default:
                    System.out.println("AI Error");







        }



    }





}
