package question6;

public class Calculator {
    
    double tax;
    
    public void setTax(final double tax) {
        
        this.tax = tax;
        
    }
    
    public int calc(final int price) {
        
        return (int)(price * (1+tax));
    }
    
}
