package hr.ja.webo.util;

import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

public class Freemarker {

    private final Configuration configuration;
    private final StringTemplateLoader loader;

    Freemarker() {
        configuration = new Configuration(Configuration.VERSION_2_3_26);
        loader = new StringTemplateLoader();
        configuration.setTemplateLoader(loader);
    }

    public void addTemplate(String name, String template) {
        loader.putTemplate(name, template);
    }

    public String exec(String name, Object model) throws IOException, TemplateException {
        Template template = configuration.getTemplate(name);
        StringWriter writer = new StringWriter();
        template.process(model, writer);
        return writer.toString();
    }

    public static void main(String[] args) throws IOException, TemplateException {
        Freemarker f = new Freemarker();
        f.addTemplate("a1", "pero ${data}");
        Map<String, Object> model = new HashMap<>();
        model.put("data", "janko ss");
        
        String result = f.exec("a1", model);
        System.out.println(result);
    }

}
