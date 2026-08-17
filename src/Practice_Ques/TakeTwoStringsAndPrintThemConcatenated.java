package Practice_Ques;

//Problem: Take Two Strings And Print Them Concatenated
// Difficulty: Easy
// Topic: Array


public class TakeTwoStringsAndPrintThemConcatenated {
    static void main(String[] args) {
        String s = "Hello world";
        int count = 0;

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) != ' '){
                count++;
            }
            System.out.println(count);
        }
    }
}
