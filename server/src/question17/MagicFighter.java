package question17;

// RPGに登場する魔法戦士を表すMagicFighterクラスを、Fighterクラスを継承して作成します。
// 次のフィールド、コンストラクタ、メソッドを追加し、MagicFighter.javaとして保存します。

// フィールドを作成する
// 魔力を表すmpをint型で宣言する
// コンストラクタを作成する
// 引数:なし
// 処理内容：
// フィールドnameに、「戦士」を代入する
// フィールドmpに、10を代入する
// attackメソッドをオーバーライドする
// 処理内容：
// 「xxxの攻撃!」と表示する。xxxはフィールドname
// *「敵にyyのダメージ!」と表示する。yyはフィールドatkとmpの合計値

public class MagicFighter extends Fighter{
    
    int mp;
    
    public MagicFighter() {
        this.name = "魔法戦士";
        this.mp = 20;
    }

    public void attack() {
        System.out.println(this.name + "の魔法攻撃!");
        //書き方
        System.out.println( "敵に" + (this.atk + this.mp) + "のダメージ!");
    }
    
}
