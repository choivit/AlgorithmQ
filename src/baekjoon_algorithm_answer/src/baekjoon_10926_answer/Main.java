import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        String nickNm = s.nextLine();
        String newNickNm = nickNm;
        
        if(nickNm.equals(newNickNm)){
            System.out.println(nickNm + "??!");
        }
    }
}