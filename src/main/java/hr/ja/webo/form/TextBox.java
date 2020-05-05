package hr.ja.webo.form;

import lombok.Data;

//@FieldNameConstants
@Data
public class TextBox implements FormField {

    private String label;

    private String helpText;

    private String name;


}
