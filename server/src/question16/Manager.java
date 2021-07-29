package question16;

// 従業員の管理者を表すManagerクラスを、Employeeクラスを継承して作成します。次のメソッドを作成し、Manager.javaとして保存します。

// managementメソッドを作成する
// 引数：なし
// 戻り値：なし
// 処理内容：「xxxは管理業務を行ないます。」と表示します。
// ※ xxxはnameフィールドを示しています。

public class Manager extends Employee{
    
    public void management() {
        System.out.println( this.name + "は管理業務を行ないます。" );
    }
    
}
