package question5;

// 下のStudentクラスの仕様に基づいて、Student.javaを作成してください。
// 提供コードのMain.javaとStudent.javaと同じフォルダ内に保存して動作確認し、実行結果が得られることを確認してください。
// (Studentクラスの仕様)
// Studentクラスは店を扱うクラスです。次のメンバ変数（フィールド）を作成してください。
// 名前を表すnameをString型で宣言する
// 得点を表すscoreをint型で宣言する
// showScoreメソッドを作成する。
// 引数：なし
// 戻り値：なし
// 処理内容：メンバ変数を用いて「nameさんの得点はscore点です。」と表示する。

// タロウさんの得点は75点です。
// ハナコさんの得点は80点です。

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "タロウ";
        s1.score = 75;
        s2.name = "ハナコ";
        s2.score = 80;

        s1.showScore();
        s2.showScore();
    }
}
