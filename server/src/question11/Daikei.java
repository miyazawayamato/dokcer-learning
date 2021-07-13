package question11;

public class Daikei {
    
    int jyotei;
    int katei;
    int takasa;
    
    public Daikei(int jyotei, int katei, int takasa) {
        
        this.jyotei = jyotei;
        this.katei = katei;
        this.takasa = takasa;
        
    }
    
    public int getMenseki() {
        
        int menseki = (this.jyotei + this.katei) * this.takasa / 2;
        
        return menseki;
    }
    
}
