package formulator;

import java.util.*;


public class FunctionElement extends  FormulaElement {
    
    private Vector<FormulaElement> arguments;
    
    //constructor initiates the vector
    public FunctionElement() {
        this.arguments = new Vector<FormulaElement>();
    }

    //retrive the vector arguments
    public Vector<FormulaElement> getArguments() {
        return arguments;
    }

    //add argument to the vector arguments
    public void setArguments(FormulaElement arguments) {
        this.arguments.add(arguments);
    }

    @Override
    public String toString() {
        return "";
    }
    
    @Override
    public void setVariableValue(String varName, double val) {
        this.arguments.stream().forEach((argument) -> {
            argument.setVariableValue(varName, val);
        });
    }

    @Override
    public boolean isFullyGrounded() {
        for (FormulaElement argument : arguments) {
            if (!argument.isFullyGrounded()) {
                return false;
            }
        }
        return true;
    }
    

}
