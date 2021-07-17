package question13;
// (仕様)
// Bukiクラスはゲーム内の武器を扱うクラスです。
// 次のフィールド、コンストラクタ、メソッドを作成し、Buki.javaとして保存します。

// フィールドを作成する
// 名前を表すnameをString型で宣言する
// 攻撃力を表すatkをint型で宣言する
// コンストラクタを作成する
// 引数：
// name:String型
// atk:int型
// 処理内容：引数で与えられた値を、同名のメンバ変数に代入する

public class Buki {
    
    String name;
    int atk;
    
    public Buki(String name, int atk) {
        this.name = name;
        this.atk = atk;
    }
    
}
