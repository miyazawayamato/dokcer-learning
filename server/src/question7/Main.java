package question7;

// 下のCircleクラスの仕様に基づいて、Circle.javaを作成してください。
// 提供コードのMain.javaとCircle.javaと同じフォルダ内に保存して動作確認し、実行結果が得られることを確認してください。
// (Circleクラスの仕様)
// Circleクラスは円を扱うクラスです。次のメンバ変数（フィールド）を作成してください。
// 円周率を表すPIをint型の定数として宣言する
// 半径を表すradiusをint型で宣言する
// setRadiusメソッドを作成する。
// 引数：radius:int型
// 戻り値：なし
// 処理内容：引数 radiusの値を、メンバ変数radiusへ代入する
// getEnsyuメソッドを作成する。
// 引数：なし
// 戻り値：double
// 処理内容：メンバ変数radiusからその円周の長さを求め、戻り値として返す
// getMensekiメソッドを作成する。
// 引数：なし
// 戻り値：double
// 処理内容：メンバ変数 radiusからその円の面積を求め、戻り値として返す

// 50.24
// 200.96

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(8);
        System.out.println(c1.getEnsyu());
        System.out.println(c1.getMenseki());
    }
}
