package question9;
// 下のShopクラスの仕様に基づいて、Shop.javaを作成してください。
// 提供コードのMain.javaをShop.javaと同じフォルダ内に保存して動作確認し、実行結果が得られることを確認してください。
// (仕様)
// Shopクラスは店の商品を扱うクラスです。下記に基づいて作成をしてください。
// メンバ変数を作成する
// 店名を表すnameをString型で宣言する
// 売上高を表すsalesをint型で宣言する
// コンストラクタ①を作成する
// 引数：
// name:String型
// sales:int型
// 処理内容：引数で与えられた値を、同名のメンバ変数に代入する。
// コンストラクタ②を作成する（２つ目）
// 引数：なし
// 処理内容：コンストラクタ①を呼び出す。第１引数には"出店予定"の文字列を渡し、第２引数には0を渡す。
// displayメソッドを作成する
// 引数：なし
// 処理内容：インスタンスの内容を表示する。実行結果を参考にして作成。
public class Main {
    public static void main(String[] args) {
        Shop s1 = new Shop("A町店", 150000);
        Shop s2 = new Shop("B公園前店", 180000);
        Shop s3 = new Shop();

        s1.display();
        s2.display();
        s3.display();
    }
}
