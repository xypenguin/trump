package trump;

public class Card {

    // 定数

    /** マークの定数 */
    public static final String[] SUIT = { "スペード", "ハート", "ダイヤ", "クラブ" };

    /** 数値の最大 */
    public static final int MAX_NUMBER = 13;

    // フィールド

    /** マーク */
    private String suit;

    /** 番号 */
    private int number;

    /**
     * コンストラクタ
     * マークと番号を指定して生成
     * @param suit マーク
     * @param number 番号
     */
    public Card(String suit, int number) {
        this.suit = suit;
        this.number = number;
    }

    // ゲッター

    public String getSult() {
        return suit;
    }

    public int getNumber() {
        return number;
    }

    /**
     * ランクを返す
     * 1 -> A
     * 11 -> J
     * 12 -> Q
     * 13 -> K
     * の変換を行って返す
     */
    public String getRank() {
        switch (number) {
        case 1:
            return "A";
        case 11:
            return "J";
        case 12:
            return "Q";
        case 13:
            return "K";
        default:
            return String.valueOf(number);
        }
    }

    @Override
    public String toString() {
        return "[" + getSult() + ", " + getRank() + "]";
    }

}