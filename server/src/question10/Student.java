package question10;
// showメソッドを作成する
// 引数：なし
// 処理内容：インスタンスの内容を表示する。実行結果を参考にして作成。
// Mainクラスのmainメソッドでは次の処理を行なっています。参考にしながら提供コードのコメント部分に追記してください。
// (mainメソッドの動作)

// Student型の配列studentsを宣言する
// 配列の各要素に次の３名の成績をインスタンスとして代入する
// 名前：タロウ　国語：80点,数学：75点,英語：90点
// 名前：ハナコ　国語：90点,数学：70点,英語：80点
// 名前：ジロウ　欠席のため未受験。各科目0点
// 「成績表」と表示する
// 配列の各要素が指すインスタンスのshowメソッドを呼び出し、3名の得点を表示する。

public class Student {
    String name;
    int koku;
    int su;
    int ei;
    
    

    public Student(String name, int koku, int su, int ei) {
        this.name = name;
        this.koku = koku;
        this.su = su;
        this.ei = ei;
    }
    
    public Student(String name) {
        this(name, 0, 0, 0);
    }
    
    public void show() {
        System.out.println( name + ":" + koku + "," + su + "," + ei);
    }
}
