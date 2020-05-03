package hr.ja.webo.widget;

import java.util.function.Function;

public abstract class  Widget {
    public void onClick(Function<Event,EventResult> function) {
    }
}
