package Math;
import java.util.Scanner;
public class LC_263_UglyNumber {
 //   Difficulty: Easy
 //   Problem Number: 263
  //  Topic: Math

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println(false);
            return;
        }
        while (n % 2 == 0) {
            n = n / 2;
        }
        while (n % 3 == 0) {
            n = n / 3;
        }
        while (n % 5 == 0) {
            n = n / 5;
        }
        System.out.println(n==1);
    }
}