package hr.ja;

import hr.ja.webo.Webo;
import hr.ja.webo.demo.Page1;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {

        Webo web = new Webo();
        web.add(Page1.class);
        web.start();

      //  URL resource1 = Main.class.getResource("pero.ftl");

        //log.debug("res {}", resource1);

    }
}


