import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class app {
       
     public static void main(String[] args) {
         String[] teste;
         KeyBoard  key = new KeyBoard();
         words w = new words(); 
         Scanner input = new Scanner(System.in);
         w.ChoseWord();
         key.BreakApart();
         System.out.println("word");
         String test = input.next();
         teste = test.split("");
         key.Read(teste);
         

     }
}

