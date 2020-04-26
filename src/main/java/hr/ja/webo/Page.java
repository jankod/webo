package hr.ja.webo;

import hr.ja.webo.widget.Widget;
import lombok.Getter;
import lombok.Setter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public abstract class Page {

    private String title = "[No title]";

    private List<Widget> widgets = new ArrayList<>();

    public void add(Widget widget) {
        this.widgets.add(widget);
    }

    public String html() {
        String html = widgets.stream().map(w -> w.html() + "\n").collect(Collectors.joining());
        return html;
    }
    public abstract void render(HttpServletRequest req, HttpServletResponse resp);

//    public String render(Request req, Response res) {
//        return widgets.stream().map(w -> w.html()).collect(Collectors.joining());
//    }
}
