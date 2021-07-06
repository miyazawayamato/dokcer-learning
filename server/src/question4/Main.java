package question4;

// 下のShopクラスの仕様に基づいて、Shop.javaを作成してください。
// 提供コード中の①②を適切に埋めてください。
// 提供コードのMain.javaとShop.javaと同じフォルダ内に保存して動作確認し、実行結果が得られることを確認してください。
// (Shopクラスの仕様)
// Shopクラスは店を扱うクラスです。次のメンバ変数（フィールド）を作成してください。
// 名前を表すnameをString型で宣言する
// 売上金額を表すsaleをint型で宣言する

// パン屋 売上:100000
// 洋服屋 売上:150000

public class Main {
    public static void main(String[] args) {
        Shop s1 = new Shop();
        Shop s2 = new Shop();
        s1.name = "パン屋";
        s1.sale = 100000;
        s2.name = "洋服屋";
        s2.sale = 150000;
        System.out.println(s1.name + "売上:" + s1.sale);
        System.out.println(s2.name + "売上:" + s2.sale);
    }
}

