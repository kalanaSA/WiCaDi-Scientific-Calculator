package formulator;


public class ConstantElement extends  FormulaElement{
    
    private double constantVal;

    //constructor sets value of the constantVal
    public ConstantElement(double constantVal) {
        this.constantVal = constantVal;
    }
    
    //retrive value from the private variable constantVal
    public double getConstantVal() {
        return constantVal;
    }
    
    @Override
    public String toString() {
        return Double.toString(constantVal);
    }
    
    @Override
    public double evaluate() {
        return this.getConstantVal(); //fetch Constant value

    }
    
}
