package question12;
// SetMenuクラスはハンバーガーショップのセット商品を扱うクラスです。
// 次のフィールド、コンストラクタ、メソッドを作成し、SetMenu.javaとして保存します。

// フィールドを作成する
// セット商品名を表すnameをString型で宣言する
// ハンバーガーを表すsandwichをMenu型で宣言する
// ドリンクを表すdrinkをMenu型で宣言する
// コンストラクタを作成する
// 引数：
// name:String型
// sandwich:Menu型
// drink:Menu型
// 処理内容：引数で与えられた値を、同名のメンバ変数に代入する。
// displayメソッドを作成する
// 引数：なし
// 処理内容：
// セット商品名を表示する
// 「---」を表示する
// ハンバーガーを表すMenuインスタンスのdisplayメソッドを呼び出す
// ドリンクを表すMenuインスタンスのdisplayメソッドを呼び出す
// 「---」を表示する
// 価格を実行結果のように表示する。但し、各商品合計額の20%引きとする

public class SetMenu {
    
    String name;
    Menu sandwich;
    Menu drink;
    
    public SetMenu(String name, Menu sandwich, Menu drink) {
        this.name = name;
        this.sandwich = sandwich;
        this.drink = drink;
    }
    
    
    public void display() {
        System.out.println(this.name);
        System.out.println("---");
        sandwich.display();
        drink.display();
        System.out.println("---");

        int price = (int)((sandwich.price + drink.price)*0.8);
        System.out.println("セット価格：" + price + "円" );
    }
    
}
