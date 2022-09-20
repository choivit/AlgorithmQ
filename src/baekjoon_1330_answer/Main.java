package baekjoon_1330_answer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String twoNum = sc.nextLine();
        String [] arrNum= twoNum.split(" ");
        int arr0 =  Integer.parseInt(arrNum[0]);
        int arr1 =  Integer.parseInt(arrNum[1]);
        //
        if(arr0 > arr1){
            System.out.println(">");
        }else if(arr0 < arr1){
            System.out.println("<");
        }else if(arr0 == arr1){
            System.out.println("==");
        }
    }
}
