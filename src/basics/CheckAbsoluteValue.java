package basics;
import java.util.Scanner;
public class CheckAbsoluteValue {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        if(a<0){
            a = -a;
            System.out.println(a);
        } else {
            System.out.println(a);
        }
    }
}
