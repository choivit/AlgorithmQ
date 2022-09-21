package baekjoon_9498_answer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int testNum = sc.nextInt();
       if(testNum>=90){
           System.out.println("A");
        }else if(testNum>=80){
           System.out.println("B");
       }else if(testNum>=70){
           System.out.println("C");
       }else if(testNum>=60){
           System.out.println("D");
       }else{
           System.out.println("F");
       }
    }
}
