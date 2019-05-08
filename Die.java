import java.util.Random;

public class Die{

    static Random r = new Random();

    private static int getFaceValue(){
        
        int face = r.nextInt(6);
        return face + 1;

    }

    public static int roll(){

        int die1 = getFaceValue();
        int die2 = getFaceValue();

        return die1 + die2;
        
    }
}