package hr.ja.webo.widget;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Label extends Widget {

    private String text;


    @Override
    public String html()
    {
        return "nije pero " + text;
    }
}