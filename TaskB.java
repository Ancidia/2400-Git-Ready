//Jason Lin
//CS1400
//Assignment 2
//2/19/25

import java.util.Scanner;
import java.io.*;
public class TaskB {
    public static void main(String[] args) throws IOException {    
        File myExcuses = new File("Excuses.txt");
        Scanner scanExcuses = new Scanner(myExcuses);
        Scanner scan = new Scanner(System.in);
        int numberExcuse;
        String excuse;
        System.out.print("Please enter a number between 1 and 5: ");
        numberExcuse = scan.nextInt();
        excuse = scanExcuses.nextLine();
        for(int i = numberExcuse; i>1; i--) {
            excuse = scanExcuses.nextLine();
        } 
        System.out.println("I couldn't do my homework beacuse "+excuse);

        
    }
}
