package question16;

// タロウは通常業務を行ないます。
// ハナコは通常業務を行ないます。
// ハナコは管理業務を行ないます。

public class Main {
    public static void main(String[] args) {
        Employee taro = new Employee();
        taro.name = "タロウ";

        Manager hanako = new Manager();
        hanako.name = "ハナコ";

        taro.operation();       //①
        hanako.operation();     //②
        hanako.management();    //③
    }
}
