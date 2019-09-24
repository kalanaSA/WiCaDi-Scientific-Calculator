package formulator;


public class VariableElement extends  FormulaElement {
    
    private String variableName;
    private double variableVal;
    private boolean isGrouned = false;

    //constructor sets value for the variableName
    public VariableElement(String variableName) {
        this.variableName = variableName;
    }
    
    //retrive the value from variableName
    public String getVariableName() {
        return variableName;
    }
    
    //retrive the value from variableVal
    public double getVariableVal() {
        return variableVal;
    }

    //sets value of the variable variableVal
    public void setVariableVal(double variableVal) {
        this.variableVal = variableVal;
        this.isGrouned = true;
    }
    
    public String toString() {
        return this.variableName;
    }
    
    
    @Override
    public void setVariableValue(String varName, double value) {
        if (this.getVariableName().equals(varName)) {
            this.setVariableVal(value);
        }
    }

    @Override
    public boolean isFullyGrounded() {
        return isGrouned;
    }
    
    @Override
    public double evaluate() {
        return this.getVariableVal();

    }
    
}
