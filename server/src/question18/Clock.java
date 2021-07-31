package question18;

// 時計を表すClockクラスを作成します。
// 次のフィールド、コンストラクタ、メソッドを作成し、Clock.javaとして保存します。

// フィールドを作成する
// 時間を表すtimeをString型で宣言する
// コンストラクタを作成する
// 引数：
// time:String型
// 処理内容：引数で与えられた値を、同名のフィールドに代入する。
// showTimeメソッドを作成する
// 引数：なし
// 戻り値：なし
// 処理内容：「xxxxです。」と表示する。xxxxは、フィールドtimeの値

public class Clock {
    
    String time;
    
    public Clock(String time) {
        
        this.time = time;
        
    }
    
    public void showTime() {
        System.out.println(this.time + "です");
    }
}
