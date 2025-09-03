//Jason Lin
//CS1400
//Assignment 2
//2/19/25

import java.util.Scanner;
public class TaskA {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int abilityScoreOne;
            int abilityScoreTwo;
            int abilityScoreThree;
            int abilityScoreFour;
            int abilityScoreFive;

            /**
             * Prompt user for 5 ability scores
             */
            System.out.print("Enter Ability 1 Score: ");
            abilityScoreOne = scan.nextInt();
            System.out.print("Enter Ability 2 Score: ");
            abilityScoreTwo = scan.nextInt();
            System.out.print("Enter Ability 3 Score: ");
            abilityScoreThree = scan.nextInt();
            System.out.print("Enter Ability 4 Score: ");
            abilityScoreFour = scan.nextInt();
            System.out.print("Enter Ability 5 Score: ");
            abilityScoreFive = scan.nextInt();

            System.out.print("Ability 1: ");
            while(abilityScoreOne>=10) {
                System.out.print("\\o/ ");
                abilityScoreOne-=10;
            }
            System.out.print("\nAbility 2: ");
            while(abilityScoreTwo>=10) {
                System.out.print("\\o/ ");
                abilityScoreTwo-=10;
            }
            System.out.print("\nAbility 3: ");
            while(abilityScoreThree>=10) {
                System.out.print("\\o/ ");
                abilityScoreThree-=10;
            }
            System.out.print("\nAbility 4: ");
            while(abilityScoreFour>=10) {
                System.out.print("\\o/ ");
                abilityScoreFour-=10;
            }
            System.out.print("\nAbility 5: ");
            while(abilityScoreFive>=10) {
                System.out.print("\\o/ ");
                abilityScoreFive-=10;
            }
            System.out.println();

        }
    }
}
