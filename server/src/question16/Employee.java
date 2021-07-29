package question16;

// 従業員を表すEmployeeクラスを作成します。次のフィールド、メソッドを作成し、Employee.javaとして保存します。

// フィールドを作成する
// 表示名を表すnameをString型で宣言します。
// operationメソッドを作成します。
// 引数：なし
// 戻り値：なし
// 処理内容：「xxxは通常業務を行ないます。」と表示します。
// ※ xxxはnameフィールドを示しています。

public class Employee {
    
    String name;
    
    public void operation() {
        System.out.println( this.name + "は通常業務を行ないます。");
    }
    
}
