
import java.util.Random;
import java.util.Scanner;

public class Main {

    int theNumber;


    public GuessTheNumber(int x) {
        Random rand = new Random();
        theNumber = rand.nextInt(x);
    }

    public void play() {
        while (true) {
            Scanner s = new Scanner(System.in);
            int move = s.nextInt();
            if (move > this.theNumber) {
                System.out.println("Number is too big");
            } else if (move < this.theNumber) {
                System.out.println("Your number is too small");
            } else {
                System.out.println("You got it!!!");
                break;
            }
        }

    }


    public static void main(String[] args) {
        System.out.println("Please set max number: ");
        Scanner scan = new Scanner(System.in);
        int max = scan.nextInt();
        GuessTheNumber g = new GuessTheNumber(max);
        System.out.println("Welcome to my game\nTry and guess number from 0 and " + max + ": ");
        g.play();
    }
}
