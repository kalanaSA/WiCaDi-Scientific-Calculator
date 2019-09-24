package formulator;

import java.util.StringTokenizer;


public class Calculations {
    
    public double calculate(String st, double val) {
        
        
         /*
        
        if the string contains the substrings like 2X or 3X, we have to replace 
        them with * sign, Eg - 2X convert into 2*X.
        and also replace the operators and signs with spaces
                          Eg - "x" replace with " x "
                               "+" replace with " + "
        this convertion is done by this calculate method.
        
        */
        

        st = st.toLowerCase();
             StringBuffer sb=new StringBuffer(st);
        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i)=='x')
            {
            if(i>0&&sb.charAt(i-1)>='0'&&sb.charAt(i-1)<='9')
            {
                sb.insert(i, '*');
            }
              if(i<sb.length()-1&&sb.charAt(i+1)>='0'&&sb.charAt(i+1)<='9')
            {
                sb.insert(i+1, '*');
            }
            }
        }
        st = sb.toString();
        st = st.replace("x", " x ");

    
        st = st.replace("sin", " sin ");
        st = st.replace("cos", " cos ");
        st = st.replace("tan", " tan ");
        st = st.replace("log", " log ");
      
        st = st.replace("+", " + ");
        st = st.replace("-", " - ");
        st = st.replace("*", " * ");
        st = st.replace("/", " / ");
        st = st.replace("^", " ^ ");
        st = st.replace("(", " ( ");
        st = st.replace(")", " ) ");

        EvaluateFormula ev = new EvaluateFormula();
        return ev.evaluate(st, val);

    }

    
    
    /*
    
    in some cases, the the main method do not pass a value for the X variable.
    then we should have to handle that kind of calculations. so we set a default value 
    to X and pass the values to the calculate method.
    
    */
    

    public double calculate(String st1) {
        return calculate(st1, 0);
    }

    
}




