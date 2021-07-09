package question8;

// 下のItemクラスの仕様に基づいて、Item.javaを作成してください。
// 提供コードのMain.javaをItem.javaと同じフォルダ内に保存して動作確認し、実行結果が得られることを確認してください。
// (仕様)
// Itemクラスは店の商品を扱うクラスです。下記に基づいて作成をしてください。

// 次のメンバ変数を作成する
// 商品名を表すnameをString型で宣言する
// 価格を表すpriceをint型で宣言する
// コンストラクタを作成する
// 引数：
// name:String型
// price:int型
// 処理内容：引数で与えられた値を、同名のメンバ変数に代入する。
// displayメソッドを作成する
// 引数：なし
// 処理内容：インスタンスの内容を表示する。実行結果を参考にして作成。

public class Main{
    public static void main(String[] args){
        Item i1 = new Item("コーヒー", 120);
        Item i2 = new Item("オレンジジュース", 150);

        i1.display();
        i2.display();
    }
}
