import trump.Card;
import trump.Trump;

public class Main {

    public static void main(String[] args) {
        // トランプを生成
        Trump trump = new Trump();

        // トランプ全表示
        System.out.println(trump);

        // 上からカードを一枚引く
        Card card = trump.draw();

        // 引いたカードの表示
        System.out.println(card);

        // 引いたカードの番号を表示
        System.out.println(card.getNumber());

        // 引いたカードのランクを表示
        System.out.println(card.getRank());

        // 引いたカードのマークを表示
        System.out.println(card.getSult());
    }

}
