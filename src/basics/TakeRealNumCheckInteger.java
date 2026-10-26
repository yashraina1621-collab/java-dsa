package basics;
import java.util.Scanner;
public class TakeRealNumCheckInteger {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();
        if (n == (int)n){
            System.out.println("it is an Integer");
        } else {
            System.out.println("It is not an Integer");
        }

    }
}
