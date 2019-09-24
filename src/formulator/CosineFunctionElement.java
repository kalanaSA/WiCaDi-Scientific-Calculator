package formulator;

public class CosineFunctionElement extends  FunctionElement {
    
   
    
    @Override
    public String toString() {
        FormulaElement this_arg = this.getArguments().get(0);
        return "cos(" + this_arg.toString() + ")";
    }
    
    @Override
    public void setArguments(FormulaElement argument) {
        if (this.getArguments().size() < 1) {
            super.setArguments(argument);
        }
    }
    
    @Override
    public double evaluate() {
        return Math.cos(getArguments().get(0).evaluate()); //evaluate CosineFunction and get the value

    }
    
}
