import java.util.Arrays;
import java.util.List;

public class KeyBoard {
  
    String divide[];        
    words generate = new words();

    void BreakApart() {
          String t = generate.ChoseWord();
          divide =  t.split("");
          System.out.println(Arrays.toString(divide));        
  
    }
    void Read(String[]value) {
        long StTime = System.currentTimeMillis();
        if(Arrays.equals(divide,value)) {
             long EndTime = System.currentTimeMillis();
             System.out.println("100% correct" + (StTime - EndTime));      
        } else {
            long EndTime = System.currentTimeMillis();
            System.out.println("Wrong!" + (StTime - EndTime));

        }
    }     
     
}
