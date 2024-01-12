import javax.swing.*;
import java.lang.Math;
public class GUI {
    public static void main (String []args)
    {
        System.out.println("hello world");
        String name=JOptionPane.showInputDialog("hello tell me your name:");
        JOptionPane.showMessageDialog(null,"Hello "+name+" how are you");
        int age=Integer.parseInt(JOptionPane.showInputDialog(name+" Enter your age: "));
        JOptionPane.showMessageDialog(null,"your age is "+age);
        double weight =Double.parseDouble(JOptionPane.showInputDialog("Enter your weight (cm)"));
        JOptionPane.showMessageDialog(null,"your weight is "+weight);

        int ages=3;
        System.out.println(Math.sqrt(ages));

    }
}
