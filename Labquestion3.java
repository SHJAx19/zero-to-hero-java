
package labquestion3;

import java.util.Scanner;

public class Labquestion3 {

    public static void main(String[] args) {
        
        Scanner gpa = new Scanner(System.in);
        
        System.out.println("Enter your percentage: ");
        double per = gpa.nextDouble();
        
        double total = (per/100)*4;
        
        System.out.println("Your GPA is "+total);
        
        
        
      
    }
    
}
