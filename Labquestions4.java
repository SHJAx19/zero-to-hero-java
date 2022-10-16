
package labquestions4;

import java.util.Scanner;

public class Labquestions4 {

    public static void main(String[] args) {
        
        Scanner weather = new Scanner(System.in);
        System.out.println("Enter degree in Celcius :");
        double c = weather.nextDouble();
        
        double f = (c*9/5) + 32;
        
        System.out.println(c+" is equal to "+f);
                
        
        
     
    }
    
}
