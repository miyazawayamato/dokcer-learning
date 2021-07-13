package question11;
// 下のDaikeiクラスの仕様に基づいて、Daikei.javaを作成してください。
// (仕様)
// Daikeiクラスは台形を扱うクラスです。下記に基づいて作成をしてください。

// メンバ変数を作成する
// 上底を表すjyoteiをint型で宣言する
// 下底を表すkateiをint型で宣言する
// 高さを表すtakasaをint型で宣言する
// コンストラクタ①を作成する
// 引数：
// jyotei:int型
// katei:int型
// takasa:int型
// 処理内容：引数で与えられた値を、同名のメンバ変数に代入する。
// getMensekiメソッドを作成する
// 引数：なし
// 処理内容：メンバ変数のjyotei,katei,takasaを使って、面積( (上底+下底)×高さ÷2 )を求めてその値を返す。 ※小数点は切捨て
// 提供コードのMain.javaをDaikei.javaと同じフォルダに配置します。
// Mainクラスのmainメソッドでは次の処理を行なっています。参考にしながら提供コードのコメント部分に追記してください。
// (mainメソッドの動作)

// 上底:12、下底:8、高さ:5の台形を表すインスタンスを生成し、変数d1に代入する。
// 上底:8、下底:4、高さ:10の台形を表すインスタンスを生成し、変数d2に代入する。
// d1,d2のgetMensekiメソッドをそれぞれ呼び出し、その戻り値を表示する。

public class Main {
    public static void main(String[] args) {
        //ここにプログラムを書きます。
        Daikei d1 = new Daikei(12, 8, 5);
        Daikei d2 = new Daikei(8, 4, 10);
        
        System.out.println(d1.getMenseki());
        System.out.println(d2.getMenseki());
    }
}
