package question18;

// アラームつき時計を表すAlarmClockクラスを、Clockクラスを継承して作成します。
// 次のフィールド、コンストラクタ、メソッドを追加し、AlarmClock.javaとして保存します。

// フィールドを作成する
// アラーム設定時間を表すalarmTimeをString型で宣言する
// コンストラクタを作成する
// 引数： time:String型
// 処理内容：引数で与えられた値を使って、スーパークラスのコンストラクタを呼び出す
// alarmメソッドを作成する
// 引数：なし
// 戻り値：なし
// 処理内容：
// フィールドtimeとalarmTimeの値を比較して同じなら、「アラームが鳴りました!」と表示する
// setAlarmメソッドを作成する
// 引数：time:String型
// 戻り値：なし
// 処理内容：
// 引数で与えられた値を、フィールドalarmTimeに代入する

public class AlarmClock extends Clock{
    
    String alarmTime;
    
    public AlarmClock(String time) {
        
        super(time);
        
    }
    
    
    public void alarm() {
        //書き方
        // equalsメソッドの書き方は、比較する文字列1と比較する文字列2が存在する場合次のように記載します。
        // 文字列1.equals(文字列2)
        if (time.equals(alarmTime)) {
            System.out.println("アラームが鳴りました!!");
        }
    }
    
    // int型などのプリミティブ型で２つの値が等しいか比較する場合は”==”演算子で比較しますが、String型などの参照型の場合はequalsメソッドで比較する必要があります。
    // String型などの参照型の場合に”==”演算子で比較すると参照先が同じかどうかを比較することになります。参照先の値を比較する訳ではありません。
    
    public void setAlarm(String time) {
        this.alarmTime = time;
    }
    
}
