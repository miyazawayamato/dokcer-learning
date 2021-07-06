package question7;

public class Circle{
    
    int PI;
    int radius;
    
    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    public double getEnsyu(){
        return 2*PI*this.radius;
    }
    public double getMenseki(){
        return this.radius * this.radius * PI;
    }
}