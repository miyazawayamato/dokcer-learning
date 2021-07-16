package question12;
//実行結果
// ハンバーガーセット
// ---
// ハンバーガー：150円
// オレンジジュース：100円
// ---
// セット価格：200円

public class Main {
    public static void main(String[] args) {
        //ハンバーガーを生成
        Menu sandwitch = new Menu("ハンバーガー", 150);
        //オレンジジュースを生成
        Menu drink = new Menu("オレンジジュース", 100);
        //セットメニューを生成
        SetMenu burgerset = new SetMenu("ハンバーガーセット", sandwitch, drink);

        //セットメニューを表示
        burgerset.display();
    }
}
