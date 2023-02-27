public class an {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int an = an(i);
            System.out.println("a" + i + " = " + an);
        }
    }

    public static int an(int n) {
        if (n == 0) {
            return 2;
        } else if (n == 1) {
            return 5;
        } else {
            return 5*an(n-1) - 6*an(n-2) + 2;
        }
    }
}
