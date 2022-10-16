
package gui.intro;
// Gui means ( graphical user interface)
import javax.swing.JOptionPane; 
public class GuiIntro {

    public static void main(String[] args) {
       
        String name = JOptionPane.showInputDialog(null,"Enter Your name");
        JOptionPane.showMessageDialog(null, "Hello"+ name);
        
        int age = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Your age")); 
        JOptionPane.showMessageDialog(null, "You are " + age + "years old" );
        
        double height = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter Your Height")); 
        JOptionPane.showMessageDialog(null, "You are " + height + "cm Tall" );
        
        Float weighy = Float.parseFloat(JOptionPane.showInputDialog("What is your weight? "));
        JOptionPane.showMessageDialog(null, "You are  "+weighy+" heavy");
       
    }
    
}
