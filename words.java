import java.util.Random;
public class words {

    Random generate = new Random();
    String[] luck = {"banana","cinema","piano"};
    int value = generate.nextInt(luck.length);

    String ChoseWord() {
        String ChoseOne = luck[value];
        return ChoseOne;
    }
}
