import java.util.Arrays;
public class KeyBoard {
  
    String divide[];        
    words generate = new words();

    void BreakApart() {
          String t = generate.ChoseWord();
          divide =  t.split("");
          System.out.println(Arrays.toString(divide));        
  
    }
      
     
}
