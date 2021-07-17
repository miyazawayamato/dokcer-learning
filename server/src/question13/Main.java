package question13;

// 勇者：タロウ
// HP：20
// 攻撃力:10
// ---
// 勇者：タロウ
// HP：20
// 攻撃力:10　+10

public class Main {
    public static void main(String[] args) {
        Yusha taro = new Yusha("タロウ", 20, 10);
        taro.displayStatus();
        System.out.println("---");
        taro.buki = new Buki("鉄の剣", 10);
        taro.displayStatus();
    }
}
