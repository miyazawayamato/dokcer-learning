package question13;
// Yusyaクラスはゲーム内の主人公「勇者」を扱うクラスです。
// 次のフィールド、コンストラクタ、メソッドを作成し、Yusha.javaとして保存します。
// フィールドを作成する
// 名前を表すnameをString型で宣言する
// 攻撃力を表すatkをint型で宣言する
// コンストラクタを作成する
// 引数：
// name:String型
// atk:int型
// 処理内容：引数で与えられた値を、同名のメンバ変数に代入する。
// displayStatusメソッドを作成する
// 引数：なし
// 処理内容：
// 「勇者：XXXX」と表示する。※XXXXはフィールドname
// 「HP：YYY」と表示する。※YYYはフィールドhp
// 攻撃力を表示する。
// 武器を装備していない（null）場合
// 　「攻撃力:ZZZ」と表示する。※ZZZはフィールドatk
// 武器を装備している場合
// 　「攻撃力:ZZZ +A」と表示する。※zzzはフィールドatk、Aはフィールドbukiが持つatk

public class Yusha {
    String name;    //名前
    int hp;         //HP
    int atk;        //攻撃力
    Buki buki;      //武器

    /**
     * コンストラクタ
     */
    public Yusha(String name, int hp, int atk) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
    }

    /**
     * displayStatusメソッド
     */
    public void displayStatus() {
        System.out.println("勇者：" + name);
        System.out.println("HP：" + hp);
        
        if (buki == null) {     //武器を持たない場合
            System.out.println("攻撃力:" + atk);
        } else {    //武器を持つ場合
            System.out.println("攻撃力:" + atk + "　+" + buki.atk );
        }
    }
}
