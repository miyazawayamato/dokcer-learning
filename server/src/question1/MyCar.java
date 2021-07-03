package question1;
// AbstractAutomobileクラス（自動車クラス）を継承
// MyCarクラスは、以下の条件とする。
// 車種区分：普通者
// 車種（モデル）：自家用ワンボックス車
// 乗車定員：7人

public class MyCar extends AbstractAutomobile{
    
    MyCar() {
        super(CarType.STANDERD_CAR);
    }
    
    private int Capacity = 7;
    private String CarModel = "自家用ワンボックス車";
    
    @Override //忘れない
    public  int getCapacity() {
        return this.Capacity;
    }
    
    @Override
    public String getCarModel() {
        return this.CarModel;
    }
}
