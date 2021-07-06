package question3;

// 下のItemクラスの仕様に基づいて、Item.javaを作成してください。
// 提供コードのMain.javaをItem.javaと同じフォルダ内に保存して動作確認し、実行結果が得られることを確認してください。
// (仕様)
// Itemクラスは店の商品を扱うクラスです。次のメンバ変数（フィールド）を作成してください。
// 商品名を表すnameをString型で宣言する
// 価格を表すpriceをint型で宣言する

public class Main {
    public static void main(String[] args) {
        Item ringo = new Item();
        Item banana = new Item();
        ringo.name = "リンゴ";
        ringo.price = 150;
        banana.name = "バナナ";
        banana.price = 100;
        System.out.println(ringo.name);
        System.out.println(ringo.price);
        System.out.println(banana.name);
        System.out.println(banana.price);
    }
}
