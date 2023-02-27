public class NNaturlige {

    public static void main(String[] args) {
        int n = 100;
        int sum = nNaturlige(n);
        System.out.println("Sum: "+sum);
    }
    public static int nNaturlige(int n){
        if(n != 0) {
            return n + nNaturlige(n - 1);
        } else {
                return n;
            }
        }
    }

