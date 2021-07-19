package question14;
// Nodeクラスはリスト構造を実現する単一データを扱うクラスです。
// 次のフィールド、コンストラクタ、メソッドを作成し、Node.javaとして保存します。

// フィールドを作成する
// 値を表すvalueをint型で宣言する
// 次のNodeインスタンスの参照を持つnextをNode型で宣言する
// コンストラクタを作成する
// 引数：
// value:int型
// 処理内容：引数で与えられた値を、同名のメンバ変数に代入する。
// displayメソッドを作成する
// 引数：なし
// 処理内容：
// フィールドvalueの値を表示する。
public class Node {
    
    int value;
    Node next; //次のノードへの参照
    
    public Node(int value) {
        
        this.value = value;
        
    }
    
    public void display() {
        System.out.println(value);
    }
    
}
