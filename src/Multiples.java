import static java.lang.Math.floorDiv;

public class Multiples {
    public static void main(String[] args) {
        int multiOf3;
        int multiOf5;
        int multiOf15;
        multiOf3 = floorDiv(1000, 3);
        multiOf5 = floorDiv(1000, 5);
        multiOf15 = floorDiv(1000, 15);
        int result = multiOf3 + multiOf5 - multiOf15;
        System.out.println(result);
    }
}
