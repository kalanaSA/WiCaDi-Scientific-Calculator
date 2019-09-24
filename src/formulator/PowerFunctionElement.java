package formulator;

public class PowerFunctionElement extends  FunctionElement {
    
    @Override
    public String toString() {
        return this.getArguments().get(0).toString() + " ^ " + getArguments().get(1).toString(); 
    }
    
    @Override
    public double evaluate() {
        return Math.pow(this.getArguments().get(0).evaluate(), getArguments().get(1).evaluate()); //evaluate PowerFunction and get the value

    }
    
}
