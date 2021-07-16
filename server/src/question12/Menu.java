package question12;
// Menuクラスはハンバーガーショップの商品を扱うクラスです。
// 次のフィールド、コンストラクタ、メソッドを作成し、Menu.javaとして保存します。

// フィールドを作成する
// 商品名を表すnameをString型で宣言する
// 価格を表すpriceをint型で宣言する
// コンストラクタを作成する
// 引数：
// name:String型
// price:int型
// 処理内容：引数で与えられた値を、同名のメンバ変数に代入する。
// displayメソッドを作成する
// 引数：なし
// 処理内容：次の書式で画面に表示する。
// 「XXXXXX：YYY円」
// ※XXXXXX は、メンバ変数nameを表示
// ※YYYは、メンバ変数priceを表示

public class Menu {
    
    String name;
    int price;
    
    public Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
    public void display() {
        System.out.println(this.name + ":" + this.price);
    }
}
