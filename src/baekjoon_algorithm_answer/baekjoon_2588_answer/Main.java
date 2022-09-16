package baekjoon_algorithm_answer.baekjoon_2588_answer;

import java.util.Scanner;

public class Main{
    public static void main(String[] arg){
        
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println(a * (b % 10));
        System.out.println(a * ((b % 100) / 10));
        System.out.println(a * (b / 100));
        System.out.println(a*b);
        
        s.close();
    }  
}