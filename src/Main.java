
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Create a new creature?");
        String ans =scan.nextLine();
        ans=ans.toLowerCase();
        if (ans.equals("yes")){
            System.out.println("What is the name of your creature?");
            String name=scan.nextLine();
            Creatures rawr = new Creatures(name, 0, 0, 0);
            int skillPoints = rawr.attributePointRandomizer();
            System.out.println("You have " + skillPoints + " skill points.");
            System.out.println("Which attribute would you like to prioritize?");
            String prioritizedAttribute=scan.nextLine();
            if (prioritizedAttribute.equals("Strength") || prioritizedAttribute.equals("strength")){
                 rawr.prioritizeStrength( skillPoints);
            }
            if (prioritizedAttribute.equals("health") || prioritizedAttribute.equals("Health")){
                rawr.prioritizeHealth(skillPoints);
            }
            if (prioritizedAttribute.equals("defence") || prioritizedAttribute.equals("Defence")) {
                rawr.prioritizeDefence(skillPoints);
            }
        }
        else {
            System.out.println("Maybe next time.");
        }


        scan.close();
    }
}