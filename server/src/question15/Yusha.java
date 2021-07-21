package question15;
// ゲームに登場する勇者を表すYushaクラスを作成します。
// 次のフィールド、コンストラクタ、メソッドを作成し、Yusha.javaとして保存します。

// フィールドを作成する
// 名前を表すnameをString型で宣言する
// 攻撃力を表すatkをint型で宣言する
// コンストラクタを作成する
// 引数：
// name:String型
// atk:int型
// 処理内容：引数で与えられた値を、同名のメンバ変数に代入する。
// attackメソッドを作成する
// 引数：
// 攻撃対象を表すMonster型の引数 target
// 処理内容：
// 攻撃対象のhpを減らす。減らす量は勇者の攻撃力の値とする
// 「xxxxにyyyのダメージ!」と表示する。xxxxは攻撃対象モンスターの名前。yyyはHPを減らした量
public class Yusha {
    
    String name;
    int atk;
    
    public Yusha(String name, int atk) {
        
        this.name = name;
        this.atk = atk;
        
    }
    
    public void attack(Monster target) {
        
        target.hp -= this.atk;
        System.out.println( target.name + "に" + this.atk + "のダメージ!");
        
    }
    
}
