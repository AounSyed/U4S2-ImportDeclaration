package partA.activity;

public class Activity02_NonExplicitImport {
    public static void main(String args[])
    {
        int min = 1;
        int max = 6;
        int number = (int)(Math.random()*(max-min+1)+min);
        System.out.println("Let's play some craps! Throw the dice!");
        System.out.println("You rolled a: " + number);
    }
}
