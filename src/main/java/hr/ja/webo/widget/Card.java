package hr.ja.webo.widget;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.RandomUtils;

import java.util.function.Function;

@Getter
@Setter
public class Card extends Widget {

    private Widget body;
    private Widget header;
    private Widget footer;
    private String html;
    private Integer id;

    public Card() {
        //language=InjectedFreeMarker
        html = """
                 <script>
                 class User {
                    constructor(props) {
                    }
                 }
                    $("#${id}").on('click', function() {
                        console.log('dela');
                    });
                 </script>
                 <div class="card card-primary card-outline" id='${id}'>
                     <div class="card-header">
                         <h5 class="m-0">%s</h5>
                     </div>
                     <div class="card-body">%s</div>
                     <div class="card-footer">%s
                     </div>
                 </div>               
                """;
    }


    @Override
    public void onClick(Function<Event, EventResult> function) {

    }

    @Override
    public String toString() {
        id = RandomUtils.nextInt();
        return html;
    }
}
