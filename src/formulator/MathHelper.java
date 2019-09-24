package formulator;

public class MathHelper {
    
    public double roundValue(double d, int k) {

           if(Double.isInfinite(d))
            {
                return d;
            }
                  
            double h1=d%1;
            double h2=(Math.round(h1*Math.pow(10, k)))/Math.pow(10, k);
            double h3=d-h1;
            double d1=h3+h2;
           
            return d1;

    }
    
    public String getSquareRoot(String input) {
        double val = Double.parseDouble(input);
        
        val = Math.sqrt(val);
        
        return Double.toString(val);
    }
    
    public String getSquare(String input) {
        double val = Double.parseDouble(input);
        
        double answer = val * val;
        
        if(answer > -100000000 && answer < 100000000){
            return Double.toString(answer);
        }
        else{
            return "Error";
        }
    }
    
    public String getCube(String input) {
        double val = Double.parseDouble(input);
        
        double answer = val * val * val ;
        
        if(answer > -100000000 && answer < 100000000){
            return Double.toString(answer);
        }
        else{
            return "Error";
        }
    }
    
}
