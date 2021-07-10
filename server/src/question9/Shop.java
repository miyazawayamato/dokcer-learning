package question9;

public class Shop {
    
    String name;
    int sales;
    
    public Shop(String name, int sales) {
        
        this.name = name;
        this.sales = sales;
        
    }
    
    public Shop() {
        
        //thisだけで良い
        this("出店予定", 0);
        
    }
    
    public void display() {
        System.out.println(this.name + ":売上高 " + this.sales + "円");
    }
}
