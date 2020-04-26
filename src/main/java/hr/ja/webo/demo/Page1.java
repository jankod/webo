package hr.ja.webo.demo;

import hr.ja.webo.Page;
import hr.ja.webo.widget.Card;
import hr.ja.webo.widget.Label;
import hr.ja.webo.widget.PageUrl;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;

@Slf4j
@PageUrl("/")
public class Page1 extends Page {

    String data = "session ";

    public Page1() {
    }


    @Override
    public void render(HttpServletRequest req, HttpServletResponse resp) {
        log.debug("before render");
        setTitle("Page 1 " + LocalDateTime.now());
        add(new Label("pero ovo dela"));
        add(new Card("Ovo je card title"));
    }

}