package hr.ja.webo.widget;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
public class Label extends Widget {

    private String text;


    public String toString() {
        return text;
    }


}