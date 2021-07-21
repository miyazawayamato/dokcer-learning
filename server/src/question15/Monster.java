package question15;
// ゲームに登場するモンスターを表すMonsterクラスを作成します。
// 次のフィールド、コンストラクタを作成し、Monster.javaとして保存します。
// フィールドを作成する
// 名前を表すnameをString型で宣言する
// 体力を表すhpをint型で宣言する
// コンストラクタを作成する
// 引数：
// name:String型
// hp:int型
// 処理内容：引数で与えられた値を、同名のメンバ変数に代入する。
public class Monster {
    
    String name;
    int hp;
    
    public Monster(String name, int hp) {
        
        this.name = name;
        this.hp = hp;
        
    }
}
