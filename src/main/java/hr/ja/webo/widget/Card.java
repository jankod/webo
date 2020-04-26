package hr.ja.webo.widget;

import hr.ja.webo.util.WeboUtil;
import lombok.Getter;

@Getter
public class Card extends Widget {

    private String title;

    public Card(String title) {
        this.title = title;
    }

    @Override
    public String html() {
        return WeboUtil.template(Card.class, this);
    }
}
