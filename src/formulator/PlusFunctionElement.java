package formulator;


public class PlusFunctionElement extends  FunctionElement {
    
    @Override
    public String toString() {
        return this.getArguments().get(0).toString() + " + " + getArguments().get(1).toString();
    }
    
    @Override
    public double evaluate() {
        return this.getArguments().get(0).evaluate() + getArguments().get(1).evaluate(); //evaluate PlusFunction and get the value

    }
    
}
