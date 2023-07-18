import java.util.Arrays;
import java.util.Scanner;

public class NobleInteger {
    static int countNobleInteger(int[] A){
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if(A[i] == A.length-1-i){
                return 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A[] = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = scanner.nextInt();
        }
        System.out.println(countNobleInteger(A));
    }
}
