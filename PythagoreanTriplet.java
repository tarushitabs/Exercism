import java.util.*;

class PythagoreanTriplet {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i, j, k;
        for (i = 0; i < N / 3; i++) {
            for (j = i; j < N / 2; j++) {
                k = N - i - j;
                if ((i * i + j * j) == k * k) {
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }
    }
}