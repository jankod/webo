package hr.ja.webo.util;

import freemarker.template.Configuration;
import hr.ja.webo.demo.Page1;
import hr.ja.webo.widget.Card;
import lombok.extern.slf4j.Slf4j;
import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

import java.util.HashMap;
import java.util.Map;


@Slf4j
public class WeboUtil {
    Configuration configuration;
    FreeMarkerEngine engine;

    public WeboUtil() {

        configuration = new Configuration(Configuration.VERSION_2_3_26);
        configuration.setClassLoaderForTemplateLoading(WeboUtil.class.getClassLoader(), "");
        //   ClassTemplateLoader loader = new ClassTemplateLoader(Page.class, "/hr/ja/web");

        engine = new FreeMarkerEngine(configuration);
    }

    private static WeboUtil instance = new WeboUtil();

    public static String template(Class<Card> cardClass, Object model) {
        Map<String, Object> map = new HashMap<>();
        map.put("model", model);
        String templatePath = getTemplatePath(cardClass);
        return instance.engine.render(new ModelAndView(map, templatePath));
    }

    public static FreeMarkerEngine getEngine() {
        return instance.engine;
    }

    public static void main(String[] args) {
        Class<Card> c = Card.class;

    }

    public static String getTemplatePath(Class<? extends Object> clazz) {
        String path = clazz.getSimpleName() + ".ftl";
        String templatePath = clazz.getPackageName();
        templatePath = "/" + templatePath.replace(".", "/") + "/" + path;
        return templatePath;
    }


    public static PageUrl url(Class<Page1> page1Class) {
        return null;
    }
}
