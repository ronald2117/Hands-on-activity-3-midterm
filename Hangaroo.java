import java.util.*;

public class Hangaroo{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = input.nextLine();

        System.out.println("Guess1:");
        String guess1 = input.nextLine();
        boolean correct1;
        if(word.contains(guess1)){
            correct1 = true;
            System.out.println("Yes, there is!");
        } else {
            correct1 = false;
            System.out.println("No!");
        }

        System.out.println("Guess2:");
        String guess2 = input.nextLine();
        boolean correct2;
        if(word.contains(guess2)){
            correct2 = true;
            System.out.println("Yes, there is!");
        } else {
            correct2 = false;
            System.out.println("No!");
        }

        System.out.println("Guess3:");
        String guess3 = input.nextLine();
        boolean correct3;
        if(word.contains(guess3)){
            correct3 = true;
            System.out.println("Yes, there is!");
        } else {
            correct3 = false;
            System.out.println("No!");
        }

        if(correct1 && correct2 && correct3){
            System.out.println("You are a winner!");
        } else {
            System.out.println("Better luck next time!");
        }
    }
}
