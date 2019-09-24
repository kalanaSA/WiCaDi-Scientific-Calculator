package formulator;

public class SineFunctionElement extends  FunctionElement {
    
    @Override
    public String toString() {
        FormulaElement this_arg = this.getArguments().get(0);
        return "sin(" + this_arg.toString() + ")";
    }
    
    @Override
    public void setArguments(FormulaElement argument) {
        if (this.getArguments().size() < 1) {
            super.setArguments(argument);
        }
    }
    
    @Override
    public double evaluate() {
        return Math.sin(getArguments().get(0).evaluate()); //evaluate SineFunction and get the value

    }
}
