package hr.ja.webo.demo;

import hr.ja.webo.Page;
import hr.ja.webo.util.Request;
import hr.ja.webo.widget.Card;
import hr.ja.webo.widget.Label;
import hr.ja.webo.widget.PageUrl;
import hr.ja.webo.widget.Widget;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;

@Slf4j
@PageUrl("/")
public class Page1 extends Page {

    private final Card card;
    private final Label cardTitle = new Label("");

    public Page1 () {
        setTitle("Page 1");
        card = createCard();
        add(card);
    }

    @Override
    public void render(HttpServletRequest req, HttpServletResponse resp) {
        cardTitle.setText("pero " + LocalDateTime.now());
    }

    private Card createCard() {

        Card card = new Card();
        card.setHeader(cardTitle);
        card.setBody(new Label("body 2"));
        card.setFooter(new Label("foother 222 sadsda sdsdf"));
        return card;
    }

}