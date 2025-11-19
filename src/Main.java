
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
            int skillPoints = rawr.attributePointRandomizer();
            System.out.println("Which attribute would you like to prioritize?");
            String prioritizedAttribute=scan.nextLine();
            rawr.attributeCalculator(prioritizedAttribute, skillPoints);

        }
        else {
            System.out.println("Maybe next time.");
        }


        scan.close();
    }
}