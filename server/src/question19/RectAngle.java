package question19;

// 長方形を表すRectAngleクラスを作成します。
// 次のフィールド、コンストラクタ、メソッドを作成し、RectAngle.javaとして保存します。

// フィールドを作成する
// 幅を表すwidthをint型で宣言する
// 高さを表すheightをint型で宣言する
// コンストラクタを作成する
// 引数：
// width:int型
// height:int型
// 処理内容：引数で与えられた値を、同名のフィールドに代入する。
// getMensekiメソッドを作成する
// 引数：なし
// 戻り値：なし
// 処理内容：フィールドwidthとheightの積を戻り値として返す


public class RectAngle {
    
    int width;
    int height;
    
    public RectAngle(int width, int height) {
        
        
        this.width = width;
        this.height = height;
        
    }
    
    
    public int getMenseki() {
        
        return this.width * this.height;
        
    }
    
}
