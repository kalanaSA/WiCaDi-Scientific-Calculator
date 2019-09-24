package formulator;

import java.util.StringTokenizer;

public class EvaluateFormula {
    
    public double evaluate(String s, double z) {
        
         /*
        
        we replace the X with the value that the main class pass to this class
        
        */

        StringTokenizer tok = new StringTokenizer(s);
        String[] a = new String[tok.countTokens()];

        for (int i = 0; i < a.length; i++) {
            a[i] = tok.nextToken();
            if (a[i].equalsIgnoreCase("x")) {
                a[i] = "" + z;
            }

        }
        
        
        
         /*
        
        if the string consist with brackets, first of all we have to solve the problems within 
        the bracket, so we check if the string if consist of closing bracket and then reverse the loop 
        until the open bracket is found, then add all the strings within the open and close brackets to 
        temp variable and recall the evaluate method.
        
        */
        
        

        for (int i = 0; i < a.length; i++) {

            if (a[i].equalsIgnoreCase(")")) {
                String temp = "";
                int j = i - 1;
                while (!a[j].equalsIgnoreCase("(")) {
                    temp = " " + a[j] + temp;
                    a[j] = "U";
                    j--;
                }
                a[j] = "U";
                a[i] = "" + evaluate(temp, z);
            }

        }
        
        
        /*
        
        then if the string equals to sin,cos, tan or log, we have to calculate the next substring part 
        inside a sin,cos,tan or log sign.
                    Eg - if the formula is sin60+40, then first of all we have to calculate 60+40 then
                         the answer is calculate with the sin value.
                         we have to find the value of sin100
        
        
        */
        

        for (int i = 0; i < a.length; i++) {
            if (a[i].equalsIgnoreCase("sin") || a[i].equalsIgnoreCase("cos") || a[i].equalsIgnoreCase("tan") || a[i].equalsIgnoreCase("log")) {
                String temp = "";

                int k = i + 1;
                while (k < a.length && !a[k].equalsIgnoreCase("+") && !a[k].equalsIgnoreCase("-") && !a[k].equalsIgnoreCase("*") && !a[k].equalsIgnoreCase("/")) {

                    temp = temp + " " + a[k];
                    a[k] = "U";
                    k++;

                }

                k = k - 1;
               
              
             
                if (a[i].equalsIgnoreCase("sin")) {

                    a[k] = "" + Math.sin(evaluate(temp, z));
                    a[i] = "U";
                }
                if (a[i].equalsIgnoreCase("cos")) {

                    a[k] = "" + Math.cos(evaluate(temp, z));

                    a[i] = "U";
                }
                if (a[i].equalsIgnoreCase("tan")) {

                    a[k] = "" + Math.tan(evaluate(temp, z));
                    a[i] = "U";
                }
               
                if (a[i].equalsIgnoreCase("log")) {

                    a[k] = "" + Math.log10(evaluate(temp, z));
                    a[i] = "U";
                }
             
               
            }
        }
        
        /*
        
        then we have to calculate power signs.we get the user inputs as n1 and n2, the first character 
        appear in the string is add to n1 and the character after the ^ sign is add to the n2.
        then all the method Math.pow to calculate the answer.
        
        */
        
        
        for (int i = 0; i < a.length; i++) {

            if (a[i].equalsIgnoreCase("^")) {
                double n1, n2;
                n1 = Double.parseDouble(a[i - 1]);
                int temp = 0;
                for (int k = i + 1; k < a.length; k++) {
                    if (a[k].equalsIgnoreCase("+") || a[k].equalsIgnoreCase("-") || a[k].equalsIgnoreCase("*") || a[k].equalsIgnoreCase("/")) {
                        temp = k - 1;
                        break;
                    }
                    temp = k;

                }
                n2 = Double.parseDouble(a[temp]);
                a[temp] = "" + Math.pow(n1, n2);
                a[i] = a[i - 1] = "U";

            }
        }

       
        
        /*
        
        then we have to calculate * or / signs.we get the user inputs as n1 and n2, the first character 
        appear before the * or / sign is add to n1 and the character after the * or / sign is add to the n2.
        then calculate the answer.
        
        */
        
        

        for (int i = 0; i < a.length; i++) {

            if (a[i].equalsIgnoreCase("*") || a[i].equalsIgnoreCase("/")) {
                double n1, n2;
                n1 = Double.parseDouble(a[i - 1]);
                int temp = 0;
                for (int k = i + 1; k < a.length; k++) {
                    if (a[k].equalsIgnoreCase("+") || a[k].equalsIgnoreCase("-") || a[k].equalsIgnoreCase("*") || a[k].equalsIgnoreCase("/")) {

                        temp = k - 1;
                        break;
                    }
                    temp = k;

                }
                n2 = Double.parseDouble(a[temp]);
                if (a[i].equalsIgnoreCase("*")) {
                    a[temp] = "" + (n1 * n2);

                }
                if (a[i].equalsIgnoreCase("/")) {

                    a[temp] = "" + (n1 / n2);

                }
                a[i] = a[i - 1] = "U";

            }
        }
        
         /*
        
        then we have to calculate + or - signs.we get the user inputs as n1 and n2, the first character 
        appear before the + or - sign is add to n1 and the character after the + or - sign is add to the n2.
        then calculate the answer.
        
        */
        

        for (int i = 0; i < a.length; i++) {

            if (a[i].equalsIgnoreCase("+") || a[i].equalsIgnoreCase("-")) {
                double n1, n2;
                if (i == 0) {
                    n1 = 0;
                } else {
                    n1 = Double.parseDouble(a[i - 1]);
                }


                int temp = 0;
                for (int k = i + 1; k < a.length; k++) {
                    if (a[k].equalsIgnoreCase("+") || a[k].equalsIgnoreCase("-") || a[k].equalsIgnoreCase("*") || a[k].equalsIgnoreCase("/")) {
                        temp = k - 1;
                        break;
                    }
                    temp = k;
                }
                n2 = Double.parseDouble(a[temp]);

                if (a[i].equalsIgnoreCase("+")) {

                    a[temp] = "" + (n1 + n2);

                }
                if (a[i].equalsIgnoreCase("-")) {

                    a[temp] = "" + (n1 - n2);

                }

                if (i != 0) {
                    a[i] = a[i - 1] = "U";
                } else {
                    a[i] = "U";
                }

            }
        }
        
        /*
        
        and finally the answer with the string data type is converted into double and 
        return to the main method.
        
        */
        
        double ans = Double.parseDouble(a[a.length - 1]);
        return ans;


    }
    
}
