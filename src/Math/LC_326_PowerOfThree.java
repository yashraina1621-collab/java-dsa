package Math;
import java.util.Scanner;
public class LC_326_PowerOfThree {
    public static boolean isPowerOfThree(int n){
        if(n<=0){
            return false;
        }
        while(n % 3 ==0){
            n = n/3;
        }
        return n==1;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean result = isPowerOfThree(n);

        System.out.println(result);
    }
}
