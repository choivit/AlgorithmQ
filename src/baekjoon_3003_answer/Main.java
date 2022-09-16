package baekjoon_3003_answer;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String totalNum = "";

        int king = scanner.nextInt();
        int addNumK = 1 - king;
        totalNum += Integer.toString(addNumK) + " ";
        //
        int queen = scanner.nextInt();
        int addNumQ = 1 - queen;
        totalNum += Integer.toString(addNumQ) + " ";
        //
        int rook = scanner.nextInt();
        int addNumR = 2 - rook;
        totalNum += Integer.toString(addNumR) + " ";
        //
        int bishop = scanner.nextInt();
        int addNumB = 2 - bishop;
        totalNum += Integer.toString(addNumB) + " ";
        //
        int knight = scanner.nextInt();
        int addNumN = 2 - knight;
        totalNum += Integer.toString(addNumN) + " ";
        //
        int pawn = scanner.nextInt();
        int addNumP = 8 - pawn;
        totalNum += Integer.toString(addNumP);

        System.out.println(totalNum);
    }
}
