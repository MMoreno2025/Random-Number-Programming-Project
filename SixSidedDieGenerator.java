//Malia Moreno 24 September 2024//
/*For this project I have been tasked with:
-planning and writing a program that randomly generates an integer from 1 to 6
- for bonus point every time a person types the letter "r" it rolls the dice
*/
package com.mycompany.sixsideddiegenerator;
import java.util.Random;
import java.util.Scanner; //inport scanner for input//

public class SixSidedDieGenerator {
    public static void main(String[] args) {
        //define "ran" variable as a random() object//
        Random ran = new Random();
        Scanner myObj = new Scanner(System.in);
        
        //asks user to put in "r"//
        System.out.print("Hello! Plese press 'r' to roll the dice\t");
        String reRoll = myObj.nextLine();
        
        //check if user input "r"//
        if("r".equals(reRoll)){
            System.out.println(ran.nextInt(1, 6));
        }
    }
}
