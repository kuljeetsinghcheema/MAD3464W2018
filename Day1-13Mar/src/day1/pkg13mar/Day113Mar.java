/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1.pkg13mar;

//import java.util.Arrays;

/**
 *
 * @author macstudent
 */
public class Day113Mar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num = 10;
       float percentage;
       char vowel = 'a';
       String firstName = "Kuljeet";
       System.out.println("Value of Number :" + num);
       
       percentage = 78.6f;
       System .out.println("Value of Percentage:" + percentage);
               
       System.out.println("Vowel:" + vowel);
        System.out.println("firstname:" + firstName);
        
        int number = 10;
        if (number > 10){
            System.out.println("morethan 10");
            
        }
        else{
            System.out.println("equal to 10");
        }
        
        switch (number){
            case 10:
                System.out.println("Value = 10");
                break;
            case 20:
                System.out.println("Value = 20");
                break;
            case 30:
                System.out.println("value = 30");
                break;
                
                
       
        }
        vowel = 'a';
        switch(vowel){
            case ('a'|'e'|'i'|'o'|'u'):
                 System.out.println("Vowel");
                    break;
            default:
                System.out.println("Not a vowel");
        }
        
        String province = "Alberta";
        switch (province)
        {
            case "Ontario":
                System.out.println("ON");
                break;
            case "alberta":
                System.out.println("AL");
            case "Prince Edward":
                System.out.println("PE");
            default:
                System.out.println("Unavailable");
                
        }
        
        int numbers[] = new int[5];
        int i;
        
        for(i=0;i<4;i++){
            numbers[i] = (int)(Math.random()*100);
            System.out.println("numbers[" + i +"] = "+ numbers[i]);
        }
        double PI_VALUE = Math.PI;
        double power = Math.pow(2, 2);
        Math.sqrt(144);
        Math.abs(PI_VALUE);
        
        float grades[][] =new float [3][4];
        
        for (i=0;i<3;i++)
        {
            for(int j=0;j<4;j++){
                grades[i][j] = 10.0f;
            }
        }
        
        for(i=0;i<10;i++){
           // randomNo = (int)(Math.random()*10);
            //System.out.println("no" + (i+1) + "=" + randomNo);
        }
        //Arrays.sort(randomNo);
        //for (i=0;i<10;i++){
            //random[i] = (int)(Math.random()*10);
            //System.out.println("no"+(i+1)+);
        //}
        
         for(i=1;i<=5;i++)
         {
            for(int j=1;j<=5;j++){
                if(i==1 || i==5 || j==1 || j==5){
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
         
         
    }
}
