package trump;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Trump {


    /** 全カード */
    private List<Card> trumps;

    /**
     * コンストラクタ
     * ここで全カードを生成
     */
    public Trump() {
        trumps = new ArrayList<>(52);
        for (int i = 0; i < Card.SUIT.length; i++) {
            for (int j = 0; j < Card.MAX_NUMBER; j++) {
                String suit = Card.SUIT[i];
                int number = j + 1;
                trumps.add(new Card(suit, number));
            }
        }
    }

    /** カードを一番上から一枚引く */
    public Card draw() {
        return trumps.remove(0);
    }

    /**
     * カードを指定した位置から一枚引く
     * 指定した位置にカードが無ければ
     * 一番上から一枚引く
     * @param index 指定位置
     * @return
     */
    public Card draw(int index) {
        if (index >= trumps.size()) {
            index = 0;
        }
        return trumps.remove(index);
    }

    /** シャッフル */
    public void shuffle() {
        Collections.shuffle(trumps);
    }

    @Override
    public String toString() {
        return trumps.toString();
    }

}
