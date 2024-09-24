//Malia Moreno | 20 September 2024//
package com.mycompany.u3l3prebuiltclasses;
import java.util.Random;

public class U3L3PreBuiltClasses {
    public static void main(String[] args) {
        //define "ran" variable as a random() object//
        Random ran = new Random();
        //defining a string to represent the different spaces in the phone number//
        String partOne = "xxx-xxx-xxxx";
        
        //create a for loop to replace each of the "x" values in the phone number String//
        for(int i = 0; i<partOne.length(); i++){
            if(i!=3 && i!=7){       //check if the value of the string equals "-" so it doesn't replace that value with a number//
                int newNum = ran.nextInt(10);
                
                //making sure first three digits dont have 8 or 9//
                if(i==0){
                    newNum = ran.nextInt(8);
                    System.out.println("test 01.1");
                }else if(i==1){
                    newNum = ran.nextInt(8);
                    System.out.println("test 01.2");
                }else if(i==2){
                    newNum = ran.nextInt(8);
                    System.out.println("test 01.3");
                }
                
                //check if the second set of 3 digit numbers is greater than 655//
                if(i==10){
                    String subString01 = partOne.substring(4, 7);
                    System.out.println(Integer.parseInt(subString01));
                    while(Integer.parseInt(subString01)>655){       //while loop to make sure new value doesn't surpass 655//
                        subString01 = partOne.substring(4, 7);
                        int newPart01 = ran.nextInt(656);
                        
                        partOne = partOne.substring(0, 4)+Integer.toString(newPart01)+partOne.substring(7, partOne.length());
                    }
                }
                
                partOne = partOne.substring(0, i)+Integer.toString(newNum)+partOne.substring(i+1, partOne.length());        //create new string replacing the value that previousely existed//
            }
        }
        
        
        
        
        System.out.println(partOne);
    }
}
