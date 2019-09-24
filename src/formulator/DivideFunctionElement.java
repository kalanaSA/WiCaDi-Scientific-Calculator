package formulator;


public class DivideFunctionElement extends  FunctionElement {
    
    @Override
    public String toString() {
        return this.getArguments().get(0).toString() + " / " + getArguments().get(1).toString();
    }
    
    
    @Override
    public void setVariableValue(String varName, double value) { 
        if (this.getArguments().size() > 0) {
            this.getArguments().get(0).setVariableValue(varName, value);
        }
    }

    @Override
    public double evaluate() {
        return this.getArguments().get(0).evaluate() / getArguments().get(1).evaluate(); //evaluate DivisionFunction and get the value

    }
}
