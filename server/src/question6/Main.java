package question6;

// 下のCalculatorクラスの仕様に基づいて、Calculator.javaを作成してください。
// 提供コードのMain.javaとCalculator.javaと同じフォルダ内に保存して動作確認し、実行結果が得られることを確認してください。
// (Calculatorクラスの仕様)
// Calculatorクラスは税込価格の計算を扱うクラスです。次のメンバ変数（フィールド）を作成してください。
// 税率を表すtaxをdouble型で宣言する
// setTaxメソッドを作成する。
// 引数：tax:double型
// 戻り値：なし
// 処理内容：引数 taxの値を、メンバ変数 taxに代入します。
// calcメソッドを作成する。
// 引数：price:int型
// 戻り値：int
// 処理内容：メンバ変数taxの持つ税率を使って、引数 priceの税込価格を計算して返します。計算結果が端数になった場合は切り捨てます。
// 税込(8%)1080
// 税込(10%)1100

public class Main {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();

        c1.setTax(0.08);
        c2.setTax(0.1);

        System.out.println("税込(8%)" + c1.calc(1000));
        System.out.println( "税込(10%)" + c2.calc(1000) );
    }
}
