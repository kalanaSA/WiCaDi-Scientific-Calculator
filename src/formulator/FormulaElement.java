package formulator;

import java.util.StringTokenizer;
import java.util.Vector;



public class FormulaElement {
    
    public String toString(){
        return "";
    }
    
    
    public double evaluate() {
        return 0;
    }
    
    public void setVariableValue(String varName, double value){
        
    }
    
    public boolean isFullyGrounded() {
        return true;
    }
    
    public int getIndexFromString(String str, int flag) { //flag = 0 if for front part of the string flag=1 for second part of the string
        int index = 0,hasBraces = 0;
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);        
            //Process char
            if(c == '(' || c == ')'){
                hasBraces = 1;
                if(flag == 1) //returning the valur for Second part of the string
                    return i;
                index = i+1;
            }
                
        }
        if(hasBraces == 1) //check if the string has any braces presant
            return index;
        else{
            if(flag ==  0)
                return index;
            else
                return str.length();
        }
    }
    
    
    public String addBracesToParts(String part1, String part2) {
       
        
        System.out.println("part1- "+part1);
        System.out.println("part2 - "+part2);
        
        
        int index = getIndexFromString(part1,0); //get index where to put the brace , flag 0 because its first part of the string
        part1 = part1.substring(0, index) + "(" + part1.substring(index, part1.length()) + ")"; //adding brace to the String
        
        
        System.out.println("new-part1- "+part1);
        
        index = getIndexFromString(part2, 1); //get index where to put the brace , flag 1 because its second part of the string
        System.out.println("part2 index - "+index);
        System.out.println("part2 length - "+part1.length());
        part2 = "(" + part2.substring(0, index) + ")" + part2.substring(index, part2.length()); //adding brace to the String
        
        
        System.out.println(part1+part2);
        return part1+part2;
    }
    
    
    public String parseStringWithBraces(String Formula) {
        String string = Formula;
        String[] parts = string.split("[*]"); //split string from *
        
        int arrayLength = parts.length;
        System.out.println("array - "+arrayLength);
        
        String part1 = parts[0]; // 004
        String part2 = parts[1]; // 034556
        
       String new_string = parts[0];
       
       for(int i=1; i< parts.length; i++){ 
           new_string = this.addBracesToParts(new_string, parts[i]);
       }
       
       return new_string;
        
    }
    
    
    public FormulaElement parseFormula(String Formula) {
        
        
        

        StringTokenizer tokenizer = new StringTokenizer(Formula, "+-/^() \t", true);

        Vector<Object> tokens = new Vector<Object>();
        while (tokenizer.hasMoreTokens()) {// Filtering the compound elements and white sapces and new tab
            String t = tokenizer.nextToken();
            if (Character.isDigit(t.charAt(0)) && Character.isLetter(t.charAt(t.length() - 1))) { //checking whether ther are compund elemts where frist character a Digit and Second character a Letter
                int i = 1;
                while (Character.isDigit(t.charAt(i))) {
                    i++;
                }
                tokens.add(t.substring(0, i)); //Adding the Digit part of the Toaken to the vector
                tokens.add(t.substring(i));  //Adding the Letter containg part of the token to the vector
            } else {
                if (!t.equals(" ") && !t.equals("/t")) { //checking whether token contains any White spaces and tabs
                    tokens.add(t);
                }
            }
        }
        
        System.out.println("Initial Tokens - "+tokens);

        for (int i = 0; i < tokens.size(); i++) {
            if (tokens.get(i) instanceof String) {
                String s = (String) tokens.get(i);
                if (s.equals("(")) {
                    tokens.remove(i);
                    
                    System.out.println("After removing token - "+tokens);
                    
                    s = (String) tokens.get(i);
                    int count = 1;
                    String out = "";

                    while (!s.equals(")") || count != 1) {
                        switch (s) {
                            case "(":
                                count++;
                                break;
                            case ")":
                                count--;
                                break;
                        }
                        out = out + s;
                        tokens.remove(i);
                        s = (String) tokens.get(i);
                    }
                    
                

                    if (i > 0 && tokens.get(i - 1) instanceof String) {
                        String p = (String) tokens.get(i - 1);
                        if (p.toLowerCase().equals("cos") || p.toLowerCase().equals("sin")) {
                            tokens.add(i, "(");
                            tokens.add(i + 1, parseFormula(out));
                        } else {
                            tokens.remove(i);
                            tokens.add(i, parseFormula(out));
                        }
                    } else {
                        tokens.remove(i);
                        tokens.add(i, parseFormula(out));
                    }
                }
            }
        }

        
        for (int i = 0; i < tokens.size(); i++) { //Checking the elements in vector for constants and variables
            if (tokens.get(i) instanceof String) {
                String s = (String) tokens.get(i); //Getting the element at the vector ith possition and convert it to a String
                if (Character.isDigit(s.charAt(0))) { //Checking whether the current vector element is a Digit 
                    tokens.remove(i); 
                    tokens.add(i, new ConstantElement(Double.valueOf(s))); //Create a Ojbect of ConstantElement class and pass it to Vector at the previous position element
                } else if (Character.isLetter(s.charAt(0)) && !s.toLowerCase().equals("cos") && !s.toLowerCase().equals("sin")) { //Check whether the current vector elements is a letter and it is not either cos or sin words
                    tokens.remove(i);
                    tokens.add(i, new VariableElement(s)); //Create a Ojbect of VariableElement class and pass it to Vector at the previous position element
                }
            }
        }
        
        
        for (int i = 0; i < tokens.size() - 1; i++) { //checking for 2 constants or variable or constant and a variable that are stored concecatively 
            if ((tokens.get(i) instanceof VariableElement || tokens.get(i) instanceof ConstantElement || tokens.get(i) instanceof FunctionElement)
                    && (tokens.get(i + 1) instanceof VariableElement || tokens.get(i + 1) instanceof ConstantElement || tokens.get(i + 1) instanceof FunctionElement)) { //Checking whether the current element and the next element in the vector is a instance of VariableElement or ConstantElement or FunctionElement

                MultipleFunctionElement mul = new MultipleFunctionElement(); //create a instance of MultipleFunctionElement 
                mul.setArguments((FormulaElement) tokens.get(i));
                mul.setArguments((FormulaElement) tokens.get(i + 1));
                
                //remove elemnts that are passed to the MultipleFunctionElement instance
                tokens.remove(i);
                tokens.remove(i);

                tokens.add(i, mul); //add MultipleFunctionElement to the vector at the positions previously removed elements are located
            }
        }


        for (int i = 0; i < tokens.size() - 3; i++) {
            if (tokens.get(i).toString().toLowerCase().equals("cos")) { //checking for cos functions in the vector
                CosineFunctionElement cos = new CosineFunctionElement();

                cos.setArguments((FormulaElement) tokens.get(i + 2));

                tokens.remove(i); 
                tokens.remove(i);
                tokens.remove(i); 
                tokens.remove(i); 

                tokens.add(i, cos);
            }
            if (tokens.get(i).toString().toLowerCase().equals("sin")) { //checking for sin functions in the vector
                SineFunctionElement sin = new SineFunctionElement();

                sin.setArguments((FormulaElement) tokens.get(i + 2));

                tokens.remove(i); 
                tokens.remove(i); 
                tokens.remove(i); 
                tokens.remove(i); 

                tokens.add(i, sin);
            }
        }

        for (int i = 1; i < tokens.size() - 1; i++) {
            if (tokens.get(i).toString().equals("^")) { //checking for power functions in the vector
                PowerFunctionElement pow = new PowerFunctionElement();

                //pass the elements around the power function location in the vector to the PowerFunctionElement instance
                pow.setArguments((FormulaElement) tokens.get(i - 1));
                pow.setArguments((FormulaElement) tokens.get(i + 1));

                tokens.remove(i - 1);
                tokens.remove(i - 1);
                tokens.remove(i - 1);

                tokens.add(i - 1, pow);
            }
        }

        for (int i = 0; i < tokens.size() - 1; i++) {
            if ((tokens.get(i) instanceof VariableElement || tokens.get(i) instanceof ConstantElement)
                    && (tokens.get(i + 1) instanceof VariableElement || tokens.get(i + 1) instanceof ConstantElement)) {

                MultipleFunctionElement mul = new MultipleFunctionElement();
                mul.setArguments((FormulaElement) tokens.get(i));
                mul.setArguments((FormulaElement) tokens.get(i + 1));

                tokens.remove(i); 
                tokens.remove(i); 

                tokens.add(i, mul);
            } else if (tokens.get(i).toString().equals("/")) {
                DivideFunctionElement div = new DivideFunctionElement();
                div.setArguments((FormulaElement) tokens.get(i - 1));
                div.setArguments((FormulaElement) tokens.get(i + 1));

                tokens.remove(i - 1);
                tokens.remove(i - 1);
                tokens.remove(i - 1);

                tokens.add(i - 1, div);
            }
        }

        for (int i = 1; i < tokens.size() - 1; i++) {
            if (tokens.get(i).toString().equals("+")) {
                PlusFunctionElement plu = new PlusFunctionElement();
                plu.setArguments((FormulaElement) tokens.get(i - 1));
                plu.setArguments((FormulaElement) tokens.get(i + 1));

                tokens.remove(i - 1);
                tokens.remove(i - 1);
                tokens.remove(i - 1);

                tokens.add(i - 1, plu);
                i--;
            } else if (tokens.get(i).toString().equals("-")) {
                MinusFunctionElement min = new MinusFunctionElement();
                min.setArguments((FormulaElement) tokens.get(i - 1));
                min.setArguments((FormulaElement) tokens.get(i + 1));

                tokens.remove(i - 1);
                tokens.remove(i - 1);
                tokens.remove(i - 1);

                tokens.add(i - 1, min);
                i--;
            }
        }


        return (FormulaElement) tokens.get(0);
    
    }
    
    
    
    

    
   
    
//    public static void main(String[] args) 
//    {
//        
//        String eqn = "(x+2(3+4*2(7/7+6*4))-5)";
//        String eq2 = "(6+2)+2(2cos(5))";
//        String eq3 = "4+2*3";
//
//        FormulaElement test_fe = new FormulaElement();
//        
//        
//        String this_string = test_fe.parseStringWithBraces(eq3);
//        System.out.println("formulae - "+this_string);
//        
//        FormulaElement fe= test_fe.parseFormula(this_string);
//        
//        
//        System.out.println(fe);
//        fe.setVariableValue("x", 5);
//        System.out.println(fe);
//        System.out.println(fe.isFullyGrounded());
//        
////        fe.setVariableValue("y", 15);
////        System.out.println(fe);
////        System.out.println(fe.isFullyGrounded());
//        System.out.println(fe.evaluate());
//        
//    }
    
    
    
    
}
