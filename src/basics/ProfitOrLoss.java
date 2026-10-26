package basics;
import java.util.Scanner;

public class ProfitOrLoss {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cp = sc.nextInt();
        System.out.println("Cost Price");
        int sp = sc.nextInt();
        System.out.println("Selling Price");

        if(cp < sp){
            System.out.println("profit "+ (sp-cp));
        } else if (cp > sp) {
            System.out.println("loss "+ (cp-sp));
        } else{
            System.out.println("No Profit No Loss");
        }
    }
}
