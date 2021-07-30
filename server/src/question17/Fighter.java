package question17;

// RPGに登場する戦士を表すFighterクラスを作成します。
// 次のフィールド、コンストラクタを作成し、Fighter.javaとして保存します。

// フィールドを作成する
// 職業名を表すnameをString型で宣言する
// 攻撃力を表すatkをint型で宣言する
// コンストラクタを作成する
// 引数：なし
// 処理内容：
// フィールドnameに、「戦士」を代入する
// フィールドatkに、10を代入する
// attackメソッドを作成する
// 引数：なし
// 戻り値：なし
// 処理内容：
// 「xxxの攻撃!」と表示する。※xxxはnameフィールドの値
// 「yyyのダメージ!」と表示する。※yyyはatkフィールドの値

public class Fighter {
    
    String name;
    int atk;
    
    public Fighter() {
        this.name = "戦士";
        this.atk = 10;
        
    }
    
    public void attack() {
        System.out.println(this.name + "の攻撃!");
        System.out.println("敵に" + this.atk + "のダメージ!!" );
    }
    
}
