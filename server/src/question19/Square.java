package question19;

// 正方形を表すSquareクラスを、Rectangleクラスを継承して作成します。
// 次のコンストラクタを追加し、Square.javaとして保存します。

// コンストラクタを作成する
// 引数： width:int型
// 処理内容：引数で与えられた値をうまく使って、スーパークラスのコンストラクタを呼び出す

public class Square extends RectAngle{
    
    public Square(int width) {
        super(width, width);
    }
    
}
