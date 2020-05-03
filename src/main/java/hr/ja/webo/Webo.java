package hr.ja.webo;


import hr.ja.webo.util.WeboUtil;
import hr.ja.webo.widget.PageUrl;
import lombok.Data;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import spark.ModelAndView;
import spark.Spark;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.get;

@Slf4j
@Data
public class Webo {

    private List<Class<? extends Page>> pages = new ArrayList<>();

    public void add(Class<? extends Page> pageClass) {
        pages.add(pageClass);
    }

//    private FreeMarkerEngine engine;

    public Webo() {
//        Configuration configuration = new Configuration(Configuration.VERSION_2_3_26);
//        configuration.setClassForTemplateLoading(FreeMarkerEngine.class, "");
//        engine = new FreeMarkerEngine(configuration);
    }

    public void start() {
        Spark.staticFiles.location("/public");
        for (Class<? extends Page> pageClass : pages) {
            String url = pageClass.getAnnotation(PageUrl.class).value();
            get(url, (req, res) -> {

                Page page = instantiatePage(pageClass);
                page.render(req.raw(), res.raw());
                Map<String, Object> attributes = new HashMap<>();
                attributes.put("page", page);
                String templatePath = WeboUtil.getTemplatePath(Page.class);
                return new ModelAndView(attributes, templatePath);
            }, WeboUtil.getEngine());
        }

        log.debug("Start at localhost:" + Spark.port());

    }

    @SneakyThrows
    private Page instantiatePage(Class<? extends Page> pageClass) {
        Page page = pageClass.getConstructor().newInstance();
        return page;
    }

}
