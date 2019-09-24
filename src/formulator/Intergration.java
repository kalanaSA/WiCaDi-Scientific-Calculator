package formulator;

import javax.swing.JOptionPane;

public class Intergration {
    
    Calculations cal;
    MathHelper mHelper;

    public Intergration() {
        this.cal = new Calculations();
        this.mHelper = new MathHelper();
    }
    
    public String getResult(String ss, int val1) {
        double n1 = 0, n2 = 0, l = 0, y = 0;
        double h = 0, j = 0;
        double d = 0;
       
        try {
            cal.calculate(ss);
        } catch (Exception exception) {
            return "ERROR";
            
        }
        try {
            n1 = Double.parseDouble(JOptionPane.showInputDialog("Starting limit"));
            n2 = Double.parseDouble(JOptionPane.showInputDialog("Ending limit"));

        } catch (Exception exception) {
            return "ERROR";
        }


        y = 1000 * (n2 - n1);
        h = (double) (n2 - n1) / y;
        j = n1;

        while (l < y) {
            l++;
            j = j + h;
            d = d + (cal.calculate(ss, j) * h);
        }

        return "" + mHelper.roundValue(d, val1) + " ";
    }
    
}
