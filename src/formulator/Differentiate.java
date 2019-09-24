package formulator;

import javax.swing.JOptionPane;

public class Differentiate {
    
    Calculations cal;
    MathHelper mHelper;

    public Differentiate() {
        this.cal = new Calculations();
        this.mHelper = new MathHelper();
    }

    
    public String getResult(String ss, int val1, double val2, String input) {
        double n;

        try {
            cal.calculate(ss);
        } catch (Exception exception) {
            return "ERROR";
            
        }
        try {
            n = Double.parseDouble(JOptionPane.showInputDialog("Enter Point"));

        } catch (Exception exception) {
            return "ERROR";
        }


        double h = Math.abs(n * 0.00001);
        if (h == 0) {
            h = 0.00001;
        }
        double d = (cal.calculate(ss, (n + h)) - cal.calculate(input, n)) / h;
        return "" + mHelper.roundValue(d, val1) + " ";
    }
    
}
