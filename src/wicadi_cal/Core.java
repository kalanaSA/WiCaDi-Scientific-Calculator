package wicadi_cal;

public class Core {
    
    private StringBuffer sb;
    

    public Core() {
        sb = new StringBuffer();
    }
    
    public void addInput(String input) {
        this.sb = this.sb.append(input);
    }
    
    public String getStringInput() {
        return this.sb.toString();
    }
    
    public void removeCharacter() {
        this.sb.setLength(this.sb.length() - 1);
    }
    
    public void emptyInputs() {
        this.sb.delete(0, this.sb.length());
    }
    
}
