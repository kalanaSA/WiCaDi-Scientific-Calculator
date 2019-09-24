package formulator;


public class MultipleFunctionElement extends  FunctionElement {
    
    @Override
    public String toString() {
        FormulaElement arg_1 = this.getArguments().get(0),arg_2 = this.getArguments().get(1);
   
        if (arg_1 instanceof VariableElement) { //checking whether the argument is a instance of VariableElement
            VariableElement a = (VariableElement) arg_1; //Creating a new VariableElement varible by parsing the argument
            if (arg_2 instanceof ConstantElement) { //checking whether the second argument is a instance of ConstantElement
                ConstantElement b = (ConstantElement) arg_2; //Creating a new ConstantElement varible by parsing the second argument
                return b.toString() + a.toString(); //Returning concatenating 2 values of their toSting methods
            } else if (arg_2 instanceof VariableElement) { //checking whether the second argument is a instance of VariableElement
                return a.toString() + arg_2.toString(); //Returning concatenating 2 values of their toSting methods
            } else if (arg_2 instanceof FunctionElement) { //checking whether the second argument is a instance of FunctionElement
                if (arg_2 instanceof PlusFunctionElement || arg_2 instanceof MinusFunctionElement) { //checking whether the second argument is a instance of PlusFunctionElement or MinusFunctionElement 
                    return "(" + a.toString() + ")" + "(" + arg_2.toString() + ")"; //returning the 2 arguments surrounding them by brackets
                } else {
                    return a.toString() + arg_2.toString(); //Returning concatenating 2 values of their toSting methods
                }
            }
        } else if (arg_1 instanceof ConstantElement) { //checking whether the argument is a instance of ConstantElement
            ConstantElement a = (ConstantElement) arg_1; //Creating a new ConstantElement varible by parsing the argument
            if (arg_2 instanceof ConstantElement) { //checking whether the second argument is a instance of ConstantElement
                ConstantElement b = (ConstantElement) arg_2; //Creating a new ConstantElement varible by parsing the second argument
                return Double.toString(a.getConstantVal() * b.getConstantVal()); //Returning the value by multipling 2 constants
            } else if (arg_2 instanceof VariableElement) { //checking whether the second argument is a instance of VariableElement
                return a.toString() + arg_2.toString(); //Returning concatenating 2 values of their toSting methods
            } else if (arg_2 instanceof FunctionElement) { //checking whether the second argument is a instance of FunctionElement
                if (arg_2 instanceof PlusFunctionElement || arg_2 instanceof MinusFunctionElement) { //checking whether the second argument is a instance of PlusFunctionElement or MinusFunctionElement 
                    return "(" + a.toString() + ")" + "(" + arg_2.toString() + ")"; //returning the 2 arguments surrounding them by brackets
                } else {
                    return a.toString() + arg_2.toString(); //Returning concatenating 2 values of their toSting methods
                }
            }
        } else if (arg_1 instanceof FunctionElement) { //checking whether the argument is a instance of FunctionElement
            String string_a = arg_1.toString(); //Creating a new varible and assigning it the output of its toString method
            if (arg_1 instanceof PlusFunctionElement || arg_1 instanceof MinusFunctionElement) { //checking whether the argument is a instance of PlusFunctionElement or MinusFunctionElement 
                string_a = "(" + string_a + ")"; //storing the arguments surrounding it by brackets
            }

            if (arg_2 instanceof ConstantElement) { //checking whether the second argument is a instance of ConstantElement
                ConstantElement b = (ConstantElement) arg_2; //Creating a new ConstantElement varible by parsing the second argument
                return b.toString() + string_a; //Returning concatenating values of its toSting method and the value of varaible vreated by first argument
            } else if (arg_2 instanceof VariableElement) { //checking whether the second argument is a instance of VariableElement
                return string_a + arg_2.toString(); //Returning concatenating values of its toSting method and the value of varaible vreated by first argument
            } else if (arg_2 instanceof FunctionElement) { //checking whether the second argument is a instance of FunctionElement
                if (arg_2 instanceof PlusFunctionElement || arg_2 instanceof MinusFunctionElement) { //checking whether the second argument is a instance of PlusFunctionElement or MinusFunctionElement 
                    return string_a + "(" + arg_2.toString() + ")"; //Returning concatenating values of second argument toSting method surrounding it with brackets and the value of varaible vreated by first argument
                } else {
                    return string_a + "(" + arg_2.toString() + ")"; //Returning concatenating values of second argument toSting method surrounding it with brackets and the value of varaible vreated by first argument
                }
            }
        }
        return "";

    }
    
    @Override
    public double evaluate() {
        return this.getArguments().get(0).evaluate() * getArguments().get(1).evaluate(); //evaluate MultipleFunction and get the value

    }
}
