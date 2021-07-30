package question17;

// 戦士の攻撃!
// 敵に10のダメージ!!
// 魔法戦士の魔法攻撃!
// 敵に30のダメージ!

public class Main {
    public static void main(String[] args) {
        Fighter fighter = new Fighter();
        fighter.attack();

        MagicFighter magicFighter = new MagicFighter();
        magicFighter.attack();
    }
}
