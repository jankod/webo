package hr.ja.webo.demo;

import hr.ja.webo.Page;
import hr.ja.webo.Webo;
import hr.ja.webo.adminlte.AdminLte;
import hr.ja.webo.demo.Page1;
import hr.ja.webo.util.WeboUtil;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class Main {
    public static void main(String[] args) {
        String temp = """
                Ovo dela
                    """;

        log.debug(temp);
        AdminLte admin = new AdminLte();
        admin.getNavbar().addLink("page1", WeboUtil.url(Page1.class));

//        admin.getNavbar()
//                .addPage(Page1.class);

        admin.setTitle("Webooo");
        Webo web = new Webo();
        web.add(Page1.class);

        web.start();

        //  URL resource1 = Main.class.getResource("pero.ftl");

        //log.debug("res {}", resource1);

    }
}



