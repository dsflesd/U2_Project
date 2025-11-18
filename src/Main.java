import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Create a new creature?");
        String ans =scan.nextLine();
        if (ans.equals("yes")||ans.equals("Yes")){
            System.out.println("What is the name of your creature?");
            String name=scan.nextLine();
            Creatures rawr = new Creatures(name, 0, 0, 0);
            System.out.println("You have "+(int)((Math.random()*26)+75)+" skill points");

            System.out.println("Which attribute would you like to prioritize?");
            String prioritezedAtribute=scan.nextLine();
            rawr.atributeCalculator(prioritezedAtribute);
        }
        else {
            System.out.println("Maybe next time.");
        }


        scan.close();
    }
}