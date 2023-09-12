import static java.lang.Math.floorDiv;

public class Reduce {
    public static void main(String[] args) {
        int count = 0;
        int n = 100;
        while (n >= 1) {
            if (n % 2 == 0) {
                n = floorDiv(n, 2);
            }
            else {
                n = n - 1;
            }
            count = count + 1;
        }
        System.out.println(count);
    }
}

