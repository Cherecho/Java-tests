
package classes;

import java.util.*;
import javax.swing.JOptionPane;

public class rngCharacter {
    public static void main(String[] args) {
        
        //Vocals that we're gonna generate
        int length;       
        
        //Asking 4 the ammount of vocals
        length = Integer.parseInt(JOptionPane.showInputDialog("How much letters do u need?"));
        
        //Calling the funtion
        showResult(length);
        

        
        
    }
    
    public static String character(int int_random){
        String a = "";
        
        //Get the vocal with the random number
        switch (int_random) {
            case 0:
                a="A";
                break;
            case 1:
                a="E";
                break;
            case 2:
                a="I";
                break;
            case 3:
                a="O";
                break;
            case 4:
                a="U";
                break;
            case 5:
                a="a";
                break;
            case 6:
                a="e";
                break;
            case 7:
                a="i";
                break;
            case 8:
                a="o";
                break;
            case 9:
                a="u";
                break;
            default:
                break;
        }
        return a;
    }
    
    public static String getString(int length){
        String x = "";
        Random rand = new Random();
        int int_random = rand.nextInt(10);
        
        //Counter
        int y = 0;
        
        //Loop to get the string with all the vocals
        while(y<length){
            x = x + " " + character(int_random);
            int_random = rand.nextInt(10);
            
            //+1 to the counter
            y++;
        }
        return x;
    };
    
    public static void showResult(int length){
        String result;
        
        //Prepare the string 4 the result window
        result = "Total characters generated: " + length + "\n" + getString(length);
        
        //Calling the window
        JOptionPane.showMessageDialog(null,result);
    };
}
